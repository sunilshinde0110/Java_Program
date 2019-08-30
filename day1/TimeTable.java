package com.jbexercise;

public class TimeTable {
    public static void main(String[] args) {
        TimeTable timeTable = new TimeTable();
        timeTable.printTimeTable(10);
    }

    private void printTimeTable(int size) {
        for(int i = -1; i <= size; i++)
        {
            if (i == -1) {
                System.out.print("\t|");
            }
            else if (i == 0) {
                System.out.print("------------");
            }
            else if (i > 0) {
                System.out.printf("%1$d\t|", i);
            }

            for(int j = 1; j <= size; j++)
            {
                if (i == -1) {
                    System.out.printf("\t%1$d", j);
                    continue;
                }
                else if (i == 0) {
                    System.out.print("----");
                    continue;
                }

                System.out.printf("\t%1$d", i * j);
            }
            System.out.println();
        }
    }
}
