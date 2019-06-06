
/**
 * @author chhattenjr
 * @date 05/29/2019
 * @description Given a square matrix, calculate the absolute difference between the sums of its diagonals.
 *
 */
public class diagonalDifference {
	
	static int diagonalDifference(int[][] arr) {
		
		int numberOfRows = arr.length;
		int numberOfColumns = arr[0].length;
		
		int diagonalSumLeftToRight = 0;
		int diagonalSumRightToLeft = 0;
		
		System.out.println("Number of Rows: " + numberOfRows);
		System.out.println("Number of Columns: " + numberOfColumns + "\n");
		
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				try {
					int value = arr[i][j];
					
					if(value >= -100 && value <= 100) {
						System.out.println(arr[i][j]);
					}
					
				} catch (ArrayIndexOutOfBoundsException e){
					System.out.println("Row " + (i+1) + " does not have " + numberOfColumns + " columns...");
					System.out.println("This is not a square matrix.");
				}
			}
		}
		
		/*
		 * An algorithm that calculates the diagonal. The diagonal is 1x1, 2x2, 3x3, 4x4, etc. With that being said, the index for row and columns must equal in value.
		 */
		
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				if(i == j) {
					diagonalSumLeftToRight += arr[i][j];
				}
			}
		}
		
		System.out.println("Diagonal Sum, Left to Right: " + diagonalSumLeftToRight);
		
		int indexLeftToRight = 0;
		int indexRightToLeft = numberOfColumns-1;
		
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns; j++) {
				if(i == indexLeftToRight && j == indexRightToLeft) {
				diagonalSumRightToLeft += arr[indexLeftToRight][indexRightToLeft];
				}
			}
			
			indexLeftToRight++;
			indexRightToLeft--;
		}
		
		System.out.println("Diagonal Sum, Right to Left: " + diagonalSumRightToLeft);
		
		int diagonalDifference = 0;
		
		diagonalDifference = diagonalSumLeftToRight - diagonalSumRightToLeft;
		
		System.out.println("Difference Between the Two Values: " + diagonalDifference);
		
		int absoluteDiagonalDifference = Math.abs(diagonalDifference);
		
		System.out.println("Absolute Value: " + absoluteDiagonalDifference);
		
		return absoluteDiagonalDifference;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr = {
				{1, 2, 3},
				{4, 5, 6},
				{9, 8, 9}
		};
		
		int[][] arr2 = {
				{2,5,8},
				{4,5,6},
				{1,5}
		};

		diagonalDifference(arr);
		System.out.println("\n");
		diagonalDifference(arr2);
	}

}
