class Solution {
    public int[] searchRange(int[] nums, int target) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] == target) {
                        k = j;
                    }

                }
                if (k == 0) {
                    return new int[] { i, i };
                }
                return new int[] { i, k };

            }
            
        }
        return new int[] { -1, -1 };

    }
}