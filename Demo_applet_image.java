package applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Image;

public class Demo_applet_image extends Applet {
	
	
	Image picture;  
	  
	  public void init() {  
	    picture = getImage(getDocumentBase(),"D:/Development/Workspace/ANuj/core_java/index1.jpg");  
	  }  
	    
	  public void paint(Graphics g) {  
	    g.drawImage(picture, 207,207, this);
	    g.drawString("anuj", 50, 50);
	  } 
}
/* 
<applet code="First.class" width="300" height="300"> 
</applet> 
*/  



	
