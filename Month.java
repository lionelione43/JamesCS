// The "Weekday" class.
import java.awt.*;
import hsa.Console;

public class Month
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String[] days = new String [12];
	days [0] = "January";
	days [1] = "February";
	days [2] = "March";
	days [3] = "April";
	days [4] = "May";
	days [5] = "June";
	days [6] = "July";
	days [7] = "August";
	days [8] = "September";
	days [9] = "October";
	days [10] = "November";
	days [11] = "December";

	boolean valid = true;

	while (valid)
	{
	    c.println ("Please input a number between 1 and 12");
	    int num = c.readInt();
	    num -= 1;

	    if (num >= 0 && num < 12)
	    {
		c.println ("That is " + days[num]);
	    }
	    else
	    {
		c.println ("There are 12 months in a year");
		valid = false;
	    }
	}
	// Place your program here.  'c' is the output console
    } // main method
} // Weekday class
