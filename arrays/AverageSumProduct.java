package arrays;

import java.util.Scanner;

public class AverageSumProduct {

	public static void main(String[] args) {
		/*
		 * Write a program that display the sum, product, and average of the elements 
		 * of an integer array
		 */
		
		
		Scanner scn = new Scanner(System.in);
		
		int[] num = new int[5];
		
		int product = 1;
		int sum = 0;
		double average;
		
		for(int i=0; i<num.length; i++) {
			num[i] = scn.nextInt(); 
			
			product *= num[i];
			
			sum  += num[i];	
		}
		
		average = sum/num.length;
		System.out.println(sum);
		System.out.println(average);
		System.out.println(product);
		
		System.out.println("sum= " + sum+ " product= " + product+ " average= " + average);
		

	}

}
