/**
 * @author chhattenjr
 * @date 06/07/2019
 * @description Find how many candles can be blown out, when the tallest candles are the only candles that can be blown out.
 *
 */
public class birthdayCakeCandles {
	private static final double numberOfCandlesLimit = Math.pow(10, 5);
	private static final double heightOfCandlesLimit = Math.pow(10, 7);
	
	static int birthdayCakeCandles(int[] ar) {
		int[] manipulatedArray = ar;
		int length = ar.length;
		int tallest = 0;
		int numberOfTallestCandles = 0;
		
		boolean isValidArray = true;
		
		if(length <= 1 && length >= numberOfCandlesLimit) {
			isValidArray = false;
		} else {
			for(int i = 0; i < length; i++) {
				if(manipulatedArray[i] <= 1 && manipulatedArray[i] >= heightOfCandlesLimit) {
					isValidArray = false;
				}
			}
		}
			
		if(isValidArray) {
		
			System.out.println("Length of Array: " + length);
		
			for(int i = 0; i < length; i++) {
				System.out.println("Integers at index " + i + ": " + manipulatedArray[i]);
			}
		
			System.out.println();
		
			for(int i = 0; i < length; i++) {
				if(manipulatedArray[i] > tallest) {
					tallest = manipulatedArray[i];
				}
			}
		
			System.out.println("Tallest Candle: " + tallest);
		
			for(int i = 0; i < length; i++) {
				if(manipulatedArray[i] == tallest) {
					numberOfTallestCandles++;
				}
			}
		
			System.out.println("Number of Tallest Candles: " + numberOfTallestCandles);
		} else {
			System.exit(0);
		}
		
		System.out.println();
		
		return numberOfTallestCandles;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 2, 1, 3};
		
		System.out.println("Number of Candles that can be blown out: " + birthdayCakeCandles(arr));
	}

}
