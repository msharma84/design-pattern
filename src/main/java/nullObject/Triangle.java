package designpattern.nullObject;

public class Triangle implements Shape {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle() {
        this(1.0d, 1.0d, 1.0d);
    }

	public Triangle(double a, double b, double c) {
		this.a = a;
        this.b = b;
        this.c = c;
	}

	public double area() {
		double s = (a + b + c) / 2;
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	public double perimeter() {
		 return a + b + c;
	}

	public void draw() {
		System.out.println("Drawing Triangle with area: "+area() + " and perimeter: "+perimeter());
	}

	public boolean isNull() {
		return false;
	}

}
