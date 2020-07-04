package SearchAlgorithm;

public class BinarySearchAlgorithm {

	public static void main(String[] args) {
		
		int[] intArray = { -22,-15,1,7,20,35,55 };
		System.out.println(iterativeBinarySearch(intArray,-15));
		System.out.println(iterativeBinarySearch(intArray,-22));
		System.out.println(iterativeBinarySearch(intArray,-1));
		
		
		System.out.println(recursiveBinarySearch(intArray,-15));
		System.out.println(recursiveBinarySearch(intArray,-22));
		System.out.println(recursiveBinarySearch(intArray,-1));
	}
	
	public static int iterativeBinarySearch(int[] array, int value) {
		int start = 0;
		int end = array.length;
		
		while(start<end) {
			int midpoint = (start+end)/2;
			if(array[midpoint]==value) {
				return midpoint;
			}
			else if(array[midpoint]<value) {
				start = midpoint + 1;
			}
			else {
				end = midpoint;
			}
		}
		
		return -1;
	}
	
	public static int recursiveBinarySearch(int[] array, int value) {
		return recursiveBinarySearch(array, 0, array.length, value);
	}
	
	public static int recursiveBinarySearch(int[] array, int start, int end, int value) {
		if(start>=end) {
			return -1;
		}
		
		int midpoint = (start+end)/2;
		System.out.println("midpoint "+midpoint);
		
		if(array[midpoint]==value) {
			return midpoint;
		}
		else if(array[midpoint] < value) {
			return recursiveBinarySearch(array,midpoint+1, end, value);
		}
		else {
			return recursiveBinarySearch(array,start,midpoint,value);
		}
	}
	
}
