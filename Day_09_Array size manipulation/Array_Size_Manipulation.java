package com.nike;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * This program demonstrates the use of in-house code to manipulate the
 * size of the array. One can add x number of integers values at first.
 * [To increase the size of the array, call fillArray method which has
 * two different types of number of parameters. First method takes only
 * one integer array, and another three parameters.]
 * [copyArray method can be used to copy any Object type of array.
 * Don't forget to cast to that particular type when calling this method]
 * @version 1.8.0_221 13-09-2019
 * @author Nike
 */
public class Array_Size_Manipulation {
    public static void main(String[] args) {
        char choice;
        Scanner keyboard = new Scanner(System.in);
        int[] someArray;
        System.out.print("Enter number of elements you want to store: ");
        int size = keyboard.nextInt();
        someArray = new int[size];

        do {
            System.out.println();
            System.out.println("[1] Enter Values");
            System.out.println("[2] Display Array");
            System.out.println("[3] Enter New Size");
            System.out.println("[4] Exit");
            System.out.print("Choice: ");
            choice = keyboard.next().charAt(0);
            System.out.println();
            /**
             * Switch Loop
             * [1] Enter Values
             * [2] Display Array
             * [3] Enter New Size
             * [4] Exit
             */
            switch (choice) {
                case '1':
                    fillArray(someArray);
                    break;
                case '2':
                    System.out.println("Array Values");
                    displayArray(someArray);
                    break;
                case '3':
                    int[] newArray;
                    System.out.print("New Size:");
                    int newLength = keyboard.nextInt();
                    System.out.println("[Enter further values]");
                    newArray = (int[]) copyArray(someArray, newLength);
                    fillArray(someArray, newArray, newLength);
                    someArray = newArray;
                    break;
            }
        } while (choice != '4');
        System.out.println("Good Bye !  !  !");
        //end of psvm
    }

    /**
     * Fills the array with integer numbers.
     * @param arrayIn input array to be filled.
     */
    static void fillArray(int[] arrayIn) {
        Scanner keyboard = new Scanner(System.in);
        for (int startIndex = 0; startIndex < arrayIn.length; startIndex++) {
            System.out.print("Enter Value:");
            arrayIn[startIndex] = keyboard.nextInt();
        }
    }

    /**
     * This method fills the remaining default array of oldArray
     * @param oldArray previous array
     * @param arrayIn input array to be filled.
     * @param newLength new length to be taken from switch statement #3
     */
    static void fillArray(int[] oldArray, int[] arrayIn, int newLength) {
        Scanner keyboard = new Scanner(System.in);
        for (int startIndex = oldArray.length ; startIndex < newLength; startIndex++) {
            System.out.print("Enter Value: ");
            arrayIn[startIndex] = keyboard.nextInt();
        }
    }

    /**
     * Displays the array. It uses classical for loop.
     * one can also use foreach loop.
     * @param arrayIn input int array to be passed
     */
    static void displayArray(int[] arrayIn) {
        System.out.println();
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.println("array[" + i + "] : " + arrayIn[i]);
        }
    }

    /**
     * This method grows an array by allocating a new array of the same type of
     * elements
     * @param aObject array to be increased in size. This can be object array or
     *                primitive type array
     * @param newLength returns an increased array containing all elements of aObject
     * @return
     */
    static Object copyArray(Object aObject, int newLength) {
        Class aClass = aObject.getClass();
        if (!aClass.isArray()) return null;
        Class componentType = aClass.getComponentType();
        int length = Array.getLength(aObject);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(aObject, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}