package com.liberty.springbootstarter.test;

public class SecondLargest {
	
	public static void main(String[] args) {
		int[] array = {3,6,4,9,6,1,4,7,9};
		
		int min = findSecondmin(array);
		System.out.println(min);
	}

	private static int findSecondmin(int[] array) {
		int smallest=array[0];
		int smaller=array[0];
		for (int i=1;i<array.length;i++) {
			if (array[i] < smallest) {
				smaller = smallest;
				smallest = array[i];
			}
			else if (array[i] < smaller)
				smallest = array[i];
		}
		return smaller;
	}

}
