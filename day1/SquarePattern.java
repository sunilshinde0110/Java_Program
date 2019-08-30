package com.jbexercise;

public class SquarePattern {
    public static void main(String[] args) {
        SquarePattern squarePattern = new SquarePattern();
        squarePattern.printHashpattern(4,4);
    }

    private void printHashpattern(int rowSize, int columnSize) {
        for (int row = 0; row < rowSize; row++) {
            for (int column = 0; column < columnSize; column++) {
                if (row % 2 != 0 && column == 0) {
                    System.out.print(" ");
                }
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
