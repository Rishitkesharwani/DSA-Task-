class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        boolean visited[]=new boolean[n];
        int fre[]=new int[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            int count=1;
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    visited[j]=true;
                    count++;
                }
            }
            fre[i]=count;

        }
          int maxFreq = 0;
        for (int i = 0; i < n; i++) {
            if (fre[i] > maxFreq) {
                maxFreq = fre[i];
            }
        }
        int totalCount = 0;
        for (int i = 0; i < n; i++) {
            if (fre[i] == maxFreq) {
                totalCount += fre[i];
            }
        }

        return totalCount;

        
    }
}