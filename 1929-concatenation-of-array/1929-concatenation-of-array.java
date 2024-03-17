class Solution {
    public int[] getConcatenation(int[] num) {
        
        int[] ans=new int[num.length*2];
        for(int i=0;i<num.length;i++){
            ans[i]=num[i];
        }
        for(int i=num.length;i<ans.length;i++){
            ans[i]=num[i-num.length];
        }
        return ans;
    }
}