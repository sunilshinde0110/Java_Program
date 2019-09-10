
public class StringDemo2 {

	public static void main(String[] args) {

		String s1="JAVA";
		//String s1=new String("JAVA");
		System.out.println("The String 1 Is:"+s1+" And There Hashcode Is:"+s1.hashCode());
		
		//String s2=new String("JAVA");
		String s2="JAVA";
		System.out.println("The String 2 Is:"+s2+" And There Hashcode Is:"+s2.hashCode());
		
		if(s1==s2) {
			
			System.out.println("String 1 And 2 Are Equals");
		}

	}

}
