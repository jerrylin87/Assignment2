package Assignment2;

public class Quest02_d {

	public static void main(String[] args) {
		        int[] a = {16,7,89,20,7,99,21,56,12,10};
		 
		        for (int i = 0; i < a.length-1; i++)
		        {
		            for (int j = i+1; j < a.length; j++)
		            {
		                if ((a[i] == a[j]) && (i != j))
		                {
		                    System.out.println("Duplicate Element : "+a[j]);
		                }
		            }
		        }
		    }    
		}