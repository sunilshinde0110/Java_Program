
public class StringDemo3 {
	
	String s;

	public String getS() {
		return s;
	}
	
	

	@Override
	public String toString() {
		return  s ;
	}



	public void setS(String s) {
		this.s = s;
	}
	
	public StringDemo3(String s1) {
		
		this.s=s1;
	}
	
	public void getRequiredData(String input) {
		
		if(input.isEmpty())
		{
			System.out.println("There Is No String");
		}
		else
		{
			System.out.println("Entered String is:"+input);
		}
		
	}


}
