package designpattern.nullObject;

public class Circle implements Shape {
	
	private double radius;
	
	public Circle() {
        this(1.0d);
    }  
	
	Circle(double radius){
		this.radius = radius;
	}

	public double area() {
		 // Area = π r^2
		return Math.PI * Math.pow(radius, 2);
	}

	public double perimeter() {
		// Perimeter = 2πr
		return 2 * Math.PI * radius;
	}

	public void draw() {
		System.out.println("Drawing Circle with area: "+area() + " and perimeter: "+perimeter());
	}

	public boolean isNull() {
		return false;
	}

}
