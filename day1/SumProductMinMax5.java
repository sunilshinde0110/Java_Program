
import java.util.Scanner;

public class SumProductMinMax5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1,num2,num3,num4,num5;
        int sum,product,Min,Max;

        System.out.print("Enter First Integer: ");
        num1 = input.nextInt();

        System.out.print("Enter Second Integer: ");
        num2 = input.nextInt();

        System.out.print("Enter Third Integer: ");
        num3 = input.nextInt();

        System.out.print("Enter Foruth Integer: ");
        num4 = input.nextInt();
        
        System.out.print("Enter Fifth Integer: ");
        num5 = input.nextInt();
        
        sum = num1 + num2 + num3 + num4 + num5;
        product = num1 * num2 * num3 * num4 * num5;

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
        
        if(num4 > Max)
            Max = num4;
        
        if(num5 > Max)
            Max = num5;
        
        if(num4 < Min)
            Min = num4;
        
        if(num5 < Min)
            Min = num5;

        System.out.println("The sum is " + sum);

        System.out.println("The product is " + product);

        System.out.println("Max of Five integers is " + Max + " and the Min is "+ Min + ".");
    }
}
