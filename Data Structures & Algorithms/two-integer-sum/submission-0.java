class Solution {
    public int[] twoSum(int[] nums, int target) {
        int j=nums.length-1;
        while(j>0){
            for(int i=0;i<nums.length;i++){
                int num=target-nums[j];
                if(nums[i]==num){
                    return new int[]{i,j};
                    
                }
                
            }
            j--;
        }
        return new int[]{};
    }
}
