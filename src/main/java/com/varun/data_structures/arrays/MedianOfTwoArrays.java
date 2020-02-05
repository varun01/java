package com.varun.data_structures.arrays;

import java.util.Arrays;

/**
 * Median for merging Two arrays of Equal length.
 * @author Varun
 *
 */
public class MedianOfTwoArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,12,15,26,38,12};
		int[] arr2 = {2,13,17,30,45,11};
		MedianOfTwoArrays obj = new MedianOfTwoArrays();
		int[] result = obj.mergeArrays(arr1, arr2);
		Arrays.sort(result);
		int length = result.length;
		if(length %2 ==0) {
			System.out.println(" Median is: "+(result[(length/2)-1] + result[(length/2)])/2);
		} else {
			System.out.println(" Median is: "+ result[(length/2)]);
		}
	}
	
	/**
	 * Merging Two arrays of equal length
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	int[] mergeArrays(int[] arr1, int[] arr2) {
		int[] result = new int[2*arr1.length];
		for(int i = 0; i < arr1.length ; i++ ) {
			result[i] = arr1[i];
			result[i+arr1.length] = arr2[i];
		}
		return result;
	}
}
