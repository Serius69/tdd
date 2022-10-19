package bo.edu.ucb.tdd;

import static org.junit.Assert.*;
import org.junit.*;
import org.junit.rules.ExpectedException;

public class CalculadoraTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

//    public void test() {
//        fail("Not yet implemented");
//    }
    @Test
    public void siCadenaVAicaReotrnaCero()  throws Exception{
        //1. PReparacion d ela prueba
        Calculadora c = new Calculadora();

        //2. Logica de la prueba
        String resultado=c.suma("");

        //3. Verificacion dela prueba
        assertEquals("0", resultado);
    }

//    public void test() {
//        fail("Not yet implemented");
//    }
//    caso de prueba 2
    @Test
    public void para2numerosRetornarSuma()  throws Exception{
        //1. PReparacion d ela prueba
        Calculadora c = new Calculadora();

        //2. Logica de la prueba
        String resultado=c.suma("2,3");

        //3. Verificacion dela prueba
        assertEquals("5", c.suma("2,3"));
        assertEquals("3", c.suma("0,3"));
        assertEquals("55", c.suma("44,11"));
        assertEquals("20", c.suma("10,10"));
    }

    //    caso de prueba 3
    @Test
    public void para3numerosRetornarSuma()  throws Exception{
        //1. PReparacion d ela prueba
        Calculadora c = new Calculadora();

        //2. Logica de la prueba
        String resultado=c.suma("2,3");

        //3. Verificacion dela prueba
        assertEquals("20", c.suma("2,3,5"));
        assertEquals("6", c.suma("0,3,0"));
    }
    //    caso de prueba 3
    @Test
    public void mayoresamil()  throws Exception{
        //1. PReparacion d ela prueba
        Calculadora c = new Calculadora();

        //2. Logica de la prueba
//        String resultado=c.suma("2,3");

        //3. Verificacion dela prueba
        assertEquals("10", c.suma("1001,10"));
    }
    //    caso de prueba 3
    @Test
    public void paraNegativosException()  throws Exception{
        //1. PReparacion d ela prueba
        Calculadora c = new Calculadora();

        //2. Logica de la prueba
//        String resultado=c.suma("2,3");

        //3. Verificacion dela prueba
        exception.expect(Exception.class);
        assertEquals("-10", c.suma("0,-10"));
    }

}

