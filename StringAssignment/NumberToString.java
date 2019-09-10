import java.util.Scanner;

public class NumberToString {
	
	private double d;
	
	public String numberOutputInString() {
		System.out.println("Enter The Number:");
		Scanner sc=new Scanner(System.in);
		d=sc.nextDouble();
		int i=(int) d;
		String s1=Integer.toString(i);
		
		return ""+s1.charAt(s1.length()-2)+s1.charAt(s1.length()-1);
		
	}

	public static void main(String[] args) {

		NumberToString n=new NumberToString();
		System.out.println(n.numberOutputInString());
	}


}
