/**
 * @author:
 * @description: Program to calculate area and circumference of circle
 * with user interaction. User will be prompt to enter the radius and 
 * the result will be calculated based on the provided radius value.
 */
package areaOfCircle;

import java.util.Scanner;

public class AreaOfCircleScanner {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the radius: ");
	      /*We are storing the entered radius in double
	       * because a user can enter radius in decimals
	       */
	      double radius = sc.nextDouble();
	      //Area = PI*radius*radius
	      double area = Math.PI * (radius * radius);
	      System.out.println("The area of circle is: " + area);
	      //Circumference = 2*PI*radius
	      double circumference= Math.PI * 2*radius;
	      System.out.println( "The circumference of the circle is:"+circumference) ;
	}

}
