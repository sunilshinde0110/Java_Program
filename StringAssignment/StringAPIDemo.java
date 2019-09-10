
public class StringAPIDemo {

	public static void main(String[] args) {

		String s="JAVA";
		System.out.println(s.charAt(2));
		
		String s1=new String("Wel-Come To ");
		System.out.println(s1.concat(s));
		
		System.out.println(s.endsWith("A"));
		System.out.println(s1.endsWith("Q"));
	
		String s2="JAVA";
		String s3="java";
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.equals(s3));
		
		System.out.println(s.equalsIgnoreCase(s3));
		
		System.out.println(s.equalsIgnoreCase(s1));
		
		System.out.println(s1.indexOf("To"));
		
		String s4=new String("hello");
		String s5="hello";
		String s6=s4.intern();
		System.out.println(s6);
		System.out.println(s4==s5);
		
		System.out.println(s4.lastIndexOf('l'));
		int in=s4.lastIndexOf("el");
		System.out.println(in);
		System.out.println(s4.lastIndexOf("lo", 5));
		System.out.println(s4.lastIndexOf("lo", 0));
		
		System.out.println(s1.length());
		
		System.out.println(s4.replace('l', 'o'));
		
		System.out.println(s1.replace("To", "Home"));
		
		String[] n=s1.split("\\s");
		for(String n1:n) {
		System.out.println(n1);
		}

		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 3));
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s1.trim()+"Java");
		
		int i=10;
		String s7=String.valueOf(i);
		System.out.println(s7);

	}

}
