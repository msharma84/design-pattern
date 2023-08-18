package designpattern.prototype;

public class DeepCloneStudent implements Cloneable {
	
	private int id;
	
	private String name;
	
	private DeepCloneCourse course;
	
	public DeepCloneStudent(int id, String name, DeepCloneCourse course) {
		this.id = id;
		this.name = name;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DeepCloneCourse getCourse() {
		return course;
	}

	public void setCourse(DeepCloneCourse course) {
		this.course = course;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		DeepCloneStudent student = (DeepCloneStudent) super.clone();
		student.setCourse((DeepCloneCourse)course.clone());
		return student;
	}
}
