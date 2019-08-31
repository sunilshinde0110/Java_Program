package com.yash.java;

public class NumberOfEvenOdd {

    public String returnEvenOdd(int n) {
        int even_count = 0;
        int odd_count = 0;
        while (n > 0)
        {
            int rem = n % 10;
            if (rem % 2 == 0)
                even_count++;
            else
                odd_count++;
            n = n / 10;
        }
        return "Even:" + even_count + ",Odd:" + odd_count;
    }
}
