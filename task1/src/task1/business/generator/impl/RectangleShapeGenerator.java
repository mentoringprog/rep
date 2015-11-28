package task1.business.generator.impl;

import java.util.Random;

import task1.business.generator.ShapeGenerator;
import task1.model.Rectangle;
import task1.model.Shape;

public class RectangleShapeGenerator implements ShapeGenerator{

	public Shape generateShape() {
		Rectangle rectangle = new Rectangle();
		Random random = new Random();
		rectangle.setHeight(random.nextInt(9) + 1);
		rectangle.setWidth(random.nextInt(9) + 1);
		return rectangle;
	}

}
