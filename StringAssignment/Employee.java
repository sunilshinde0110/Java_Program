import java.util.Scanner;

public class Employee {

	String firstName,lastName,company,role;
	
	public String generatePassword() {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Name:");
		String s=sc.nextLine();
		
		System.out.println("Enter The Last Name:");
		String s1=sc.nextLine();
		
		System.out.println("Enter The Company Name");
		String s2=sc.nextLine();
		
		System.out.println("Enter The Role");
		String s3=sc.nextLine();
		
		String s4=s.substring(0, 2);
		String s5=s1.substring(0, 2);
		String s6=s2.substring(0, 2);
		String s7=s3.substring(0, 2);
		
		return s4+s5+s6+s7;

}
}