class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length==1){
            return nums;
           
        }
        int start=0,end=nums.length;
        int mid=start+(end-start)/2;
         int[] left=sortArray(Arrays.copyOfRange(nums,0,mid));
        int[] right=sortArray(Arrays.copyOfRange(nums,mid,end));
        return merge(left,right);
    }
    public int[] merge(int[] first ,int[] second){
        int[] mix=new int[first.length+second.length];
        int i=0,j=0,k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
               
            }else{
                mix[k]=second[j];
                j++;
                
            }
             k++;
        }
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        return mix;
    }
}