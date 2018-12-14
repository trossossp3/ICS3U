package com.bayviewglen.daythree;

import java.util.Arrays;

public class SortingSearchingAlgorithms {

	public static void main(String[] args) {
		int[] x = createArray(10);
		display(x);
		selectionSort(x);
		display(x);
		System.out.println();
		x = createArray(100);
		display(x);
		insertionSort(x);
		display(x);
		
		System.out.println(16 + " is located at index: " + binarySearch(x,16));
		
	}

	public static void selectionSort(int[] arr) {
		//selection sort is worse the insertion on average
		for(int i =0; i<arr.length-1; i++){
			int minIndex = i;
			for(int j = i+1; j<arr.length;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

	public static void insertionSort(int[] arr) {
		for(int i =1; i<arr.length; i++){
			int temp = arr[i];
			int j;
			for(j = i-1; j>=0 && temp < arr[j] ;j--) {
				arr[j+1] = arr[j];
			}
			
			arr[j+1] = temp;
			
			
		}
	}

	public static int binarySearch(int[] arr, int value) {
		int leftIndex =0, rightIndex = arr.length -1;
		while(leftIndex<=rightIndex)
		{
			int midIndex =leftIndex +(rightIndex-leftIndex)/2;
			
			//check if x is present at mid
			if(arr[midIndex]==value) {
				return midIndex;
			}
			//if x greater, ignore left half
			if(arr[midIndex]<value) {
				leftIndex =midIndex +1;
			}
			
			// if x is smaller, ignore right half
			else {
				rightIndex=midIndex-1;
			}
			
			
		}
		//if we reach here, that element was not present
		return -1;
	}

	public static int[] createArray(int size) {
		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 25);
		}

		return arr;
	}

	public static void display(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}

}
