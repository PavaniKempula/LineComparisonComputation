package com.bridgelabz;
import java.util.*;

public class LineComparison {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Displaying Welcome Message for User
		System.out.println("Welcome to Line Comparison Computation Program");
     
		//Taking an integer values from user 
        System.out.println("Enter the First Line of first point Co-ordinates");
        System.out.println("Enter x1 value : ");
        int x1 = scan.nextInt();
        System.out.println("Enter y1 value : ");
        int y1 = scan.nextInt();
        
        System.out.println("Enter the First Line of second point Co-ordinates");
        System.out.println("Enter x2 value : ");
        int x2 = scan.nextInt();
        System.out.println("Enter y2 value : ");
        int y2 = scan.nextInt();
        
        //calculating length of FirstLine
        Double firstLine = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        System.out.println("Length of firstLine : " + firstLine);
        
        //Taking an integer values from user
        System.out.println("Enter the Second Line of first point Co-ordinates");
        System.out.println("Enter x3 value : ");
        int x3 = scan.nextInt();
        System.out.println("Enter y3 value : ");
        int y3 = scan.nextInt();

        System.out.println("Enter the Second Line of second point Co-ordinates");
        System.out.println("Enter x4 value : ");
        int x4 = scan.nextInt();
        System.out.println("Enter y4 value : ");
        int y4 = scan.nextInt();
        
        //calculating length of SecondLine
        Double secondLine = Math.sqrt(Math.pow((x4 - x3),2) + Math.pow((y4 - y3),2));
        System.out.println("Length of Second Line : " + secondLine);
  
        //Checking equality of FristLine & SecondLine
        if((firstLine).equals(secondLine)) { 
        	System.out.println("Length of FirstLine & SecondLine are equal");
        	
        }	
        else {
        	System.out.println("Length of FirstLine & SecondLine are not equal");
        } 
        
        // Comparing FirstLine & SecondLine
        int result = (firstLine.compareTo(secondLine));

        if(result > 0) {
            System.out.println("FirstLine is greater than SecondLine");
        } else if(result < 0) {
            System.out.println("SecondLine is greater than FirstLine");
        } else {
            System.out.println("FirstLine is equals to SecondLine");
        }
    }
	
}