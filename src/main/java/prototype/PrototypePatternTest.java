package designpattern.prototype;

import java.util.List;

public class PrototypePatternTest {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Employees employees = new Employees();
		employees.loadData();
		
		Employees emp1 = (Employees)employees.clone();
		
		Employees emp2 = (Employees)employees.clone();
		
		System.out.println(employees.getEmpList());
		System.out.println(emp1.getEmpList());
		System.out.println(emp2.getEmpList());
		
		List<String> list1 = emp1.getEmpList();
		list1.add("E");
		
		List<String>list2 = emp2.getEmpList();
		list2.add("F");
		
		System.out.println(employees.getEmpList());
		System.out.println(emp1.getEmpList());
		System.out.println(emp2.getEmpList());
	}
}
