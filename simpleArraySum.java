import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/*
 * @author chhattenjr
 * @date 05/24/2019
 * @description It must return the sum of the array elements as an integer.
 */

public class simpleArraySum {

    /*
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
    	
    	int total = 0;

        // First need to access each array in the list
        for(int a : ar){
        	// Within the for loop, the numbers of the integer array should be added together. 
            System.out.println(a);
            
            total += a;
            
        }
        
        return total;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	int[] arrayIntegers = {1, 2, 4, 6, 7, 8};
    	
    	System.out.println("Total: " + simpleArraySum(arrayIntegers));
    	
    	/*
        int arCount = Integer.parseInt(scanner.nextLine().trim());

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");

        for (int arItr = 0; arItr < arCount; arItr++) {
            int arItem = Integer.parseInt(arItems[arItr].trim());
            ar[arItr] = arItem;
        }

        int result = simpleArraySum(ar);
        */
        

        //bufferedWriter.write(String.valueOf(result));
        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}

