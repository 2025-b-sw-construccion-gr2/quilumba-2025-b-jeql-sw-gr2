package dao;

import static org.junit.jupiter.api.Assertions.*;

import modelo.Veterinario;
import org.junit.jupiter.api.Test;

class VeterinarioDAOTest {

    @Test
    void testVeterinarioDAOIsInterface() {
        assertTrue(VeterinarioDAO.class.isInterface());
    }

    @Test
    void testVeterinarioObjectCreation() {
        Veterinario veterinario = new Veterinario();
        assertNotNull(veterinario);
    }

    @Test
    void testVeterinarioSetCedula() {
        Veterinario veterinario = new Veterinario();
        String cedula = "1234567890";
        veterinario.setCedula(cedula);
        assertEquals(cedula, veterinario.getCedula());
    }

    @Test
    void testVeterinarioSetNombre() {
        Veterinario veterinario = new Veterinario();
        String nombre = "Juan";
        veterinario.setNombre(nombre);
        assertEquals(nombre, veterinario.getNombre());
    }

    @Test
    void testVeterinarioGetRol() {
        Veterinario veterinario = new Veterinario();
        assertEquals("Veterinario", veterinario.getRol());
    }
}
