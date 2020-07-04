package SearchAlgorithm;


//time complexity O(n)

public class LinearSearchAlgorithm {
	
	//finding -15 from the array

	public static void main(String[] args) {
		int[] intArray = {20,35,-15,7,55,1,-22};
		
		System.out.println(linearSearch(intArray,-15));
		System.out.println(linearSearch(intArray,1));
		System.out.println(linearSearch(intArray,294));
	}
	
	public static int linearSearch(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
