package com.jbexercise;

/**
 * Write a program called PrintDayInWord which prints
 * “Sunday”, “Monday”, ... “Saturday” if the int variable
 * "dayNumber" is 0, 1, ..., 6, respectively.
 * Otherwise, it shall print "Not a valid day".
 * Use (a) a "nested-if" statement; (b) a "switch-case-default" statement.
 */
public class PrintDayInWord {
    public static void main(String[] args) {
        int dayNumber = 5;

        //using nested if
        if (dayNumber == 0) {
            System.out.println("SUNDAY");
        } else if (dayNumber == 1) {
            System.out.println("MONDAY");
        }else if (dayNumber == 2) {
            System.out.println("TUESAY");
        }else if (dayNumber == 3) {
            System.out.println("WEDENSDAY");
        }else if (dayNumber == 4) {
            System.out.println("THURSDAY");
        }else if (dayNumber == 5) {
            System.out.println("FRIDAY");
        }else if (dayNumber == 6) {
            System.out.println("SATURDAY");
        }else {
            System.out.println("NOT A VALID DAY");
        }

        //using switch
        switch (dayNumber) {
            case 0:
                System.out.println("SUNDAY"); break;
            case 1:
                System.out.println("MONDAY"); break;
            case 2:
                System.out.println("TUESDAY"); break;
            case 3:
                System.out.println("WEDENSDAY"); break;
            case 4:
                System.out.println("THURSDAY"); break;
            case 5:
                System.out.println("FRIDAY"); break;
            case 6:
                System.out.println("SATURDAY"); break;
            default:
                System.out.println("NOT A VALID DAY");
        }

    }
}
