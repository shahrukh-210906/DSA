class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int curr =0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while (left<right){
            int min = Math.min (height[left], height[right]);
            curr = (right - left) * min;
            max = Math.max(curr, max);

            if (height[left]<height[right]){
                left ++;
            } else {
                right--;
            }
        }

        return max;
    }
}