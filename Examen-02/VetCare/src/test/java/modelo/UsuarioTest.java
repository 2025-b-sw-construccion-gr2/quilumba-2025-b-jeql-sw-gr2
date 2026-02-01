package modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioTest {

    private Usuario usuario;

    @BeforeEach
    void setUp() {
        usuario = new Usuario();
    }

    @Test
    void testSetAndGetUsuario() {
        String nombreUsuario = "testuser";
        usuario.setUsuario(nombreUsuario);
        assertEquals(nombreUsuario, usuario.getUsuario());
    }

    @Test
    void testSetAndGetClave() {
        String clave = "password123";
        usuario.setClave(clave);
        assertEquals(clave, usuario.getClave());
    }

    @Test
    void testSetAndGetCedula() {
        String cedula = "1234567890";
        usuario.setCedula(cedula);
        assertEquals(cedula, usuario.getCedula());
    }

    @Test
    void testSetAndGetNombre() {
        String nombre = "Juan";
        usuario.setNombre(nombre);
        assertEquals(nombre, usuario.getNombre());
    }

    @Test
    void testSetAndGetApellido() {
        String apellido = "Perez";
        usuario.setApellido(apellido);
        assertEquals(apellido, usuario.getApellido());
    }

    @Test
    void testUsuarioNotNull() {
        assertNotNull(usuario);
    }

    @Test
    void testEstadoDefaultValue() {
        assertEquals("ACTIVO", usuario.getEstado());
    }

    @Test
    void testGetRol() {
        String rol = usuario.getRol();
        assertEquals("Usuario", rol);
    }
}
