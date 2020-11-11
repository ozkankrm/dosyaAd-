package arrays;

import java.util.Arrays;

public class ComparingArrays {

	public static void main(String[] args) {
		
		//using egulas()
		// compare int
		int[]numbers1 = {5,4,3,2,1,0,-1};
		int[]numbers2 = {5,4,3,2,1,0,-1};
		int[]numbers3 = {1,2,3,7,7,8,1};
		
		System.out.println(numbers1==numbers2);// false
		
		System.out.println(Arrays.equals(numbers1, numbers2));//true
		
		System.out.println(Arrays.equals(numbers1, numbers3));//false
		
		//compare string
		// java elementlerin adresleri check eder aynı ise eşittr. yoksa false
		String[] str1 = {"a", "b", "c"};
		String[] str2 = {"a", "b", "c"};
		
		System.out.println(Arrays.equals(str1, str2));// true

	}

}
