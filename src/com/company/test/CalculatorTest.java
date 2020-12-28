package com.company.test;

import com.company.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testPlus( ) {

        assertEquals(20,calculator.calculator(15,"+",5), "Error in ADD");
        assertEquals(5,calculator.calculator(5,"+",0), "Error in ADD");
        assertEquals(20,calculator.calculator(-5,"+",25), "Error in ADD");
        assertEquals(50,calculator.calculator(15,"+",35), "Error in ADD");

    }

    @Test
    public void test_Minus() {

        assertEquals(10,calculator.calculator(15,"-",5), "Error in MINUS");
        assertEquals(5,calculator.calculator(5,"-",0), "Error in MINUS");
        assertEquals(-30,calculator.calculator(-5,"-",25), "Error in MINUS");
        assertEquals(-20,calculator.calculator(15,"-",35), "Error in MINUS");
    }

    @Test
    public void test_Multiply() {

        assertEquals(75,calculator.calculator(15,"*",5), "Error in MULTIPLY");
        assertEquals(0,calculator.calculator(5,"*",0), "Error in MULTIPLY");
        assertEquals(-125,calculator.calculator(-5,"*",25), "Error in MULTIPLY");
        assertEquals(90,calculator.calculator(15,"*",6), "Error in MULTIPLY");
    }

    @Test
    public void test_Divide() {
        assertEquals(3,calculator.calculator(15,"/",5), "Error in DIVIDE");
        assertEquals(5,calculator.calculator(5,"/",1), "Error in DIVIDE");
        assertEquals(-5,calculator.calculator(-25,"/",5), "Error in DIVIDE");
        assertEquals(15,calculator.calculator(75,"/",5), "Error in DIVIDE");
    }

    /*@Test
    public void getArithmeticException () {

        assertThrows(IllegalArgumentException.class, () -> {
           calculator.calculator(15, "/", 0);
        }, " Can not divide by zero");
    }*/

}



