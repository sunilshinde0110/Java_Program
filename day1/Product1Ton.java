package com.jbexercise;

public class Product1Ton {
    public static void main(String[] args) {
        int lowerbound;
        int upperbound;

        Product1Ton product1Ton = new Product1Ton();
        product1Ton.printProduct1Ton(1,11);
        product1Ton.printProduct1Ton(1,12);
        product1Ton.printProduct1Ton(1,13);
        product1Ton.printProduct1Ton(1,14);
    }

    private void printProduct1Ton(int lowerbound, int upperbound) {
        long product = 1L;
        for (int i = lowerbound; i <= upperbound; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}
