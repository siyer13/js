package com.workwave.jsonparser.JsonParser;

public class MaxTwoDuplicates {

	public static void main(String[] args) {
		MaxTwoDuplicates mtd = new MaxTwoDuplicates();
		int[] nums = {1,1,1,2,2,3};
		System.out.println(mtd.removeDuplicates(nums));

	}
	
	public int removeDuplicates(int[] nums) {
	    int i = 0;
	    for (int n : nums)
	        if (i < 2 || n > nums[i-2]){
	        	//System.out.println("NUMS[i-2] : " + nums[i-2]);
	        	System.out.println("[I] : " + i);
	        	System.out.println("[N] : " + n);
	            nums[i++] = n;
	        }
	    return i;
	}

}
