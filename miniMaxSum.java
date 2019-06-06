import java.util.*;

/**
 * @author chhattenjr
 * @date 06/06/2019
 * @description Given five positive integers, find the minimum and maximum values that can be calculated 
 * by summing exactly four of the five integers.
 *
 */

public class miniMaxSum {
	
	private static final int len = 5;
	private static final double limit = Math.pow(10, 9);

	static void miniMaxSum(int[] arr) {
		long minimumSum = 0;
		long maximumSum = 0;
		boolean isValidArray = true;
		
		int[] unsortedIntArray = new int[len];
		
		for(int i = 0; i < len; i++) {
			if(arr[i] >= 1 && arr[i] <= limit) {
				unsortedIntArray[i] = arr[i];
			} else {
				isValidArray = false;
			}
		}
		
		//System.out.println(isValidArray);
		
		if(!isValidArray) {
			return;
		}
		
		// Sorting the integers inside of the integer array
		
		Arrays.sort(arr);
		
		int[] sortedIntArray = arr;
		
		System.out.println("Unsorted Array: " + Arrays.toString(unsortedIntArray));
		System.out.println("Sorted Array: " + Arrays.toString(sortedIntArray));
		
		for(int i = 0; i < 4; i++) {
			minimumSum+= arr[i];
		}
		
		System.out.println("Minimum Sum: " + minimumSum);
		
		for(int i = 1; i < 5; i++) {
			maximumSum+= arr[i];
		}
		
		System.out.println("Maximum Sum: " + maximumSum);
		
		System.out.println(minimumSum + " " + maximumSum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[len];
		int[] arr2 = new int[len];
		
		Random rn = new Random();
		
		for(int i = 0; i < len; i++) {
			arr1[i] = rn.nextInt(6);
			arr2[i] = rn.nextInt(6);
		}
		
		miniMaxSum(arr1);
		miniMaxSum(arr2);
	}

}
