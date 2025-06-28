package com.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest 
{
   private Calculator calculator;
   @BeforeEach
   public void setup(){
    calculator = new Calculator();
    System.out.println("Setup executed");
   }

   @AfterEach
   public void tearDown(){
    calculator = null;
    System.out.println("Teardown executed");
   }
    @Test
    public void addTest()
    {
        int a = 10;
        int b = 20;
        int result = calculator.add(a, b);

        assertEquals(30, result);
    }
    @Test
    public void subtractTest()
    {
        int a = 15;
        int b = 5;
        int result = calculator.subtract(a, b);

        assertEquals(10, result);
    }
}
