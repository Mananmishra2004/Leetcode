class Solution {
    public int searchInsert(int[] nums, int target) {
    for(int i =0;i<nums.length;i++){
        if(nums[i]>=target){
            return i;
        }
       
    }
 return nums.length;
    }
    public static void main(String[] Args){
        
        Scanner scn = new Scanner(System.in);
        int nums[]= new int [4];
        int target= scn.nextInt();
        for(int i =0;i<nums.length;i++){
            nums[i]=scn.nextInt();
        }

    }
}