package task1.business.calculator.impl;

import task1.business.calculator.SquareCalculator;
import task1.model.Circle;
import task1.model.Shape;

public class CircleSquareCalculatior implements SquareCalculator{

	@Override
	public double calculateSquare(Shape shape){
		double square;
		Circle circle = (Circle) shape;
		square = Math.pow(circle.getRadius(), 2) * Math.PI;
		return square;
	}
}
