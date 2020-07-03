package HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapmain{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee janeJones = new Employee("Jane", "Jones", 123);
		Employee johnDoe = new Employee("John", "Doe", 4567);
		Employee marySmith = new Employee("Mary", "Smith", 22);
		Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

		Map<String, Employee> hashMap = new HashMap<String, Employee>();
		hashMap.put("Jones", janeJones);
		hashMap.put("Doe",johnDoe);
		hashMap.put("Smith",marySmith);
		//if we use the same key "Doe" it will replace last Doe
		//hashMap.put("Doe",mikeWilson);
		
		//will only insert mike if doe not used
		hashMap.putIfAbsent("Doe", mikeWilson);
		//mike isnt added
		
		//get default method - specify default value return
		System.out.println(hashMap.getOrDefault("some", mikeWilson));
		//if key is absent u get mike
		
		System.out.println();
		
		//iterating thru hashmap
		Iterator<Employee> iterator = hashMap.values().iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		//where they are placed is acc to hash values of the keys
		
		
		//second way of printing 
		System.out.println();
		hashMap.forEach((k,v)->System.out.println("Key =" + k + ", Employee = "+v));
	
		
		//do you contain value "x"?
		System.out.println(hashMap.containsKey("Doe")); //returns true
		System.out.println(hashMap.containsValue(janeJones)); //doe faster bc key is hashed and the method can jump right to the place 0(1) but for jane jones has to search for it whole of the array/list 0(n)
		System.out.println(hashMap.containsKey("Zaman"));//returns false
	}

}
