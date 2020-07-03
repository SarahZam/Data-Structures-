package Lists;

import java.util.List;
import java.util.Vector;

public class linkedList {
	
	
public static void main(String[] args) {
		
		//add end to list
		Employee jane = new Employee("Jane","Jones", 123);
		Employee sarah = new Employee("Sarah", "Zaman", 133);
		Employee oh = new Employee("Oh","Ah",234);
		Employee ah = new Employee("Ah", "Oh", 2343);
		
		EmployeeLinkedList list = new EmployeeLinkedList();
		list.addToFront(sarah);
		list.addToFront(oh);
		list.addToFront(jane);
		list.addToFront(ah);
		
		
		list.printList();
	}
}
