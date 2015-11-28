package task1.business.generator.impl;

import java.util.Random;

import task1.business.generator.ShapeGenerator;
import task1.model.Circle;
import task1.model.Shape;

public class CircleShapeGenerator implements ShapeGenerator{

	@Override
	public Shape generateShape() {
		Circle circle = new Circle();
		Random random = new Random();
		circle.setRadius(random.nextInt(9) + 1);
		return circle;
	}

}
