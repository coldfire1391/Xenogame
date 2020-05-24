import java.util.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Screen extends GameObject
{
	ClassLoader cl;				//class loader
	BufferedImage img;
	boolean visualize;			//to display img or not
	int x;
	int y;
	public Screen(String s1, String s2, int xcoord, int ycoord)			//s1 is foler in same directory as project												
	{
		//s1 is directory name
		//s2 is name of img file *with* extension
		
		// img = MarioWindow.getImage(s1+"/"+s2);	//original

		cl = this.getClass().getClassLoader();						//testing
		img = MarioWindow.getImage(cl.getResource(s1+"/"+s2));		//testing

		x = xcoord;
		y = ycoord;
		visualize = false;
	}
	public void paint(Graphics2D g)
	{
		if (visualize) 
		{
			g.drawImage(img,x,y,null);
			//if text is needed, use Power Clear
		}
	}
}