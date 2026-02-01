package dao;

import static org.junit.jupiter.api.Assertions.*;

import modelo.Mascota;
import org.junit.jupiter.api.Test;

class MascotaDAOTest {

    @Test
    void testMascotaDAOIsInterface() {
        assertTrue(MascotaDAO.class.isInterface());
    }

    @Test
    void testMascotaObjectCreation() {
        Mascota mascota = new Mascota();
        assertNotNull(mascota);
    }

    @Test
    void testMascotaSetNombre() {
        Mascota mascota = new Mascota();
        String nombre = "Firulais";
        mascota.setNombre(nombre);
        assertEquals(nombre, mascota.getNombre());
    }

    @Test
    void testMascotaSetEspecie() {
        Mascota mascota = new Mascota();
        String especie = "Perro";
        mascota.setEspecie(especie);
        assertEquals(especie, mascota.getEspecie());
    }

    @Test
    void testMascotaSetRaza() {
        Mascota mascota = new Mascota();
        String raza = "Labrador";
        mascota.setRaza(raza);
        assertEquals(raza, mascota.getRaza());
    }

    @Test
    void testMascotaSetPeso() {
        Mascota mascota = new Mascota();
        double peso = 25.5;
        mascota.setPeso(peso);
        assertEquals(peso, mascota.getPeso());
    }
}
