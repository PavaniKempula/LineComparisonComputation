package com.bridgelabz;
import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Displaying Welcome Message for User
		System.out.println("Welcome to Line Comparison Computation Program");
     
		 //Taking a integer value from user for first point of co-ordinates
        System.out.println("Enter the First point of Co-ordinates");
        System.out.println("Enter x1 value : ");
        int x1 = scan.nextInt();
        System.out.println("Enter y1 value : ");
        int y1 = scan.nextInt();
        
        //Taking a integer value from user for second point of co-ordinates
        System.out.println("Enter the Second point Co-ordinates");
        System.out.println("Enter x2 value : ");
        int x2 = scan.nextInt();
        System.out.println("Enter y2 value : ");
        int y2 = scan.nextInt();
        
        //calculating the length of a line
        double firstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length of line : " + firstLine);
    }
	
}