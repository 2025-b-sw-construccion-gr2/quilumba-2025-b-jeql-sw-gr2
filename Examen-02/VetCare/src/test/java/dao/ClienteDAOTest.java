package dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ClienteDAOTest {

    @Test
    void testClienteDAOIsInterface() {
        assertTrue(ClienteDAO.class.isInterface());
    }

    @Test
    void testClienteDAOExtendsGenericDAO() {
        Class<?>[] interfaces = ClienteDAO.class.getInterfaces();
        boolean extendsGenericDAO = false;
        for (Class<?> iface : interfaces) {
            if (iface.getSimpleName().equals("GenericDAO")) {
                extendsGenericDAO = true;
                break;
            }
        }
        assertTrue(extendsGenericDAO);
    }

    @Test
    void testClienteDAONotNull() {
        assertNotNull(ClienteDAO.class);
    }
}
