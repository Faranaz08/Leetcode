class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        for(int i=num.length-1;i>=0;i--){
            k+=num[i];
            arr.add(0,k%10);
            k/=10;
            
        }
        while(k>0){
            arr.add(0,k%10);
            k/=10;
        }
        return arr;
    }
}