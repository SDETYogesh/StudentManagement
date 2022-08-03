package org.tyss.sms.testng_practice;
import java.io.IOException;
import java.net.URL;

public class Networking {
	public class Networking002 {

		public void main(String[] args) {
			// TODO Auto-generated method stub
	

		}

	}

	public static void main(String[] args) throws IOException {
	URL obj = new URL("https://github.com/");
	System.out.println(obj.getProtocol());
	System.out.println(obj.getHost());
	System.out.println(obj.getContent());
	
	}

}
