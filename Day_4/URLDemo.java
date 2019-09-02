

import java.net.*;
import java.io.*;

public class URLDemo {

   public static void main(String[] args)
   {
      
         URL url,url1,url2;
		try {
			url = new URL("https://www.yash.com/index.jsp");
			url1 = new URL("https://www.yash.com/employees/salary.xhtml");
			url2 = new URL("https://www.yash.com/searchdata.jsp");
      
         String s = url.getPath();
         String s1=url1.getPath();
         String s3 = url2.getPath();
         
         
         String s2 = s.substring(0,s.lastIndexOf("."));
         s2=s2.substring(s2.lastIndexOf('/')+1).trim();
         System.out.println(s2);
         
         
         String s4="";
         s4 = s1.substring(0,s1.lastIndexOf("."));
        // System.out.println(s2);
         s4=s4.substring(s4.lastIndexOf('/')+1).trim();
         System.out.println(s4);

         String s5="";
         s5 = s3.substring(0,s3.lastIndexOf("."));
         s5=s5.substring(s5.lastIndexOf('/')+1).trim();
         System.out.println(s5);

         
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
      
   }

@Override
public String toString() {
	return "URLDemo []";
}

}
