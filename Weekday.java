// The "Weekday" class.
import java.awt.*;
import hsa.Console;

public class Weekday
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String[] days = new String [7];
	days [0] = "Monday";
	days [1] = "Tuesday";
	days [2] = "Wednesday";
	days [3] = "Thursday";
	days [4] = "Friday";
	days [5] = "Saturday";
	days [6] = "Sunday";

	boolean valid = true;

	while (valid)
	{
	    c.println ("Please input a number between 1 and 7");
	    int num = c.readInt();
	    num -= 1;

	    if (num >= 0 && num < 7)
	    {
		c.println ("That is " + days[num]);
	    }
	    else
	    {
		c.println ("There are 7 days in the week");
		valid = false;
	    }
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Weekday class
