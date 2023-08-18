package serialization;

public class SerializationTest {

	public static void main(String[] args) {
		
		String fileName = "employee.ser";
		Employee emp = new Employee();
		emp.setId(1);
		emp.setName("Mohit");
		emp.setAddress("Chandigarh");
		emp.setSalary(100000);
		
		try {
			SerializationUtil.serialize(emp, fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Employee newEmp = null;
		
		try {
			newEmp = (Employee)SerializationUtil.deSerialize(fileName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Employee : "+emp);
		System.out.println("New Employee : "+newEmp);
	}

}
