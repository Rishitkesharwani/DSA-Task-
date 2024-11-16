class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length-1;
        int arr[]=new int[n];
        int count=1;
      for(int i=0;i<=n;i++){
        if(nums[i]!=nums[count-1]){
            nums[count]=nums[i];
            count++;
        }
      }
      return count;
    }
}