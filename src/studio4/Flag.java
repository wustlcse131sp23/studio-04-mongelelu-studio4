package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledRectangle(0.5,0.8, 0.5, 0.8);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.5, 0.5, 0.25, 0.15);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.35, 0.75, 0.1, 0.1);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.25, 0.7, 0.0825, 0.05);
		
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.setPenRadius(.04);
		StdDraw.point(0.30, 0.8);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.30, 0.875, 0.02, 0.065);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledRectangle(0.40, 0.875, 0.02, 0.065);
		
		double[] x = new double[] {.5, .525, .85};
		double[] y = new double[] {.5, .8, .75}; 
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledPolygon(x, y);
		}
}