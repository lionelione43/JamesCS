// The "Dice" class.
import java.applet.*;
import java.awt.*;

public class Dice extends Applet
{
    // Place instance variables here
    int r;
    int size;
    Graphics g;
    public void init ()
    {
	size = 20;
	    r = (int) ((Math.random () * 6) + 1);

    } // init method


    public void paint (Graphics g)
    {
	g.setColor (Color.RED);
	g.fillRect (0, 0, 100, 100);
	switch (r)
	{
	    case 1:
		dot (g, 4, 4);
		break;
	    case 2:
		dot (g, 1, 1);
		dot (g, 7, 7);
		break;
	    case 3:
		dot (g, 1, 1);
		dot (g, 4, 4);
		dot (g, 7, 7);
		break;
	    case 4:
		dot (g, 1, 1);
		dot (g, 1, 7);
		dot (g, 7, 1);
		dot (g, 7, 7);
		break;
	    case 5:
		dot (g, 1, 1);
		dot (g, 1, 7);
		dot (g, 7, 1);
		dot (g, 4, 4);
		dot (g, 7, 7);
		break;
	    case 6:
		dot (g, 1, 1);
		dot (g, 1, 4);
		dot (g, 1, 7);
		dot (g, 7, 1);
		dot (g, 7, 4);
		dot (g, 7, 7);
		break;


	}
	// Place the body of the drawing method here
    } // paint method


    public void dot (Graphics gr, int x, int y)
    {
	gr.setColor (Color.WHITE);
	gr.fillOval (x * 10, y * 10, size, size);

    }
} // Dice class
