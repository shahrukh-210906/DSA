class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];

        int sumL = 0;
        leftSum[0] = 0;

        for (int i = 1; i<n; i++){
            sumL = sumL + nums[i-1];
            leftSum[i] = sumL;
        }

        int sumR = 0;
        rightSum[n-1] = 0;

        for (int i = n-2; i>=0; i--){
            sumR = sumR + nums[i+1];
            rightSum [i] = sumR;
        }

        int output[] = new int[n];
        int diff;

        for (int i =0; i<n; i++){
            diff = leftSum[i] - rightSum[i];
            output[i] = Math.abs(diff);
        }

        return output;
    }
}