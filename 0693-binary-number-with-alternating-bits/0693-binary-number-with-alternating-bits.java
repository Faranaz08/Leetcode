class Solution {
    public boolean hasAlternatingBits(int n) {
      int a=n&1;
        n=n>>1;
        while(n>0){
            if((n&1)==a){
                return false;
            }
            a=n&1;
            n=n>>1;
        }
        return true;
    }
}