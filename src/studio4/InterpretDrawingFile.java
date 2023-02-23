package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		//System.out.println("What is the shape type?: ");
		String shapeType = in.next();
		
		//System.out.println("What is the red component?: ");
		int redComponent = in.nextInt();
		
		//System.out.println("What is the green component?: ");
		int greenComponent = in.nextInt();
		
		//System.out.println("What is the blue component?: ");
		int blueComponent = in.nextInt();
		
		//System.out.println("Is it filled?: ");
		boolean isFilled = in.nextBoolean();
		
		//System.out.println("What is the parameter one?: ");
		double parameterOne = in.nextDouble();
		
		//System.out.println("What is the parameter two?: ");
		double parameterTwo = in.nextDouble();
		
		//System.out.println("What is the parameter three?: ");
		double parameterThree = in.nextDouble();
		
		//System.out.println("What is the parameter four?: ");
		double parameterFour = in.nextDouble();
		
		//System.out.println("What is the parameter four?: ");
		double parameterFive = in.nextDouble();
		
		//System.out.println("What is the parameter four?: ");
		double parameterSix = in.nextDouble();
		
		StdDraw.setPenColor(redComponent, greenComponent, blueComponent);
		
		double[] x = new double[] {parameterOne, parameterThree, parameterFive};// array for polygon x values
		double[] y = new double[] {parameterTwo, parameterFour, parameterSix}; //array for polygon y values
		
		if(shapeType.equals("rectangle")) { //right .equals since it is an object and not a primitive type
			if(isFilled) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if(shapeType.equals("ellipse")) {
			if(isFilled) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterFour);
			}
		}
		if(shapeType.equals("triangle")) { //triangle is polygon in StdDraw
			if(isFilled) {
				StdDraw.filledPolygon(x, y);
			}
			else {
				StdDraw.polygon(x, y);
			}
		}
	} 
}
