package com.varun.data_structures;

import java.util.Arrays;

public class MedianOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,12,15,26,38,12};
		int[] arr2 = {2,13,17,30,45,11};
		MedianOfTwoArrays obj = new MedianOfTwoArrays();
		int[] result = obj.mergeArrays(arr1, arr2);
		Arrays.sort(result);
		int length = result.length;
		System.out.println(5/2);
		if(length %2 ==0) {
			System.out.println("Even median is: "+(result[(length/2)-1] + result[(length/2)])/2);
		} else {
			System.out.println("Odd median is: "+ result[(length/2)]);
		}
	}
	
	int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] result = new int[2*arr1.length];
		for(int i = 0; i < arr1.length ; i++ ) {
			result[i] = arr1[i];
			result[i+arr1.length] = arr2[i];
		}
		return result;
	}
}
