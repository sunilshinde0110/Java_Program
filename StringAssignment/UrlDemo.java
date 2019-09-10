import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) throws MalformedURLException {

		
		URL ur1=new URL("https://www.yash.com/employees/showEmployeeForm.ds");
		URL ur2=new URL("https://www.yash.com/employees/salaries/generateSalary.htm");
		URL ur3=new URL("https://www.yash.com/facilities/acceptMeetingRequest.do");
		
		
		String[] s=ur1.getFile().split("employees");
		for(String s1:s) {
			String[]s2=s1.split("/");
			for(String s3:s2) {
				String[]s4=s3.split(".ds");
				for(String s5:s4) {
					System.out.print(s5);
				}
			}
		}
		
		String[] e=ur2.getFile().split("employees");
		for(String e1:e) {
			String[]e2=e1.split("/");
			for(String e3:e2) {
				String[]e4=e3.split("salaries");
				for(String e5:e4) {
					String[]e6=e5.split(".htm");
					for(String e7:e6) {
						System.out.println(e7);
					}
				}
			}
					
		}
		
		String[] u=ur3.getFile().split("facilities");
		for(String u1:u) {
			String[]u2=u1.split("/");
			for(String u3:u2) {
				String[]u4=u3.split(".do");
				for(String u5:u4) {
					System.out.print(u5);
				}
			}
		}

	}

}
