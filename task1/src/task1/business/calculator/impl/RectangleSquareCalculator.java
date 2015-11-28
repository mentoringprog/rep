package task1.business.calculator.impl;

import task1.business.calculator.SquareCalculator;
import task1.model.Rectangle;
import task1.model.Shape;

public class RectangleSquareCalculator implements SquareCalculator{

	@Override
	public double calculateSquare(Shape shape) {
		double square;
		Rectangle rectangle = (Rectangle) shape;
		square = rectangle.getHeight() * rectangle.getWidth();
		return square;
	}

}
