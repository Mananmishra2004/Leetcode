class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i<n-2; i++){
            if (i>0 && nums[i]== nums[i-1]){
                continue;
            }
            int left = i+1, right = n-1;
            int terget = -1*nums[i];
            while(left<right){
                int sum = nums[left]+ nums[right];
                if (sum==terget){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
                  while(left<n && nums[left] == nums[left-1]){
                    left++;
                   }
                 while(right>0 && nums[right]== nums[right+1]){
                    right--;
                  }
                }
                else if(sum<terget){
                    left++;
                }
                else if(sum>terget){
                    right--;
                }
               
            }
        }
        return result ;
    }
}