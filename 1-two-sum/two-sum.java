class Solution {
    public int[] twoSum(int[] nums, int target) {
     for (int i=0;i<nums.length;i++){
        for(int j =i+1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                return new int[]{i,j};
            }
        }
     }
     return new int[]{-1,-1};
    }
    public  void main(String[] Args){
        Scanner scn = new Scanner(System.in);
        int nums[]= new int[4];
        for (int i=0; i<nums.length;i++){
            nums[i]=scn.nextInt();
        }
        int target= scn.nextInt();
        int[] result=twoSum(nums,target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }
}