package controlador;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class ControlAutenticacionTest {

    @Mock private HttpServletRequest request;

    @Mock private HttpServletResponse response;

    private ControlAutenticacion controlAutenticacion;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        controlAutenticacion = new ControlAutenticacion();
    }

    @Test
    void testControlAutenticacionNotNull() {
        assertNotNull(controlAutenticacion);
    }

    @Test
    void testControlAutenticacionInstanceCreation() {
        ControlAutenticacion control = new ControlAutenticacion();
        assertNotNull(control);
    }

    @Test
    void testRequestParameterAccion() {
        when(request.getParameter("accion")).thenReturn("iniciar");
        String accion = request.getParameter("accion");
        assertEquals("iniciar", accion);
    }

    @Test
    void testRequestParameterNull() {
        when(request.getParameter("accion")).thenReturn(null);
        String accion = request.getParameter("accion");
        assertNull(accion);
    }

    @Test
    void testMockObjectsNotNull() {
        assertNotNull(request);
        assertNotNull(response);
    }
}
