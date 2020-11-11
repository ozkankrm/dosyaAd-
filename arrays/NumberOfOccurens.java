package arrays;

public class NumberOfOccurens {

	public static void main(String[] args) {
		/*
		 * 	Write a program that displays the number of occurences of an element in array
		 * 
		 * [1,1,1,2,3,4]
		 * 3 occurs 1 time
		 * 1 occurs 3 times
		 * 7 occurs 0 times
		 */

		int[] numbers = {1,1,1,2,3,4};
		
		int searchElement = 3;
		
		System.out.println(getNumberOcc(numbers, searchElement));
		
	
	}

	public static int getNumberOcc(int[] numbers, int searchElement) {
		
		int occ = 0;
		for(int i=0; i<numbers.length; i++) {
			
			if(searchElement==numbers[i]) {
				occ++;
			}
		}
		return occ;
		
		
	}
	
	
	
	
}
