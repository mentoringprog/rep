package task1.util;

import java.util.HashMap;
import java.util.Map;

import task1.business.calculator.SquareCalculator;
import task1.business.calculator.impl.CircleSquareCalculatior;
import task1.business.calculator.impl.RectangleSquareCalculator;
import task1.business.calculator.impl.TriangleSquareCalculator;
import task1.model.Shape;

public class ShapeSquareCalculatorUtil {
	
	private static Map<String, SquareCalculator> calculatorsMap;

	static{
		calculatorsMap = new HashMap<String, SquareCalculator>();
		calculatorsMap.put(Shape.CIRCLE, new CircleSquareCalculatior());
		calculatorsMap.put(Shape.RECTANGLE, new RectangleSquareCalculator());
		calculatorsMap.put(Shape.TRIANGLE, new TriangleSquareCalculator());
	}

	public static double calculateSquare(Shape shape){
		double result;
		SquareCalculator calculator = calculatorsMap.get(shape.getShapeClassName());
		result = calculator.calculateSquare(shape);
		return result;
	}
}
