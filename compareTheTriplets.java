import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 * @author chhattenjr
 * @date 05/24/2019
 * @description It must return an array of two integers, the first being Alice's score and the second being Bob's.
 */

public class compareTheTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
    	List<Integer> listResults = new ArrayList<>();
    	
    	int[] listAIntArray = new int[a.size()];
    	int[] listBIntArray = new int[b.size()];
    	
    	int aElement = 0;
    	int bElement = 0;
    	int aScore = 0;
    	int bScore = 0;
    	
    	for(int i = 0; i < a.size(); i++) {
    		aElement = a.get(i);
    		
    		if(aElement <= 100 && aElement >= 1){
    			listAIntArray[i] = aElement;
    		} else {
    			listAIntArray[i] = 0;
    		}
    	}
    	
    	for(int i = 0; i < b.size(); i++) {
    		bElement = b.get(i);
    		
    		if(bElement <= 100 && bElement >= 1) {
    			listBIntArray[i] = bElement;
    		} else {
    			listBIntArray[i] = 0;
    		}
    	}
    	
    	for(int i = 0; i < 3; i++) {
    		if(listAIntArray[i] < listBIntArray[i]) {
    			bScore+=1;
    		} else if( listAIntArray[i] > listBIntArray[i]) {
    			aScore+=1;
    		}
    	}

    	listResults.add(aScore);
    	listResults.add(bScore);
    	
    	return listResults;
    }

    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] aItems = null;
        		
        //bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int aItem = i;
            System.out.println("Item value: " + aItem);
            a.add(aItem);
        }

        String[] bItems = null;
        		
        //bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> b = new ArrayList<>();
        int j = 2;

        for (int i = 0; i < 3; i++) {
            int bItem = j;
            System.out.println("Item value: " + bItem);
            b.add(bItem);
            j--;
        }

        List<Integer> result = compareTriplets(a, b);
        
        System.out.println(result.toString());
        /*
        List<Integer> result = compareTriplets(a, b);

        for (int i = 0; i < result.size(); i++) {
            //bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
               // bufferedWriter.write(" ");
            }
        }
        */

        //bufferedWriter.newLine();

        //bufferedReader.close();
        //bufferedWriter.close();
    }
}
