package arrays;

import java.util.Scanner;

public class It_BJP5_Self_Check_7_13_PrintElements {

	public static void main(String[] args) {
		/*
		 * Write code that uses a for loop to print each element of an array named data that contains five integers. 
		 * If the array contains the elements [14, 5, 27, -3, 2598], then your code should produce the following output:

element [0] is 14
element [1] is 5
element [2] is 27
element [3] is -3
element [4] is 2598
Once your code works for the array of size 5, generalize the code so that it works for an array of any length.
		 */
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];

		for(int i=0; i<size; i++){
		      arr[i] = scan.nextInt();
		      
		    }
		for(int i=0; i<size; i++){
			
			 System.out.println("element [" + i + "] is " + arr[i]); 
		      
		    }

		 
		
		
		
	}
	
	

}
