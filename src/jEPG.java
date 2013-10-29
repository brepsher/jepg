/**
 * Main file
 * 
 * Main 
 * 
 * Main Main
 * 
 * @author Brian Repsher 
 * @version 0.1
 */

/**
 * Main program loop
 */
public class jEPG {
	public static void main(String[] args)
	{
		/**
		 * Create an array of shape opjects
		 */
        Shape[] shapes = 
        {
            new Line(), new Rectangle(), new Circle()
        };
        // A begin and end point from a graphical editor
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (Shape shape : shapes)
          shape.draw(x1, y1, x2, y2);
	}
}

  
