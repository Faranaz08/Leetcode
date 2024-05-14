class Solution {
    public int countPrimes(int n) {
        
        
        // 
        boolean[] arr=new boolean[n];
        Arrays.fill(arr,true);
        int c=0;
        for(int i=2;i<n;i++){
            if(arr[i]){
                c++;
            }
            for(int j=i*2;j<n;j=j+i){
                arr[j]=false;
            }
        }
        return c;
    }
}