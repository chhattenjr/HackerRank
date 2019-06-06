import java.text.DecimalFormat;
import java.util.*;

/**
 * @author chhattenjr
 * @date 05/31/2019
 * @description Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros.
 * Print the decimal value of each fraction on a new line.
 *
 */
public class plusMinus {

	static void plusMinus(int[] arr) {
	
		int sizeOfArray = 0;
		int valueOfInteger = 0;
		int numberOfNegativeIntegers = 0;
		int numberOfPositiveIntegers = 0;
		int numberOfZeros = 0;
		double ratioOfNegativeIntegers = 0;
		double ratioOfPositiveIntegers = 0;
		double ratioOfZeros = 0;
		boolean constraint = true;
		
		DecimalFormat df = new DecimalFormat("#.######");
		
		sizeOfArray = arr.length;
		
		if(sizeOfArray > 0 && sizeOfArray <= 100) {
			for(int i = 0; i < sizeOfArray; i++) {
				valueOfInteger = arr[i];
				
				if(valueOfInteger >= (-100) && valueOfInteger <= 100) {
					System.out.println(valueOfInteger);
					if(valueOfInteger < 0) {
						numberOfNegativeIntegers++;
					} else if(valueOfInteger == 0) {
						numberOfZeros++;
					} else {
						numberOfPositiveIntegers++;
					}
					
				} else {
					System.out.println("The value at the position " + i + " within the array is " + valueOfInteger + "...");
					System.out.println("Value is not within the constraint.");		
					constraint = false;
				}
				
				if(constraint == false) {
					break;
				}
			}
			
			System.out.println();
			
			System.out.println("The number of Positive Integers: " + numberOfPositiveIntegers);
			System.out.println("The number Of Negative Integers: " + numberOfNegativeIntegers);
			System.out.println("The number of Zeros: " + numberOfZeros);
			
			System.out.println();
			System.out.println("The Size of Array: " + sizeOfArray);
			System.out.println();
			
			ratioOfPositiveIntegers = (((double)numberOfPositiveIntegers)/sizeOfArray);
			ratioOfNegativeIntegers = (((double)numberOfNegativeIntegers)/sizeOfArray);
			ratioOfZeros = (((double)numberOfZeros)/sizeOfArray);
			
			System.out.println("The Ratio of Positive Integers: " + df.format(ratioOfPositiveIntegers));
			System.out.println("The Ratio of Negative Integers: " + df.format(ratioOfNegativeIntegers));
			System.out.println("The Ratio of Zeros: " + df.format(ratioOfZeros));
			
		} else {
			System.out.println("The size of the array is " + sizeOfArray + "...");
			System.out.println("Array is not within the constraints.");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[101];
		int[] arr1 = new int[59];
		int[] arr2 = new int[75];
		
		int positive = 0;
		int negative = 0;
		
		Random rand = new Random();
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
		}
		
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = rand.nextInt();
		}
		
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = rand.nextInt(100);
		}
		
		for(int i = 0; i < arr1.length; i++) {
			positive = arr[i];
			negative = (-positive);
			
			if(i%3 == 0) {
				arr1[i] = negative;
			}
		}
		
		for(int i = 0; i < arr2.length; i++) {
			positive = arr[i];
			negative = (-positive);
			
			if(i%4 == 0) {
				arr2[i] = negative;
			}
		}
		
		plusMinus(arr);
		System.out.println();
		plusMinus(arr1);
		System.out.println();
		plusMinus(arr2);
	}

}
