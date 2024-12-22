class Solution {
    public int candy(int[] ratings) {
        int n=ratings.length;
        int record[]=new int[n];
       for(int i=0;i<n;i++){
        record[i]=1;
       }
       for(int i=1;i<n;i++){
        if(ratings[i]>ratings[i-1]){
            record[i]=record[i-1]+1;
        }
       }
       for(int i=n-2;i>=0;i--){
        if(ratings[i]>ratings[i+1]){
            record[i]=Math.max(record[i],record[i+1]+1);
        }
       }
       int total=0;
       for(int candy: record){
        total+=candy;
       }
    return total;

    }
}