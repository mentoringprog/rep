package task1.model;

public abstract class Shape {
	
	public static final String CIRCLE = "Circle";
	public static final String RECTANGLE = "Rectangle";
	public static final String TRIANGLE = "Triangle";
	
	public String getShapeClassName(){
		return this.getClass().getSimpleName();
	}
}
