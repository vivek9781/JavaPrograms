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
		int temp=0;
		int size = nums.length;
		int steps=0;
		
			for(int i=0; i<size; i++) {
				for(int j=0; j<size-i-1; j++) {
					if(nums[j]> nums[j+1]) {
						temp=nums[j];
						nums[j]=nums[j+1];
						nums[j+1]=temp;
						++steps;
					}
				}
			}
		
		
		System.out.println("After Sorting \n");
		System.out.println("Total step taken: " + steps);
		for(int num: nums) {
			System.out.print(num + " ");
		}
	}
	
	private static int[] unSortedData() {
		
		int nums[] = {12,42,23,24,14,25,65,33,55,84};
		return nums;
	}
}
