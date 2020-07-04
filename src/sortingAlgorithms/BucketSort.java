package sortingAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//uses hashing
//makes assumption about data, like radix and counting sort
//sort in O(n)
//performs best when hashed values of items being sorted are evenly distributed so no collision

//how does it work
//1. SCATTERING PHASE: distribute items into buckets based on hashed values
//2. Sort items in each bucket
//3. GATHERING PHASE: merge buckets - can just concatenate
//3.1. values of bucket X must be greater than the values in bucket x-1 and less than the values in bucket x+1
//3.2. this means that the hash function we use must meet this requirement
//4. generalization of counting sort

//54 46 83 66 95 92 43
//hashes based on 10s value, i.e. 54 in 5, 46 in 4, 83 in 8, 66 in 6
// Scattering phase:| | | | |46->43|54|66| |83|95->92| 
// Sorting phase: | | | | |43->46|54|66| |83|92->95|
//Gathering phase: 43|46|54|66|83|93|95

//insertion sort/sort method - adaptove merge sort algorithm

public class BucketSort {

	public static void main(String[] args) {
		int[] intArray = {54, 46, 83, 66, 95, 92, 43};
		
		bucketSort(intArray);
		
		System.out.print("|");
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + "|");
		}
		
	}
	
	public static void bucketSort(int[] input) {
		List<Integer>[] buckets = new List[10];
		
		for(int i = 0; i<buckets.length;i++) {
			//Linked list
			buckets[i] = new LinkedList<Integer>(); 
			//arraylist
			//buckets[i] = new ArrayList<Integer>(); 
		}
		
		for(int i = 0; i < input.length; i++) {
			buckets[hash(input[i])].add(input[i]);
			
		}
		
		for(List bucket:buckets) {
			Collections.sort(bucket);
		}
		
		int j = 0;
		for(int i = 0; i < buckets.length; i++) {
			for(int value:buckets[i]) {
				input[j++]=value;
			}
		}
	}
	
	public static int hash(int value) {
		return value / (int) 10;
	}
}
