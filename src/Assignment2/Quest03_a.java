package Assignment2;

import java.util.Arrays;

public class Quest03_a {
		static void reverseArray(String inputArray[])
		{
			System.out.println("Array Before Reverse : "+Arrays.toString(inputArray));
			
			String temp;
			
			for (int i = 0; i < inputArray.length/2; i++) 
			{
				temp = inputArray[i];
				
				inputArray[i] = inputArray[inputArray.length-1-i];
				
				inputArray[inputArray.length-1-i] = temp;
			}
			
			System.out.println("Array After Reverse : "+Arrays.toString(inputArray));
		}
		
		public static void main(String[] args) 
		{	
			reverseArray(new String[]{"java", "oracle", "python", "scala", "hibernate"});
			
		}	
	}