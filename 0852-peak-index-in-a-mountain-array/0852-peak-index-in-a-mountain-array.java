class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        return index;

    }
}