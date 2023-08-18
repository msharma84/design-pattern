package designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable{
	
	private List<String> empList;
	
	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List<String> empList) {
		this.empList = empList;
	}
	
	public List<String> getEmpList() {
		return empList;
	}

	public void loadData() {
		
		empList.add("A");
		empList.add("B");
		empList.add("C");
		empList.add("D");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		List<String> temp = new ArrayList<String>();
		for(String s : this.getEmpList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
