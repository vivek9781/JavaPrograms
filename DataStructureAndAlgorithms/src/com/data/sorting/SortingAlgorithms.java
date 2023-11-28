package com.data.sorting;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = unSortedData();
		System.out.print("Unsorted Data \n" );
		for(int num: nums)
		System.out.print(num + " ");
		
		bubbleSort(nums);
	}
	
	private static void bubbleSort(int nums[]) {
		// 7,5,3,8,9,2,6
		System.out.println(" \n\nStarting bubble sort ...");
		
	}
	
	private static int[] unSortedData() {
		
		int nums[] = {12,42,23,24,14,25,65,33,55,65,84};
		return nums;
	}
}
