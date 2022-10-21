package bo.edu.ucb.tdd;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class AscensorTest {
    @Rule
    public ExpectedException exception= ExpectedException.none();
    private Ascensor ascensor;
    @Before
    public void before() {
        ascensor =  new Ascensor();
    }
    @Test
    public void silaPersonaesunaSolalanzarException() throws Exception{
    //1. Preparacion de la prueba
        System.out.println("==================================== "+ascensor);
    //2. Logica de la prueba

    //3. Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.CrearPersona(1,4);
    }
    @Test
    public void sielPisoNoEstaenellimietelanzarException() throws Exception{
        //1. Preparacion de la prueba
        System.out.println("==================================== "+ascensor);
        //2. Logica de la prueba

        //3. Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.CrearPersona(1,8);
    }
    @Test
    public void sielpisoLlegadaesdistintoalpisoSalida() throws Exception{
        //1. Preparacion de la prueba
        System.out.println("==================================== "+ascensor);
        //2. Logica de la prueba
        String resultado = ascensor.CrearPersona(1,4);
        //3. Verificacion o Assert
        assertEquals("El ascensor sube",resultado);
    }
    @Test
    public void sielpisoSalidaesunolanzarException() throws Exception{
        //1. Preparacion de la prueba
        System.out.println("==================================== "+ascensor);
        //2. Logica de la prueba

        //3. Verificacion o Assert
        exception.expect(Exception.class);
        ascensor.CrearPersona(1,3);
    }


}
