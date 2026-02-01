# Tests del Proyecto VetCare

Esta carpeta contiene referencias a los tests unitarios del proyecto.

## Ubicación de Tests

Los tests unitarios se encuentran en: `src/test/java/`

## Estructura de Tests

```
src/test/java/
├── controlador/
│   └── ControlAutenticacionTest.java
├── dao/
│   ├── ClienteDAOTest.java
│   ├── MascotaDAOTest.java
│   └── VeterinarioDAOTest.java
└── modelo/
    └── UsuarioTest.java
```

## Ejecutar Tests

```bash
# Ejecutar todos los tests
mvn test

# Ver reporte de cobertura
mvn jacoco:report
```

## Cobertura

- **Herramienta**: JaCoCo
- **Cobertura mínima**: 30%
- **Reporte**: `target/site/jacoco/index.html`

## Tests Implementados

### Modelo
- `UsuarioTest`: Valida getters y setters de Usuario

### DAO
- `ClienteDAOTest`: Verifica existencia de métodos DAO
- `MascotaDAOTest`: Incluye test para `buscarPorEspecie()`
- `VeterinarioDAOTest`: Valida operaciones CRUD

### Controladores
- `ControlAutenticacionTest`: Verifica lógica de autenticación

---

**Nota**: Los tests se ejecutan automáticamente en el pipeline CI/CD de GitHub Actions.
