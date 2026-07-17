package immutable;

public class ImmutableDemo {

	public static void main(String[] args) {
		
		Immutable im1 = new Immutable("A");
		
		System.out.println("Immutable Value ->"+im1.getValue());

		Immutable im2 = new Immutable("A");

		System.out.println("Immutable Value ->"+im1.getValue());

		System.out.println(im1==im2);
		System.out.println(im1.equals(im2));
	}

}
