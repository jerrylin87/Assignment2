package Assignment2;

public class Quest02_b {

public static void main(String[] args) 
{
	int flag;
    int[] a = {5,2,9,15,2,7,7,18,15,5};
    for(int i = 0; i < a.length-1; i++) { 
    	flag = 1;
		for (int j = 1; i < a.length-1; j++){
			if ((a[i] == a[j]) && (i != j))
				flag = 1;
				flag ++;
	        } 
		if (flag ==2)
	System.out.print("First non repeated elements are: "+ a[i]);
    	}
	}
}