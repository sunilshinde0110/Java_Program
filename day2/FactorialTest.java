package com.yash.test;

import org.junit.Test;

import com.yash.java.FactorialDemo;

import static org.junit.Assert.*;

import java.util.Scanner;

public class FactorialTest {
    @Test
    public void FactorialZero() {
        FactorialDemo f = new FactorialDemo();
        int expected = 1;
        int actual = f.fact(0);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialOne() {
        FactorialDemo f = new FactorialDemo();
        int expected = 1;
        int actual = f.fact(1);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialTwo() {
        FactorialDemo f = new FactorialDemo();
        int expected = 2;
        int actual = f.fact(2);
        assertEquals(expected, actual);
    }


    @Test
    public void factorialFive() {
        FactorialDemo f = new FactorialDemo();
        int expected = 120;
        Scanner s = new Scanner(System.in);
        int actual;
        System.out.println("Enter the number:");
        actual=s.nextInt();
        actual = f.fact(actual);
        System.out.println("factorial is :"+actual);
        assertEquals(expected, actual);
    }


}