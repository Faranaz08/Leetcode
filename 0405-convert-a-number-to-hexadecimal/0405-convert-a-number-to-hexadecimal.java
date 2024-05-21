class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        String ans="";
        String hex="0123456789abcdef";
        int count=0;
        while(count<8 && num!=0){
            char c=hex.charAt(num&15);
            ans=c+ans;
            num=num>>4;
            count++;
        }
        return ans;
    }
}