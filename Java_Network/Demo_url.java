package network;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo_url {
	
	public static void main(String args[]){
		
		try {
			URL u1=new URL("https://www.google.com/");
			
			System.out.println("Protocol of +u1 website is "+u1.getProtocol());
			System.out.println("Host of +u1 website is "+u1.getHost());
			System.out.println("File of +u1 website is "+u1.getFile());
			System.out.println("Port of +u1 website is "+u1.getPort());
			System.out.println("Default port of +u1 website is "+u1.getDefaultPort());
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
