package designpattern.nullObject;

public class ShapeFactoryTestMain {

	public static void main(String[] args) {
		
		String [] shapes = new String[]{"circle",null,"triangle","rectangle",null};
		
		for(String shape : shapes) {
			Shape obtainedShape = ShapeFactory.getShape(shape);
			System.out.println("Shape area: +"+obtainedShape.area());
			System.out.println("Shape perimeter: "+obtainedShape.perimeter());
			System.out.println("Check Value: "+obtainedShape.isNull());
			obtainedShape.draw();
			
			System.out.println(obtainedShape.hashCode());
			System.out.println();
		}
	}

}
