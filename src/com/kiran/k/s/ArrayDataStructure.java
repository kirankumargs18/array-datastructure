package com.kiran.k.s;

import java.util.Scanner;

public class ArrayDataStructure {

	/*
	 * To search an element in an array
	 */
	private static void linearSearch(int arr[], int key) {

		for (int i = 0; i < arr.length; i++) {
			if (key == arr[i]) {
				System.out.println(key + " found at " + (i + 1) + " position");
				return;
			}
		}
		System.out.println(key + " does not exist in the array");
	}

	/*
	 * To sort an array elements in ascending order
	 */
	private static void sortArrayAsc(int[] arr) {

		System.out.println("Array elements sorted in Ascending Order : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		printArray(arr);
	}

	/*
	 * To sort an array elements in descending order
	 */
	private static void sortArrayDesc(int[] arr) {

		System.out.println("\nArray elements sorted in descending Order : ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		printArray(arr);
	}

	/*
	 * To find second largest element in the array
	 */
	private static void secondLargestElement(int arr[]) {

		int firstLargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (firstLargest < arr[i]) {
				firstLargest = arr[i];
			}
		}

		int secondLargest = Integer.MIN_VALUE;

		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > secondLargest && arr[j] < firstLargest) {
				secondLargest = arr[j];
			}
		}

		System.out.println("\nSecond largest element int the array : " + secondLargest);

	}

	/*
	 * To display elements of an array
	 */
	private static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	/*
	 * To swap two elements of an array
	 */
	private static void swap(int[] arr, int i, int j) {

		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter Array Size : ");
		int n = input.nextInt();

		int numberArray[] = new int[n];

		System.out.println("Enter Array Elements : ");
		for (int i = 0; i < n; i++) {
			numberArray[i] = input.nextInt();
		}

		// To search an element in the array
		System.out.println("Enter the element to be searched : ");
		int element = input.nextInt();
		linearSearch(numberArray, element);

		// Sort an array in ascending order
		sortArrayAsc(numberArray);

		// Sort an array in descending order
		sortArrayDesc(numberArray);

		// To find the second largest element in the array
		secondLargestElement(numberArray);

		input.close();

	}

}
