"""Calculadora Modular con Submódulos de Git
"""

import sys # sys.path: Lista de directorios donde Python busca módulos para importar
import os # sys.path.insert(0, ruta): Agrega una ruta al inicio de la lista de búsqueda

# Esto permite importar módulos desde directorios personalizados

# Agregar la carpeta 'Suma' (submódulo) al path de Python
sys.path.insert(0, os.path.join(os.path.dirname(__file__), 'Suma'))

# Agregar la carpeta 'Resta' (submódulo) al path de Python
sys.path.insert(0, os.path.join(os.path.dirname(__file__), 'Resta'))


from suma import suma
from resta import resta

def calculadora():

    print("\n" + "="*50)
    print("  CALCULADORA MODULAR - Usando Submódulos Git")
    print("="*50)
    
    while True:
        # Mostrar mnú de opciones
        print("\n1. Sumar  |  2. Restar  |  3. Salir")
        opcion = input("Seleccione una opción: ").strip()
        
        if opcion == '3':
            print("\n¡Hasta luego!")
            break
        
        if opcion not in ['1', '2']:
            print("⚠️  Opción inválida")
            continue
        
        try:
            # Solicitar números al usuario
            a = float(input("Primer número: "))
            b = float(input("Segundo número: "))
            
            if opcion == '1':
                # Llamar a la función sumar() del submódulo Suma
                resultado = suma(a, b)
                print(f"✓ Resultado: {a} + {b} = {resultado}")
            else:
                # Llamar a la función restar() del submódulo Resta
                resultado = resta(a, b)
                print(f"✓ Resultado: {a} - {b} = {resultado}")
                
        except ValueError:
            # Manejo de errores si el usuario no ingresa números válidos
            print("⚠️  Por favor ingrese números válidos")

# Punto de entrada del programa
if __name__ == "__main__":
    calculadora()