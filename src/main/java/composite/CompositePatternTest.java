package designpattern.composite;

public class CompositePatternTest {

	public static void main(String[] args) {
		
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape squ = new Square();
		
		Drawing drawing = new Drawing();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(squ);
		
		drawing.draw("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(squ);
		drawing.draw("Green");
		
	}

}
