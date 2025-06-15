class Solution {
    public int[] rearrangeArray(int[] nums) {
        int len=nums.length;
        int temp[]=new int[len];
        int pos=0,neg=1;

        for(int num:nums){
            if(num>0){
                temp[pos]=num;
                pos=pos+2;
            }else{
                temp[neg]=num;
                neg=neg+2;
            }
        }
        return temp;
    }
}