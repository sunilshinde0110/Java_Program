import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DuplicateCharacter {
	
	String s="";
	
	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}


	public String findDuplicateCharacter() throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s1=br.readLine();
		while(s1.length()>0)
		{
			int i=0;
			for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(0)==s1.charAt(j))
					i=i+1;
			}
			s=s+s1.charAt(0)+"="+i+"\n";
			String s2[]=s1.split(s1.charAt(0)+"");
			s1=new String("");
			for(int k=0;k<s2.length;k++)
				s1=s1+s2[k];
		}
	
		return s;
		
	}
	
	public static void main(String[] args) throws IOException {

		System.out.println("Enter The String:");
		DuplicateCharacter d=new DuplicateCharacter();
		System.out.println(d.findDuplicateCharacter());
	}



}
