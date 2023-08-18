package designpattern.monostate;

public class MonostateTest {

	public static void main(String[] args) {
		
		System.out.println("***Demo: monostate pattern");
		System.out.println("Creating: first monostate");
		Monostate monostate1 = new Monostate();
		
		System.out.println("Creating: second monostate");
		Monostate monostate2 = new Monostate();
		
		System.out.println("Checking: state of first monostate");
		monostate1.greet();
		System.out.println("Checking: state of second monostate");
		monostate2.greet();
		System.out.println("Checking: the two references point to the same object");
		if(monostate1 == monostate2){
			System.out.println("True");
		}
		else{
			System.out.println("False");			
		}
		
		System.out.println("Changing: state of monostate to stateABC");
		monostate1.setState("ABC");	
		System.out.println("Checking: state of first monostate");
		monostate1.greet();
		System.out.println("Checking: state of second monostate");
		monostate2.greet();
	}
}
