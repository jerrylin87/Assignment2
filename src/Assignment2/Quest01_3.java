package Assignment2;

public class Quest01_3 {

	public static void main(String[] args) {
		for (int i=1; i<6; i++)
		{
		    for (int k=0; k<5-i; k++)
		    {
		        System.out.print(" ");
		    }
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("x ");
		    }
		    System.out.println();
		}
	}
}