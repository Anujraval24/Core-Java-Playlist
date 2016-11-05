package network;

import java.net.HttpURLConnection;
//import java.net.MalformedURLException;
import java.net.URL;

public class Http_url {

	public static void main(String[] args) {
		
		URL u3;
		try {
			u3 = new URL("https://www.youtube.com/");
			
			HttpURLConnection con=(HttpURLConnection)u3.openConnection();
			
			for(int i=1;i<=8;i++){  
				System.out.println(con.getHeaderFieldKey(i)+" = "+con.getHeaderField(i));
				//System.out.println(con.getIfModifiedSince()+" = "+con.getIfModifiedSince());
				}  
				con.disconnect();
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
	
}