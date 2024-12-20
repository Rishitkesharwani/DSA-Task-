class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);

        int count = 1; 
        int majorityCandidate = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                count++;
            } else {
                count = 1;
            }

            if (count > nums.length / 2) {
                majorityCandidate = nums[i];
                break;
            }
        }

        return majorityCandidate;
    }
}
