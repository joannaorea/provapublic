package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(8, calc.sumar(5, 3));
    }
    
    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(2, calc.restar(5, 3));
    }
}