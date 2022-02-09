/**
 * @description: User would enter the 10 elements
 * and the program will store them into an array and 
 * will display the sum of them.
 */
package sumofArraybyScanner;

import java.util.Scanner;

public class SumOfArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	      int[] array = new int[6];
	      int sum = 0;
	      System.out.println("Enter the elements:");
	      for (int i=0; i<6; i++)
	      {
	    	  array[i] = scanner.nextInt();
	      }
	      for( int num : array) {
	          sum = sum+num;
	      }
	      System.out.println("Sum of array elements is:"+sum);

	}

}
