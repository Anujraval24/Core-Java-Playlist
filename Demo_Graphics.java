package applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Demo_Graphics extends Applet{
		
	public void paint(Graphics g){  
		g.setColor(Color.blue);  
		g.drawString("Welcome supp?",150,150);  
		g.drawLine(10,50,30,250);  
		g.drawRect(70,100,30,30);  
		g.fillRect(170,100,30,30);  
		g.drawOval(70,200,30,30);  
		  
		g.setColor(Color.cyan);  
		g.fillOval(170,200,30,30);  
		g.drawArc(90,150,30,30,30,270);  
		g.fillArc(270,150,30,30,0,180);  
}
	}
/* 
<applet code="First.class" width="500" height="500"> 
</applet> 
*/  