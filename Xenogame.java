import java.util.*;
import java.lang.*;
public class Xenogame
{
	public static void main(String[] args) 
	{
		DisplayRA disra = new DisplayRA();

		final MarioWindow mw = new MarioWindow();

		mw.add(disra);

		(new Thread()
		{
			public void run()
			{
				mw.startGame();
			}
		}).start();

		while(true)
		{
			MarioWindow.delay(100);
		}
	}
}