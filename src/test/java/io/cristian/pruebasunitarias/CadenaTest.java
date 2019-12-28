package io.cristian.pruebasunitarias;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CadenaTest {
    private Cadena cadena;
    @Before
    public void setUp() throws Exception {
        cadena = new Cadena();
    }

    @Test
    public void concatenar() {
        String esperado = "Cristian gil";
        Assert.assertEquals("no es el resultado esperado",esperado,cadena.concatenar("Cristian", "gil"));
    }
}