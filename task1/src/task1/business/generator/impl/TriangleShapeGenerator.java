package task1.business.generator.impl;

import java.util.Random;

import task1.business.generator.ShapeGenerator;
import task1.model.Shape;
import task1.model.Triangle;

public class TriangleShapeGenerator implements ShapeGenerator{

	@Override
	public Shape generateShape() {
		Triangle triangle = new Triangle();
		Random random = new Random();
		triangle.setSideA(random.nextInt(9) + 1);
		triangle.setSideB(random.nextInt(9) + 1);
		triangle.setSideC(random.nextInt(9) + 1);
		return triangle;
	}

}
