class Solution {
    public int findDuplicate(int[] nums) {
        int m = nums.length;
        Arrays.sort(nums);
        int output = 0;

        for (int i =0; i<m; i++){
            if (nums[i] - nums[i+1] ==0){
                output = nums[i];
                break;
            }
        }
        return output;
    }
}