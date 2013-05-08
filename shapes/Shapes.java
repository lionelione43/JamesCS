// The "Shapes" class.
import java.awt.*;
import hsa.Console;
import shapes.*;

public class Shapes
{
    static Console c;           // The output console
    //Setting static arrays to work in the colourchooser method
    static int[] shapesChosen;
    static int[] coloursChosen;
    static String[] colours;

    public static void main (String[] args)
    {
	//sets the variables that will be used throughout the program
	boolean a = true;
	int numShape = 0;
	int numChosen = 0;
	String getNum;
	String colour;
	c = new Console ();

	//Makes the user choose a number between 1 and 3, resets on invalid number, continues once valid number is chosen
	while (true)
	{
	    c.println ("How many shapes do you want to make? Please choose 1, 2, or 3.");
	    getNum = c.readString ();
	    if (getNum.equals("1"))
	    {
		numShape = 1;
		break;
	    }
	    else if (getNum.equals("2"))
	    {
		numShape = 2;
		break;
	    }
	    else if (getNum.equals("3"))
	    {
		numShape = 3;
		break;
	    }
	    else
	    {
		c.println ("Please input a number between 1 and 3");
	    }
	}
//instantiates the arrays with the length of however many shapes are chosen
	shapesChosen = new int [numShape];
	coloursChosen = new int [numShape];
	colours = new String [numShape];
	String[] shapes = new String [numShape];

	//Chooses which shape each shape will take
	for (int i = 0 ; i < numShape ; i++)
	{
	    //Makes sure that the chooser will only run as long as there is shapes to be chosen
	    if (numChosen < numShape)
	    {
		a = true;
	    }
	    while (a == true)
	    {
		c.println ("You have chosen to make " + numShape + " shapes");
		c.println ("You have already chosen " + numChosen + " shapes");
		//constantly outputs the shapes and colours chosen so far
		for (int e = 0 ; e < numChosen ; e++)
		{
		    c.println ("Shape " + (e + 1) + " is a " + colours [e] + " " + shapes [e]);
		}
		c.println ("");
		c.println ("Please input one of the selections, A,B,C,D or E");
		c.println ("What shape do you want to make?");
		c.println ("A: Circle");
		c.println ("B: Triangle");
		c.println ("C: Rectangle");
		c.println ("D: Mapleleaf");
		c.println ("E: Star");
		c.println ("");
		String shape = c.readString ();
		c.println ("");

		//chooses the shape based off the users input
		if (shape.equalsIgnoreCase ("A") || shape.equalsIgnoreCase ("Circle"))
		{
		    shapesChosen [numChosen] = 1;
		    shapes [numChosen] = "Circle";
		    //chooses the colour of the shape using the colourchooser method
		    c.println ("What colour do you want the shape to be? Red, Green, Blue, Yellow. Invalid choice will make black shape.");
		    colour = c.readString ();
		    colourchooser (colour, numChosen);
		    numChosen += 1;
		    a = false;
		    c.clear ();
		}
		else if (shape.equalsIgnoreCase ("B") || shape.equalsIgnoreCase ("Triangle"))
		{
		    shapesChosen [numChosen] = 2;
		    shapes [numChosen] = "Triangle";
		    c.println ("What colour do you want the shape to be? Red, Green, Blue, Yellow. Invalid choice will make black shape.");
		    colour = c.readString ();
		    colourchooser (colour, numChosen);
		    numChosen += 1;
		    a = false;
		    c.clear ();
		}
		else if (shape.equalsIgnoreCase ("C") || shape.equalsIgnoreCase ("Rectangle"))
		{
		    shapesChosen [numChosen] = 3;
		    shapes [numChosen] = "Rectangle";
		    c.println ("What colour do you want the shape to be? Red, Green, Blue, Yellow. Invalid choice will make black shape.");
		    colour = c.readString ();
		    colourchooser (colour, numChosen);
		    numChosen += 1;
		    a = false;
		    c.clear ();
		}
		else if (shape.equalsIgnoreCase ("D") || shape.equalsIgnoreCase ("Mapleleaf"))
		{
		    shapesChosen [numChosen] = 4;
		    shapes [numChosen] = "Maple Leaf";
		    c.println ("What colour do you want the shape to be? Red, Green, Blue, Yellow. Invalid choice will make black shape.");
		    colour = c.readString ();
		    colourchooser (colour, numChosen);
		    numChosen += 1;
		    a = false;
		    c.clear ();
		}
		else if (shape.equalsIgnoreCase ("E") || shape.equalsIgnoreCase ("Star"))
		{
		    shapesChosen [numChosen] = 5;
		    shapes [numChosen] = "Star";
		    c.println ("What colour do you want the shape to be? Red, Green, Blue, Yellow. Invalid choice will make black shape.");
		    colour = c.readString ();
		    colourchooser (colour, numChosen);
		    numChosen += 1;
		    a = false;
		    c.clear ();
		}
		else
		{
		    //clears the screen if invalid shape is chosen
		    c.clear ();
		    c.println ("Please chose a proper selection");
		    c.println ("");
		}
	    }
	}
	c.println ("You have chosen to make " + numShape + " shapes");
	c.println ("You have already chosen " + numChosen + " shapes");
	for (int f = 0 ; f < numChosen ; f++)
	{
	    c.println ("Shape " + (f + 1) + " is a " + colours [f] + " " + shapes [f]);
	}
	c.println ("");
	//selects the size that the shapes will have
	c.println ("Do you want the shapes to be Small, Medium, or Large? Default size is Medium.");
	String size = c.readString ();
	int height = 0;
	if (size.equalsIgnoreCase ("small") || (size.equalsIgnoreCase ("s")))
	{
	    height = 50;
	}
	else if (size.equalsIgnoreCase ("medium") || (size.equalsIgnoreCase ("m")))
	{
	    height = 100;
	}
	else if (size.equalsIgnoreCase ("large") || (size.equalsIgnoreCase ("l")))
	{
	    height = 150;
	}
	else
	{
	    height = 100;
	}
	int width = height;
	c.clear ();
	//sets the y position as halfway up the screen
	int ypos = (c.maxy () / 2) - (height / 2);
	//Changes the xposition of each shape based off of the amount of shapes chosen
	if (numShape == 1)
	{
	    int xpos = (c.maxx () / 2) - (width / 2);
	    if (shapesChosen [0] == 1)
	    {
		Circle.DrawCircle (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 2)
	    {
		Triangle.DrawTriangle (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 3)
	    {
		Rect.DrawRect (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 4)
	    {
		Maple.DrawMaple (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 5)
	    {
		Star.DrawStar (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	}
	else if (numShape == 2)
	{
	    int xpos = (c.maxx () / 3) - (width / 2);
	    if (shapesChosen [0] == 1)
	    {
		Circle.DrawCircle (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 2)
	    {
		Triangle.DrawTriangle (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 3)
	    {
		Rect.DrawRect (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 4)
	    {
		Maple.DrawMaple (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 5)
	    {
		Star.DrawStar (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    xpos = 2 * (c.maxx () / 3) - (width / 2);
	    if (shapesChosen [1] == 1)
	    {
		Circle.DrawCircle (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 2)
	    {
		Triangle.DrawTriangle (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 3)
	    {
		Rect.DrawRect (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 4)
	    {
		Maple.DrawMaple (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 5)
	    {
		Star.DrawStar (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	}
	else if (numShape == 3)
	{
	    int xpos = (c.maxx () / 4) - (width / 2);
	    if (shapesChosen [0] == 1)
	    {
		Circle.DrawCircle (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 2)
	    {
		Triangle.DrawTriangle (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 3)
	    {
		Rect.DrawRect (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 4)
	    {
		Maple.DrawMaple (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [0] == 5)
	    {
		Star.DrawStar (coloursChosen [0], xpos, ypos, width, height, c);
	    }
	    xpos = 2 * (c.maxx () / 4) - (width / 2);
	    if (shapesChosen [1] == 1)
	    {
		Circle.DrawCircle (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 2)
	    {
		Triangle.DrawTriangle (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 3)
	    {
		Rect.DrawRect (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 4)
	    {
		Maple.DrawMaple (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [1] == 5)
	    {
		Star.DrawStar (coloursChosen [1], xpos, ypos, width, height, c);
	    }
	    xpos = 3 * (c.maxx () / 4) - (width / 2);
	    if (shapesChosen [2] == 1)
	    {
		Circle.DrawCircle (coloursChosen [2], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [2] == 2)
	    {
		Triangle.DrawTriangle (coloursChosen [2], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [2] == 3)
	    {
		Rect.DrawRect (coloursChosen [2], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [2] == 4)
	    {
		Maple.DrawMaple (coloursChosen [2], xpos, ypos, width, height, c);
	    }
	    else if (shapesChosen [2] == 5)
	    {
		Star.DrawStar (coloursChosen [2], xpos, ypos, width, height, c);
	    }
	}
	// Place your program here.  'c' is the output console
    } // main method

    //chooses the colour based off of the users input
    public static void colourchooser (String chosen, int shapenum)
    {
	if (chosen.equalsIgnoreCase ("Red") || chosen.equalsIgnoreCase ("R"))
	{
	    coloursChosen [shapenum] = 1;
	    colours [shapenum] = "Red";
	}
	else if (chosen.equalsIgnoreCase ("Green") || chosen.equalsIgnoreCase ("G"))
	{
	    coloursChosen [shapenum] = 2;
	    colours [shapenum] = "Green";
	}
	else if (chosen.equalsIgnoreCase ("Blue") || chosen.equalsIgnoreCase ("B"))
	{
	    coloursChosen [shapenum] = 3;
	    colours [shapenum] = "Blue";
	}
	else if (chosen.equalsIgnoreCase ("Yellow") || chosen.equalsIgnoreCase ("Y"))
	{
	    coloursChosen [shapenum] = 4;
	    colours [shapenum] = "Yellow";
	}
	else
	{
	    coloursChosen [shapenum] = 5;
	    colours [shapenum] = "Black";
	}
    }
} // Shapes class
