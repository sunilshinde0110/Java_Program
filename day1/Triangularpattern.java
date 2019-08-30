package com.jbexercise;

public class Triangularpattern {
    public static void main(String[] args) {
        Triangularpattern triangularpattern = new Triangularpattern();
        triangularpattern.printATriangularpattern(4);
        System.out.println("_______________________");
        triangularpattern.printBTriangularpattern(4);
        System.out.println("_______________________");
        triangularpattern.printCTriangularpattern(4);
        System.out.println("_______________________");
        triangularpattern.printDTriangularpattern(4);

    }

    private void printATriangularpattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private void printBTriangularpattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    private void printCTriangularpattern(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = size; j >= 1; j--) {
                if (i >= j) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private void printDTriangularpattern(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = size - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
