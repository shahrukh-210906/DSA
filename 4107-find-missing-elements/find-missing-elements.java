class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;

        int max = nums[n-1];

        int B[] = new int[max + 1];

        for (int i =0; i<n; i++){
            B[nums[i]]++;
        }

        List<Integer> output = new ArrayList<>();


        for (int i =nums[0]; i<B.length; i++){
            if (B[i] == 0){
                output.add(i);
            }
        }
        
        return output;
    }
}