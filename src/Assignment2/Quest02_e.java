package Assignment2;

public class Quest02_e {

	public static void main(String[] args) {
		    int[] a = {16,4,89,20,7,99,21,56,12,10};
			int max_val = a[0];
			int min = a[0];
			for(int i = 1; i < a.length; i++)
			{
				if(a[i] > max_val)
					max_val = a[i];
				else if(a[i] < min)
					min = a[i];
			}
			System.out.println("Smallest value = " +min);
			System.out.println("Largest value = " +max_val);					
	}
}
