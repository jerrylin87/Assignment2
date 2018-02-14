package Assignment2;

public class Quest04 {

	public static void main(String[] args){
		
		int[] arr1 = {4,7,3,9,2};
        int[] arr2 = {3,2,12,9,40,32,4};
        for(int i=0;i<arr1.length;i++){
        	if (i == 0) {
        	System.out.println("The original arrays are: ");}
            System.out.print(arr1[i]+" ");
        }
        for(int i=0;i<arr2.length;i++){
        	if (i == 0) {
        	System.out.println();}
            System.out.print(arr2[i]+" ");
        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                	if (i == 0) {
                    System.out.println("\nThe common elements are: ");}
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}