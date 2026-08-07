class Solution {
    public int maxSubArray(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        int flag = 0;
        int output = 0;

        for (int i = 0; i<nums.length; i++){
            if (nums[i] > 0){
                flag = 1;
            }
        }

        if (flag == 1){
            for (int i =0; i<nums.length; i++){
                cs = cs + nums[i];

                if (cs < 0){
                    cs = 0;
                }

                ms = Math.max(ms, cs);
            }

            output = ms;
        } else {
            for (int i = 0; i<nums.length; i++){
                if (nums[i] > ms){
                    ms = nums[i];
                }
            }
            output = ms;
        }
        return output;
    }
}