package network;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class Demo_url_conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try{  
	    URL u2=new URL("http://www.google.com");
		URLConnection urlcon=u2.openConnection();
		InputStream stream=urlcon.getInputStream();
		int get;
		while((get=stream.read())!=-1){
			System.out.print((char)get);
		}
	}
	    catch(Exception e){
		    	e.printStackTrace();
	    }
	}
}
