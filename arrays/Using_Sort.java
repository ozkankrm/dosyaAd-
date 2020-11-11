package arrays;

import java.util.Arrays;

public class Using_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int[] number = {-1,-5,4,0,1,9,2,-20,4};
		Arrays.sort(number);// -20,-5,-1,0,1,2,4,9// rakamlarý büyükten küçüðe doðru sýralar

//		System.out.println(Arrays.sort(number));
		
		char[] letters = {'a','c','k','r','l','z', 'D','ý','e', 'A','b','m'};
		Arrays.sort(letters);// A,D,a,b,c .... diye sýralar. önce capital hepsi sonra diðerleri sýrayla
		
//		System.out.println(Arrays.sort(letters));
		int[] unicodes = {'a', 'z', 'b', 'w', 'Z', 'C', 'H', 'L', 'F'};
		Arrays.sort(unicodes);// 65, 67,68 vs diye küçükten büyüðe sýralar
		
		
		String[] str = {"hij", "abc", "efg"};
		Arrays.sort(str);// abc, efg, hij
							// array içindeki elemenkleri uzunluðuna göre ve alfabetk yani 
							// sýralar unicode göre
		
	}

}
