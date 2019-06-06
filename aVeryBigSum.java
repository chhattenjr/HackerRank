import java.util.Random;

/**
 * @author chhattenjr
 * @date 05/28/2019
 * @description Calculate and print the sum of the elements in an array,
 * keeping in mind that some of those integers may be quite large.
 *
 */
public class aVeryBigSum {

	public static long aVeryBigSum(long[] ar) {
		long sum = 0;
		
		for(int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long[] ar = new long[100];
		long sum = 0;
		
		Random rand = new Random();
		
		for(int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000000000);
		}
		
		sum = aVeryBigSum(ar);
		
		System.out.println("Sum of Long Array: " + sum);
	}

}
