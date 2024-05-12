/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    //rotate to right 
    let ans=new Array(nums.length);
         let n=nums.length;
         k=k%n;
         for(let i=(n-k);i<n;i++){
            ans[i-(n-k)] =nums[i];
         }
         for(let i=k;i<n;i++){
             ans[i]=nums[i-k];
         }
         for(let i=0;i<n;i++){
             nums[i]=ans[i];
         }
    return ans;
    
};