package arrays;

import java.util.Arrays;

public class It_BFP5_Self_Check_7_15_PrintBackwards {

	public static void main(String[] args) {
		/*
		 * Write a method printBackwards that prints an array of integers in reverse order, in the following format.

For the array {1, -3, 4, 7, 2}:

element [4] is 2
element [3] is 7
element [2] is 4
element [1] is -3
element [0] is 1
		 */

		int[] arr = {1,-3,4,7,2};
		
		System.out.println(Arrays.toString(printBackwards(arr)));
		
		
	}

	public static int[] printBackwards(int[] array){

		int [] newArr = new int[array.length];
	    
	    int x = array[0];
	    newArr[0] = array[array.length-1];
	    for(int i=0; i<array.length-1; i++){
	    
	        newArr[i+1] = array[array.length-2-i];
	    
	    }
	     newArr[newArr.length-1] = x;
	    
	    return newArr;

	}
}
