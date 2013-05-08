/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;
import java.awt.*;

/**
 *
 * @author student
 */
public class Die {
    static int x1,y1,size,value;
    static Color clr;
    public Die (){
        x1 = 0;
        y1 = 0;
        size = 100;
        clr = Color.red;
        value = 1;
    }
    public static void setColour(Color c){
        clr = c;
    }
    public static void setSize(int s){
        size = s;
    }
    public static void setValue(int v){
        value = v;
    }
    public static void setPosition(int x, int y){
        x1 = x;
        y1 = y;
    }
    public static void draw(Graphics gr){
        gr.setColor (clr);
        gr.fillRect (x1, y1, size, size);
        gr.setColor (Color.WHITE);
        switch (value)
        {
            case 1:
                gr.fillOval ((4 * size/10) + x1, (4 * size/10) + y1, size/5, size/5);
                break;
            case 2:
                gr.fillOval ((1 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                break;
            case 3:
                gr.fillOval ((1 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((4 * size/10) + x1, (4 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                break;
            case 4:
                gr.fillOval ((1 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((1 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                break;
            case 5:
                gr.fillOval ((1 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((1 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                gr.fillOval ((4 * size/10) + x1, (4 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                break;
            case 6:
                gr.fillOval ((1 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((1 * size/10) + x1, (4 * size/10) + y1, size/5, size/5);
                gr.fillOval ((1 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (1 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (4 * size/10) + y1, size/5, size/5);
                gr.fillOval ((7 * size/10) + x1, (7 * size/10) + y1, size/5, size/5);
                break;
        }
    }
}
