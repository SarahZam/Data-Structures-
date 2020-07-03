package Lists;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		
		//add end to list
		employeeList.add(new Employee("Jane","Jones", 123));
		employeeList.add(new Employee("Sarah", "Zaman", 133));
		employeeList.add(new Employee("Oh","Ah",234));
		employeeList.add(new Employee("Ah", "Oh", 2343));
		
		
		//print
		//employeeList.forEach(employee->System.out.println(employee));
		//System.out.println(employeeList.get(1));
		
		//checks if empty
		System.out.println(employeeList.isEmpty());
		
		//replace
		employeeList.set(1, new Employee("not","Sarah", 12334));
		
		//employeeList.forEach(employee->System.out.println(employee));
		
		System.out.println(employeeList.size());
		
		//add specific position
		employeeList.add(3, new Employee("Jone", "sarah", 302));
		//employeeList.forEach(employee->System.out.println(employee));
		
		Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
		for(Employee employee : employeeArray) {
			System.out.println(employee);
		}
		
		System.out.println(employeeList.contains(new Employee("Jane", "Jones", 123 )));
	
		System.out.println(employeeList.indexOf(new Employee("Jane", "Jones", 123 )));
	 }
		
		
}
