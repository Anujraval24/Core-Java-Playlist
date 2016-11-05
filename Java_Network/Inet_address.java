package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Inet_address {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InetAddress ip1;
		try {
			ip1 = InetAddress.getByName("www.javatpoint.com");
			System.out.println(ip1.getHostAddress());
			System.out.println(ip1.getHostName());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		InetAddress ip2;
		try {
			ip2 = InetAddress.getByName("https://www.youtube.com/");
			System.out.println(ip2.getHostAddress());
			System.out.println(ip2.getHostName());


		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		InetAddress ip3;
		try {
			ip3 = InetAddress.getByName("https://mail.google.com/mail/u/0/");

			System.out.println(ip3.getHostAddress());
			System.out.println(ip3.getHostName());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		
	}
}