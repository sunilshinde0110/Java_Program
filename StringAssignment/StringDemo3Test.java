import java.util.Scanner;

public class StringDemo3Test {

	public static void main(String[] args) {

		StringDemo3 sd=new StringDemo3("Java");
		System.out.println(sd);
		System.out.println("Enter The String");		
		Scanner sc=new Scanner(System.in);
		sd.getRequiredData(sc.nextLine());
	
	}

}
