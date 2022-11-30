package com.perscholas.java_basics.arraypractice;

import java.util.Scanner;

public class AssignArrayValue {

	public static void main(String[] args) {

		/*
		 * Write a program where you create an integer array of 5 numbers. Loop through
		 * the array and assign the value of the loop control variable multiplied by 2
		 * to the corresponding index in the array.
		 * 
		 * Write a program where you create an array of 5 elements. Loop through the
		 * array and print the value of each element, except for the middle (index 2)
		 * element.
		 * 
		 * 
		 */
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = i * 2;
			if (i == array.length / 2) {
				continue;
			} else {
				System.out.println(array[i]);
			}
		}

		/*
		 * Write a program that creates a String array of 5 elements and swaps the first
		 * element with the middle element without creating a new array.
		 */

		System.out.println("Array before swap");
		for (int value : array)
			System.out.print(value + " ");
		System.out.println();
		int temp = array[0];
		array[0] = array[array.length / 2];
		array[array.length / 2] = temp;
		System.out.println("Array after swapping first and middle element");
		for (int value : array)
			System.out.print(value + " ");

		/*
		 * Write a program to sort the following int array in ascending order: {4, 2, 9,
		 * 13, 1, 0}. Print the array in ascending order, and print the smallest and the
		 * largest element of the array. The output will look like the following:
		 * 
		 * Array in ascending order: 0, 1, 2, 4, 9, 13 The smallest number is 0 The
		 * biggest number is 13
		 */
		System.out.println();

		int[] a = { 4, 2, 9, 13, 1, 0 };
		System.out.println("Values of the original array");
		for (int value : a) {
			System.out.print(value + " ");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;
				}
			}

		}
		System.out.println("Values in ascending order");
		for (int value : a)
			System.out.print(value + " ");
		
		/*Create an array that includes an integer, 3 strings, and 1 double. Print the array.*/
		
		System.out.println();
		Object[] s = {1,"str1","str2","str3",1.03};
		for(int i=0;i<s.length;i++) {
			System.out.print(s[i]+" ");
		}
		
		
		/*Write some Java code that asks the user how many favorite things they have. 
		 * Based on their answer, you should create a String array of the correct size.
		 *  Then ask the user to enter the things and store them in the array you created.
		 *   Finally, print out the contents of the array.
		 */
		
		System.out.println();
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter how many favorite things do you have");
		int count=s1.nextInt();
		System.out.println("Enter your favorite things");
		String[] favThings = new String[count];
		for(int i=0;i<count;i++)
		{
			favThings[i]=s1.next();
		}
		System.out.println();
		System.out.println("Your favorite things are");
		for(String value:favThings)
		{
			System.out.print(value+" ");
		}
		
		
		
		
		
		
		
		
		
		

		
		

	}

}
