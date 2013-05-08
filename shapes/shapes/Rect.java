package shapes;
// The "Rectangle" class.
import java.awt.*;
import hsa.Console;

public class Rect
{
    public static void DrawRect (int number, int x1, int x2, int width, int height, Console d)
    {
	if (number == 1)
	{
	d.setColor(Color.red);
	}
	else if (number == 2)
	{
	d.setColor(Color.green);
	}
	else if (number == 3)
	{
	d.setColor(Color.blue);
	}
	else if (number == 4)
	{
	d.setColor(Color.yellow);
	}
	else if (number == 5)
	{
	d.setColor(Color.black);
	}
	d.fillRect (x1, x2, width, height);
    }
} // Rectangle class