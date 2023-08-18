package designpattern.prototype;

public class ShallowCopy {

	public static void main(String[] args) {
		
		Course science = new Course("physics","chemistry","biology");
		Student student1 = new Student(1, "Mohit", science);
		
		Student student2 = null;
		
		try {
			student2 = (Student)student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Before shallow copy ->"+student2.getCourse().getSubject3());
		
		student2.getCourse().setSubject3("Maths");
		
		System.out.println("Student 1 ->"+student1.getCourse().getSubject3());
		System.out.println("Student 2 ->"+student2.getCourse().getSubject3());
	}

}
