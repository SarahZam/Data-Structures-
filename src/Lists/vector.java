package Lists;

import java.util.List;
import java.util.Vector;

public class vector {
public static void main(String[] args) {
		
		List<Employee> employeeList = new Vector<>();
		
		//add end to list
		employeeList.add(new Employee("Jane","Jones", 123));
		employeeList.add(new Employee("Sarah", "Zaman", 133));
		employeeList.add(new Employee("Oh","Ah",234));
		employeeList.add(new Employee("Ah", "Oh", 2343));
		
		
	}
}
