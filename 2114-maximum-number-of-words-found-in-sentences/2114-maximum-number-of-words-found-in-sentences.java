class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int max=0;
        for(int i=0;i<sentences.length;i++){
            count=0;
            String[] str=sentences[i].split(" ");
            for(String j:str){
                count++;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}