class Solution {
    public int[] twoSum(int[] nums, int target) {
        int output [] = new int[2];
        for (int i =0; i<nums.length; i++){
            for (int j =0 ; j<nums.length; j++){
                int test = nums[i] + nums[j];

                if (test == target && i != j){
                    output[0] = i;
                    output[1] = j;
                }
            }
        }
        return output;
        
    }
}