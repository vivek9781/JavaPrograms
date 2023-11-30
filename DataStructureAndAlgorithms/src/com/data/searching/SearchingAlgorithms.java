package com.data.searching;

public class SearchingAlgorithms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]=searchData();
		int num=dataToSearch();
		//boolean result = linearSearch(nums, num);
		boolean result = binarySearch(nums, num);
		if(result) {
			System.out.println("Number found in data");
		}else {
			System.out.println("Number not found in data");
		}
	}
	
	
	private static int[] searchData() {
		
		int data[] = {12,14,21,24,32,35,36,42,46,47,51,55,57,61,63,70,72,75,88,89,91,92,99};
		return data;
	}
	
	private static int dataToSearch() {
		
		int num = 99;
		return num;
	}

	private static boolean linearSearch(int nums[], int num) {
		
		for(int i=0; i<nums.length;i++) {
			if(num == nums[i]) {
				return true;
			}
		}
		return false;
	}
	
	private static boolean binarySearch(int nums[], int num) {
		// 4,6,7,3,9,5,6
		// 7
		int left=0;
		int right=nums.length-1;
		int size=nums.length;
		int mid = (left+right)/2;
		
		for(int i=0; i<size; i++) {
			
			if(num == nums[mid]) {
				System.out.println("Checking equal");
				return true;
			}else if(num > nums[mid]) {
				left=mid+1;
				mid=(left+right)/2;
			}else if(num < nums[mid]) {
				right=mid-1;
				mid=(left+right)/2;
			}
		}
		return false;
	}
}
