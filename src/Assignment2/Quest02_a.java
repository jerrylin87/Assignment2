package Assignment2;

import java.util.Arrays;

public class Quest02_a {

	public static void main(String[] args){
		
		int[] test = {1,2,4,6,3,7,8,9,10,11}; 			//get the missing integer//
		int max = test[test.length - 1];
		int min = test[0];
		int sum = Arrays.stream(test).sum();
		int actual = (((max*(max+1))/2)-min+1);			//Find:	
		System.out.println(actual - sum); 				//the missing value
	}
}