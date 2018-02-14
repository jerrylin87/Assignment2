package Assignment2;

public class Quest01_6 {

	public static void main(String[] args) {

		for (int i=1; i<6; i++) //row
		{
			int j;
		    for (j=1; j<i; j++) // column
		    {
		    	System.out.print(j+" ");
		    }
		    	for (int k=j; k>0; k--) // inverse
			    {
		        System.out.print(k+" ");
		    }
		    System.out.println("");
		}
	}		
}
