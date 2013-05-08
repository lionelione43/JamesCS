package shapes;
// The "Triangle" class.
import java.awt.*;
import hsa.Console;

public class Triangle
{
    public static void DrawTriangle (int number, int x1, int x2, int width, int height, Console d)
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
	int[] xPoints = new int [3];
	int[] yPoints = new int [3];
	xPoints [0] = x1;
	xPoints [1] = x1 + width;
	xPoints [2] = x1 + (width / 2);
	yPoints [0] = x2;
	yPoints [1] = x2;
	yPoints [2] = x2 + height;
	d.fillPolygon (xPoints, yPoints, 3);
    }
} // Triangle class
