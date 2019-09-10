import java.util.Scanner;

public class URLDemo1 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The URL:");
			
		String url=sc.nextLine();
		
		String[] e=url.split("www.yash.com");
		for(String e1:e) {
			String[]e2=e1.split("/");
			for(String e3:e2) {
				String[]e4=e3.split("employees");
				for(String e5:e4) {
					String[]e6=e5.split("facilities");
					for(String e7:e6) {
						String[]e8=e7.split("salaries");
						for(String e9:e8) {
							String[]e10=e9.split(".ds");
							for(String e11:e10) {
								String[]e12=e11.split(".htm");
								for(String e13:e12) {
									String[] e14=e13.split(".do");
									for(String e15:e14) {
										String[]e16=e15.split("https:");
										for(String e17:e16) {
											System.out.println(e17);
										}
									}
								}
							}
						}
						
					}
				}
			}
					
		}
		
	}

}
