package task1.util;

import task1.model.Shape;

public class PrintUtil {
	
	public static void printShapeSquare(Shape shape, double square){
		System.out.println(shape);
		System.out.println(shape.getShapeClassName() + " square = " + square);
		System.out.println();
	}
}
