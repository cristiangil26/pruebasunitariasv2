package io.cristian.pruebasunitarias;

;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {
    private Operaciones op;
    @Before
    public void setup(){
        op = new Operaciones();
    }
    @Test
    public void sumaTest(){
        Assert.assertEquals("la suma es igual",11,op.sumar(5,6));
    }
    @Test
    public void restaTest(){
        Assert.assertEquals(2,op.restar(4,2));
    }

    @Test
    public void multiplicarTest(){
        Assert.assertEquals(8,op.multiplicar(4,2));
    }

    @Test
    public void dividirTest(){
        Assert.assertEquals(2,op.dividir(4,2));
    }
}
