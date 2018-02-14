package Assignment2;

import java.util.Arrays;

public class Quest02_c {

	public static void main(String[] args) {
	        int[] a = {5,2,9,15,2,7,7,18,15,5};
	        System.out.println(Arrays.toString(sortArray(a)));
	    }

	public static int[] sortArray(int[] a){
	    int[] sortedArray = new int[a.length];
	    int temp;
	    for (int i = 0; i <= a.length; i++) 
	    {
	        for (int j = i+1; j < a.length; j++)
	        {
	            if (a[i] > a[j]) 
	            {
	                temp = a[i];
	                a[i] = a[j];
	                a[j] = temp;
	            sortedArray = a;
	            }
	        }
	    }
	    return sortedArray;
	}
}