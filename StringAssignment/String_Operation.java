
public class String_Operation {

	public static void main(String[] args) {

		String s=new String("JAVA");
		System.out.println(s.charAt(3));
		System.out.println(s.codePointAt(0));
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(2, 3));
		
		String s1="java";
		String s2="JAVA";
		System.out.println(s.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s));
		
		System.out.println(s.concat(s1));
		
		System.out.println(s.contains(s1));
		System.out.println(s.contains(s2));
		System.out.println(s.contains("j"));
		System.out.println(s.contains("A"));
		
		System.out.println(s.endsWith("v"));
		System.out.println(s.endsWith("A"));
		
		
		/*Check The Case Sensetive funtion*/
		if(s.equals(s1)) {
			System.out.println("String S And S1 Are Equals");
		}
		else {
			System.out.println("String S And S1 Are Not Equals");
		}
		
		/*Ignore Case Sensetive funtion*/
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("String S And S1 Are Equals");
		}
		else {
			System.out.println("String S And S1 Are Not Equals");
		}
		
		System.out.println(s.hashCode());
		
		System.out.println(s.indexOf("V"));
		
		System.out.println(s.length());
		
		String s3="";
		System.out.println(s.isEmpty());
		System.out.println(s3.isEmpty());
		
		System.out.println(s.trim()+s2);
		System.out.println(s.trim()+" JDBC");
		
		System.out.println(s.replace("A", "O"));
		
		System.out.println(s.replaceAll("JAVA", "OOPs"));
		System.out.println(s.replaceAll("java", "OOPs"));
		
		System.out.println(s.lastIndexOf("J"));
		
		System.out.println(s.substring(1));
		System.out.println(s.substring(1, 3));
	}

}
