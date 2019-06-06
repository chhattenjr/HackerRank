import java.*;
import java.util.*;

/**
 * @author chhattenjr
 * @date 06/05/2019
 * @description Write a a program that prints a staircase of size n.
 *
 */

public class staircase {

	// Complete the staircase function below.
	static void staircase(int n) {
		
		if(n > 0 && n <= 100) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < (n-1) - i; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j <= i; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staircase(6);
	}

}
