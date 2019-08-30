package com.jbexercise;

/**
 * Write a program called CheckOddEven
 * which prints "Odd Number" if the int variable “number” is odd,
 * or “Even Number” otherwise.
 * The program shall always print “bye!” before exiting.
 */
public class CheckOddEven {
    public static void main(String[] args) {
        int number = 49;

        System.out.println("The number is:" + number);

        if (number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println("bye!");
    }
}
