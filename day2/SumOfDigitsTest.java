package com.yash.test;

import com.yash.java.SumOfDigits;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsTest {
    @Test
    public void evaluateSumOfDigits() {
        SumOfDigits sumOfDigits = new SumOfDigits();
        int output = sumOfDigits.printSumOfDigits(1234);
        assertEquals(10, output);
    }
}
