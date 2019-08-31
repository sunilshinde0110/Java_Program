package com.yash.test;

import com.yash.java.NumberOfEvenOdd;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfEvenOddTest {
    @Test
    public void evaluateEvenOddNumber() {
        NumberOfEvenOdd numberOfEvenOdd = new NumberOfEvenOdd();
        String string = numberOfEvenOdd.returnEvenOdd(1234567);
        System.out.println(string);
        assertEquals("Even:2,Odd:2", string);
    }
}
