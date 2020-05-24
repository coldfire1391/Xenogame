import java.util.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class DisplayRA extends GameObject
{
	Screen[][] window;		//2D window window
	int w1vtracker;
	int w2vtracker;

	public DisplayRA()
	{
		window = new Screen[2][5];		//window will be of size 2x5

		Screen w1 = new Screen("window","w1.png",0,0);			//create Screen w1
		w1.visualize = true;									//visualize variable of w1 is true
		window[0][0] = w1;										//place w1 to window[0][0]
		Screen w1b1 = new Screen("window","w1b1.png",73,76);
		window[0][1] = w1b1;
		Screen w1b2 = new Screen("window","w1b2.png",73,76);
		window[0][2] = w1b2;
		Screen w1b3 = new Screen("window","w1b3.png",73,76);
		window[0][3] = w1b3;
		Screen w1b4 = new Screen("window","w1b4.png",73,76);
		window[0][4] = w1b4;

		Screen w2 = new Screen("window","w2.png",0,0);
		window[1][0] = w2;
		Screen w2b1 = new Screen("window","w2b1.png",54,47);
		window[1][1] = w2b1;
		Screen w2b2 = new Screen("window","w2b2.png",54,47);
		window[1][2] = w2b2;
		Screen w2b3 = new Screen("window","w2b3.png",54,47);
		window[1][3] = w2b3;
		Screen w2b4 = new Screen("window","w2b4.png",54,47);
		window[1][4] = w2b4;
		w1vtracker = 1;
		w2vtracker = 1;
	}

	public void paint(Graphics2D g)
	{
		if (window[0][0].visualize) 
		{
			Screen w1 = window[0][0];
			w1.paint(g);
			
			Screen w1b = window[0][w1vtracker];
			w1b.visualize = true;
			w1b.paint(g);
		}
		else if (window[1][0].visualize) 
		{
			Screen w2 = window[1][0];
			w2.paint(g);
			Screen w2b = window[1][w2vtracker];
			w2b.visualize = true;
			w2b.paint(g);	
		}
	}

	public void mouseClicked(int xmouse, int ymouse, int button)
	{
		if (window[0][0].visualize)
		{
			if (758 < xmouse && xmouse < 800 && 66 < ymouse && ymouse < 317) 
			{
				window[0][0].visualize = false;
				window[1][0].visualize = true;
				System.out.println("Switching to window2");
			}
			if (213 < xmouse && xmouse < 265 && 540 < ymouse && ymouse < 600) 
			{//left button
				window[0][w1vtracker].visualize = false;				
				w1vtracker--;
				if (w1vtracker<1) 
				{
					w1vtracker = 4;
				}
			}
			else if (340 < xmouse && xmouse <383 && 540 < ymouse && ymouse < 600) 
			{//right button
				window[0][w1vtracker].visualize = false;				
				w1vtracker++;
				if (w1vtracker>4) 
				{
					w1vtracker = 1;
				}	
			}
		}
		else if (window[1][0].visualize) 
		{	
			if (0 < xmouse && xmouse < 41 && 47 < ymouse && ymouse < 285) 
			{
				window[1][0].visualize = false;
				window[0][0].visualize = true;
				System.out.println("Switching to window1");
			}
			if (25 <  xmouse && xmouse < 184 && 415 < ymouse && ymouse < 572) 
			{//box 1
				if (w2vtracker != 1) 
				{
					window[1][w2vtracker].visualize = false;
					w2vtracker = 1;
				}
				System.out.println("clicked box 1");
			}
			else if (222 < xmouse && xmouse < 382 && 415 < ymouse && ymouse < 572) 
			{//box 2
				if (w2vtracker != 2) 
				{
					window[1][w2vtracker].visualize = false;
					w2vtracker = 2;
				}
				System.out.println("clicked box 2");				
			}
			else if (419 < xmouse && xmouse < 579 && 415 < ymouse && ymouse < 572) 
			{//box 3
				if (w2vtracker != 3) 
				{
					window[1][w2vtracker].visualize = false;
					w2vtracker = 3;
				}
				System.out.println("clicked box 3");				
			}
			else if (617 < xmouse && xmouse < 777 && 415 < ymouse && ymouse < 572) 
			{//box 4
				if (w2vtracker != 4) 
				{
					window[1][w2vtracker].visualize = false;
					w2vtracker = 4;
				}
				System.out.println("clicked box 4");				
			}
		}
	}
}
