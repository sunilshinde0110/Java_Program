package com.jbexercise;

/**
 * Compute the sum and average of running integers from
 * a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {

    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 4;

        SumAverageRunningInt sumAverageRunningInt = new SumAverageRunningInt();
        sumAverageRunningInt.printSumAverageUsingForLoop(lowerbound, upperbound);
        sumAverageRunningInt.printSumAverageUsingWhile(lowerbound,upperbound);
        sumAverageRunningInt.printSumAverageUsingDoWhile(lowerbound,upperbound);
        sumAverageRunningInt.printSumOfSquares(1,4);
    }

    private void printSumAverageUsingForLoop(int lowerbound, int upperbound) {
        int sum = 0;
        int count = 0;
        for (int i = lowerbound; i <= upperbound; i++) {
            sum += i;
            count++;
        }
        System.out.println("FOR LOOP: Sum=" + sum + ",Average=" + (double) sum / count);
    }

    private void printSumAverageUsingWhile(int lowerbound, int upperbound) {
        int sum = 0;
        int count = 0;
        while (lowerbound <= upperbound) {
            sum += lowerbound;
            lowerbound++;
            count++;
        }
        System.out.println("WHILE-DO LOOP: Sum=" + sum + ",Average=" + (double) sum / count);
    }

    private void printSumAverageUsingDoWhile(int lowerbound, int upperbound) {
        int sum = 0;
        int count = 0;
        do {
            sum += lowerbound;
            lowerbound++;
            count++;
        } while (lowerbound <= upperbound);
        System.out.println("DO-WHILE LOOP: Sum=" + sum + ",Average=" + (double) sum / count);
    }

    private void printSumOfSquares(int lowerbound, int upperbound) {
        int sum = 0;
        while (lowerbound <= upperbound) {
            sum += ( lowerbound * lowerbound);
            lowerbound++;
        }
        System.out.println("sum of squares=" +sum);
    }

}
