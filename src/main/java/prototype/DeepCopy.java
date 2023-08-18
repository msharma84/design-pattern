package designpattern.prototype;

public class DeepCopy {

	public static void main(String[] args) {
		
		DeepCloneCourse science = new DeepCloneCourse("physics","chemistry","biology");
		DeepCloneStudent student1 = new DeepCloneStudent(1, "Mohit", science);
		
		DeepCloneStudent student2 = null;
		
		try {
			student2 = (DeepCloneStudent)student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Before Deep copy ->"+student2.getCourse().getSubject3());
		
		student2.getCourse().setSubject3("Maths");
		
		System.out.println("Student 1 ->"+student1.getCourse().getSubject3());
		System.out.println("Student 2 ->"+student2.getCourse().getSubject3());

	}

}
