package com.bridgelabz.InsertionSort;

public class InsertionSort {

	public void insertionSortMeth(int array[]) {

		for (int j = 0; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while ((i > -1) && (array[i] > key)) {
				array[i + 1] = array[i];
				i--;
			}
			array[i + 1] = key;
		}
	}

	public static void main(String a[]) {
		InsertionSort i = new InsertionSort();
		int[] arr1 = { 9, 14, 3, 2, 43, 11, 58, 22 };
		System.out.println("Before Insertion Sort");
		for (int in : arr1) {
			System.out.print(in + " ");
		}
		System.out.println();

		i.insertionSortMeth(arr1);

		System.out.println("After Insertion Sort");
		for (int item : arr1) {
			System.out.print(item + " ");
		}
	}
}
