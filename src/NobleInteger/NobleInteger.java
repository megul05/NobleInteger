package NobleInteger;

import java.util.*;

public class NobleInteger {
	
	 public static int nobleInteger(int[] array){
	        Arrays.sort(array);
	        int greaterArrayValues[] = new int[array.length];
	        for (int i = 0 ; i < array.length ;i++){
	            int sum = 0;
	            for (int j = i + 1 ; j < array.length ;j++){
	                sum += (array[i] < array[j]) ? 1 : 0;
	            }
	            greaterArrayValues[i] = sum;
	        }
	        int count = 0;
	        for (int i = 0 ;i < array.length ; i++){
	            count += (array[i] == greaterArrayValues[i]) ? 1 : 0;
	        }
	        return (count == 0) ? -1 : count ;
	    }

	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
			int size = scan.nextInt();
			int[] array = new int[size];
			for(int i=0;i<size;i++)
			{
				array[i] = scan.nextInt();
			}
	        System.out.println(nobleInteger(array));
	    }
}
