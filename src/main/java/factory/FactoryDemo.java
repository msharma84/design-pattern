package designpattern.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		
		AnimalFactory factory = new AnimalFactory();
		
		Animal animal1 = factory.getAnimal("canine");
		System.out.println(animal1.makeSound());
		
		Animal animal2 = factory.getAnimal("feline");
		System.out.println(animal2.makeSound());
	}

}
