package Assignment2;

public class Quest03_c {

public static void main(String[] args) {
	System.out.println("The original array is: ");

	String a[] = {"java","hibernate","python","scala","hibernate"};
		
	for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					a[i]="0"; 
				} 
			}
			if(a[i].equals("0")) {
				continue;
			}else {
				System.out.print(a[i]+" ");
			}
		}
	}
}



