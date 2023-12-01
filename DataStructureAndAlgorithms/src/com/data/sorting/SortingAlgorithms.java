package com.data.sorting;

public class SortingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = unSortedData();
		System.out.print("Unsorted Data \n" );
		for(int num: nums) {
		System.out.print(num + " ");
		}
		System.out.println("\n**************");
		//bubbleSort(nums);
		//selectionSort(nums);
		insertionSort(nums);
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
	
	private static void selectionSort(int nums[]) {
		int maxIndex=-1;
		int size=nums.length;
		int temp=0;
		
		
		for(int i=0; i<size-1;i++) {

			maxIndex=i;
			for(int j=i+1; j<size;j++) {
				
				if(nums[maxIndex] > nums[j]) {
					maxIndex=j;
				}
				
			}
			temp=nums[maxIndex];
			nums[maxIndex]=nums[i];
			nums[i]=temp;
			System.out.println();
			for(int num: nums) {
				System.out.print(num + " ");
			}
		}
		
		
	}
	
	private static void insertionSort(int nums[]) {
		// 4,2,8,5,3
		
		int key=0;
		int size=nums.length;
		//int temp=0;
		
		for(int i=1; i<size;i++) {

			key=nums[i];
			int j=i-1;
			
			while(j>=0 && nums[j] > key) {
			
				nums[j+1]=nums[j];
				j--;
			}
			
			nums[j+1]=key;
			
		}
		
		System.out.println("Sorted Data \n");
		for(int num: nums) {
			System.out.print(num + " ");
		}
	}
	private static int[] unSortedData() {
		
		int nums[] = {12,42,2,24,14,44};
		return nums;
	}
	
}
