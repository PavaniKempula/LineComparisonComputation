package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	
	/*
	 * @param args
	 * Creating object of a class.
	 * Calling different methods using object except static methods.
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Line Comparison Problem");
		System.out.println("Enter the value of first Line X1,X2,Y1,Y1 :");
		Line firstLine = new Line(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		System.out.println("Enter the value of second line X1,X2,Y1,Y2 :");
		Line secondLine = new Line(scan.nextInt(), scan.nextInt(), scan.nextInt(), scan.nextInt());
		scan.close();
		/*
		 * Calculating length of an two line.
		 * using the Cartesian formula.
		 * Comparing two lines length using compare() method.
		 */
		LengthComparator lenthComparator = new LengthComparatorImpl();
		lenthComparator.compareUsingEqual(firstLine, secondLine);
		lenthComparator.compareUsingCompareTo(firstLine, secondLine);
	}

}