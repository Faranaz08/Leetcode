import java.util.*;
class Solution {
    public int mostWordsFound(String[] s) {
        int max=0;
        
        for(String ss:s){
           max=Math.max(max,(ss.split(" ")).length);
           
        }
        return max;
    }
}