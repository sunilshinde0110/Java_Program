package com.yash.java;

public class SumOfDigits {
    public int printSumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n/10;
        }
        System.out.println(sum);
        return sum;
    }
}
