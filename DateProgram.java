// The "DateProgram" class.
import java.awt.*;
import hsa.Console;

public class DateProgram
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int totaldays = 0;
	int[] days = new int [12];
	days [0] = 31;
	days [1] = 28;
	days [2] = 31;
	days [3] = 30;
	days [4] = 31;
	days [5] = 30;
	days [6] = 31;
	days [7] = 31;
	days [8] = 30;
	days [9] = 31;
	days [10] = 30;
	days [11] = 31;
	
	c.println ("Please input a month number");
	int month = c.readInt();
	c.println ("Please input a day in that month");
	int day = c.readInt();
	
	for (int i = 1; i < month; i++)
	{
	totaldays += days[i];
	}
	totaldays += day;
	c.println (totaldays);
	
	// Place your program here.  'c' is the output console
    } // main method
} // DateProgram class
