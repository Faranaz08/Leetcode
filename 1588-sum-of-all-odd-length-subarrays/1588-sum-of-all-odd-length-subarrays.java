class Solution {
    public int sumOddLengthSubarrays(int[] A) {
        int sum=0;
        for(int i=0;i<A.length;i++){
            for(int j=i;j<A.length;j+=2){
                for(int k=i;k<=j;k++){
                    sum+=A[k];
                }
            }
        }
        return sum;
    }
}