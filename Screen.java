import java.util.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class Screen extends GameObject
{
	// ClassLoader cl;				//class loader
	BufferedImage img;
	boolean visualize;			//to display img or not
	int x;
	int y;
	public Screen(String s1, String s2, int xcoord, int ycoord)			//s1 is foler in same directory as project												
	{											//s2 is name of img file with extension
		img = MarioWindow.getImage(s1+"/"+s2);

		// cl = this.getClass().getClassLoader();
		// img = cl.getResource(s1+"/"+s2);

		x = xcoord;
		y = ycoord;
		visualize = false;
	}
	public void paint(Graphics2D g)
	{
		if (visualize) 
		{
			g.drawImage(img,x,y,null);
			// g.setFont(new Font("Power Clear", Font.PLAIN, 14)); //if text is needed, use this font
		}
	}
}