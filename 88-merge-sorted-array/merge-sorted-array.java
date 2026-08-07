class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx =0;

        for (int i =0; i<m+n; i++){
            if (nums1[i] == 0){
                nums1[i] = nums2[idx];
                idx++;
            }
            if (idx == n){
                break;
            }
        }

        Arrays.sort(nums1);
    }
}