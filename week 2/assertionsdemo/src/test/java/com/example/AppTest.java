package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest{
    @Test
    public void test(){
        assertEquals(5, 2+3, "2+3 should be equal to 5");

        assertTrue(5>3, "5 should be greater than 3");

        assertFalse(5<3, "5 is not less than 3");
         
        String s = null;
         assertNull(s, "s should be null");

        String name = "Cognizant";
        assertNotNull(name, "name should not be null");
    }
}
