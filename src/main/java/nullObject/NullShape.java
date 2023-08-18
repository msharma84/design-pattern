package designpattern.nullObject;

public class NullShape implements Shape {

	public double area() {
		return 0.0d;
	}

	public double perimeter() {
		return 0.0d;
	}

	public void draw() {
		System.out.println("Null object can't be draw");
	}

	public boolean isNull() {
		return true;
	}

}
