package task1.main;

import task1.model.Shape;
import task1.util.PrintUtil;
import task1.util.ShapeGeneratorUtil;
import task1.util.ShapeSquareCalculatorUtil;

public class Main {

	public static void main(String[] args) {
		
		Shape shape = null;
		double shapeSquare;
		for(int i = 0; i < 10; i++){
			shape = ShapeGeneratorUtil.generateShape();
			shapeSquare = ShapeSquareCalculatorUtil.calculateSquare(shape);
			PrintUtil.printShapeSquare(shape, shapeSquare);
		}	
		
	}
}
