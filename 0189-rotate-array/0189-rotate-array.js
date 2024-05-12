/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    // //rotate to right 
    // let ans=new Array(nums.length);
    //      let n=nums.length;
    //      k=k%n;
    //      for(let i=(n-k);i<n;i++){
    //         ans[i-(n-k)] =nums[i];
    //      }
    //      for(let i=k;i<n;i++){
    //          ans[i]=nums[i-k];
    //      }
    //      for(let i=0;i<n;i++){
    //          nums[i]=ans[i];
    //      }
    // return ans;
    
    
    // better approach 
    
    k=k%nums.length;
    let n=nums.length;
  

    let reverse=function(nums,start,end){
        while(start<end){
            let temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
      reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    return nums;
    
};