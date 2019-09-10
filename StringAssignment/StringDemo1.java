
public class StringDemo1 {

	public static void main(String[] args) {

		
		String s=new String("Hello");
		System.out.println(s);
		System.out.println("The Hashcode of String 1 Is:"+s.hashCode());
		
		String s1=" Wel-Come To JAVA";
		System.out.println(s1);
		System.out.println("The Hashcode of String 2 Is:"+s1.hashCode());
		
		s+=s1;
		System.out.println(s);
	}

}
