package designpattern.nullObject;

public class Rectangle implements Shape {
	
	private double width; 
    private double length;
    
    public Rectangle() {
        this(1.0d ,1.0d);
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

	public double area() {
		 return width * length;
	}

	public double perimeter() {
		return 2 * (width + length);
	}

	public void draw() {
		System.out.println("Drawing Rectangle with area: " + area() + " and perimeter: " + perimeter());
	}

	public boolean isNull() {
		return false;
	}

}
