package task1.business.calculator.impl;

import task1.business.calculator.SquareCalculator;
import task1.model.Shape;
import task1.model.Triangle;

public class TriangleSquareCalculator implements SquareCalculator{

	@Override
	public double calculateSquare(Shape shape) {
		double square;
		Triangle triangle = (Triangle) shape;
		double p = (triangle.getSideA() + triangle.getSideB() + triangle.getSideC())/2;
		square = Math.sqrt(p + (p - triangle.getSideA()) + (p - triangle.getSideB()) + (p - triangle.getSideC()));
		return square;
	}

}
