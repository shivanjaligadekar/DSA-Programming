package dsaprogramming;

import java.util.Arrays;

public class MergeArrayUsingForLoop {

	public static void main(String[] args) {
		int[] arr1= {1,3,5};
		int[] arr2= {2,4,6};
		int[] merged=new int[arr1.length +arr2.length];
		
		int i=0;
		for(int num:arr1) {
			merged[i++]=num;
		}
		for(int num:arr2) {
			merged[i++]=num;
		}
		System.out.println(Arrays.toString(merged));
	}
}
