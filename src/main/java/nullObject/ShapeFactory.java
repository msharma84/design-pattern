package designpattern.nullObject;

public class ShapeFactory {
	
	public static Shape getShape(String shapeType) {
		
		Shape shape = null;
		if("circle".equalsIgnoreCase(shapeType)){
			shape = new Circle();
		}else if("rectangle".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle();
		}else if("triangle".equalsIgnoreCase(shapeType)) {
			shape = new Triangle();
		}else {
			shape = NullShapeSingleton.getNullShapeObject();
		}
		return shape;
	}
}
