package Solution;

public class Solution { // 20230112
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];
        
		for(int i = 0; i < nums1.length; i++) {
			int max = nums1[i];
			
			for(int j = 0; j < nums2.length; j++) {
				if(nums1[i] == nums2[j]) {
					if(j == nums2.length - 1) break;
					
					for(int k = j + 1; k < nums2.length; k++) {
						if(nums2[k] > max) {
							max = nums2[k];
							break;
						}
					}
					break;
				}
			}
			
			if(nums1[i] == max) result[i] = -1;
			else result[i] = max;
		}
//		for(int i = 0; i < result.length; i++) System.out.print(result[i] + " ");
		return result;
    }
}
