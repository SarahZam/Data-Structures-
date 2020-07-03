package HashTable;



public class Main {
	
	public static void main(String[] args) {
		  Employee janeJones = new Employee("Jane", "Jones", 123);
	        Employee johnDoe = new Employee("John", "Doe", 4567);
	        Employee marySmith = new Employee("Mary", "Smith", 22);
	        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
	        
	        //SimpleHashTable ht = new SimpleHashTable();
	        ChainedHashtable ht = new ChainedHashtable();
	        ht.put("Jones",janeJones);
	        ht.put("Doe", johnDoe);
	        ht.put("Wilson", mikeWilson);
	        ht.put("Smith", marySmith);
	        ht.printHashtable();
	        
	        System.out.println("Retrieved key Smith: "+ht.get("Smith"));
	        
	        System.out.println("Doe key: " + ht.get("Doe"));
	        System.out.println("SMith key: " + ht.get("Smith"));
	        
	        ht.remove("Doe");
	        ht.remove("Jones");
	        ht.printHashtable();
	        ht.printHashtable();
	        System.out.println("Retrieve: "+ht.get("Smith"));
	        
	        
	}
}
