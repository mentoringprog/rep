package task1.util;

import java.util.Random;

import task1.business.generator.impl.CircleShapeGenerator;
import task1.business.generator.impl.RectangleShapeGenerator;
import task1.business.generator.impl.TriangleShapeGenerator;
import task1.model.Shape;

public class ShapeGeneratorUtil {

	public static Shape generateShape() {
		
		Shape shape = null;
		Random random = new Random();
		
		switch (random.nextInt(3)) {
		
		case 0:
			shape = new CircleShapeGenerator().generateShape();
			break;

		case 1:
			shape = new RectangleShapeGenerator().generateShape();
			break;
			
		case 2:
			shape = new TriangleShapeGenerator().generateShape();
			break;

		}

		return shape;
	}
}
