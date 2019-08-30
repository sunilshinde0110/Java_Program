import java.util.Scanner;

public class SumProductMinMax3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1,num2,num3;
        int sum,product,Min,Max;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        sum = num1 + num2 + num3;
        product = num1 * num2 * num3;

        Max = num1;
        Min = num1;

        if(num2 > Max)
            Max = num2;

        if(num3 > Max)
            Max = num3;

        if(num2 < Min)
            Min = num2;

        if (num3 < Min)
            Min = num3;

        System.out.println("The sum is " + sum);

        System.out.println("The product is " + product);

        System.out.println("Max of three integers is " + Max + " and the Min is "+ Min + ".");
    }
}
