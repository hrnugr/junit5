package com.harunugur;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Basic Calculator Test")
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    @DisplayName("Adding Two Numbers Test")
    public void add() {
        assertEquals(2, calculator.add(1,1));
    }

    @Fast  //Customize Tag annotation
    @Test
    @DisplayName("😱")
    public void fast(){
        System.out.println("**** FAST ***");
    }

    @FastTest
    public void fastTest() {
        assertEquals(2, calculator.add(1,1));
    }
}
