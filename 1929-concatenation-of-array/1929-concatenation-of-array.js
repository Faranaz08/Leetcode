/**
 * @param {number[]} nums
 * @return {number[]}
 */
var getConcatenation = function(nums) {
    const arr=new Array(nums.length*2);
    for(let i=0;i<nums.length;i++){
        arr[i]=nums[i]
    }
    for(let i=nums.length;i<arr.length;i++){
        arr[i]=nums[i-nums.length];
    }
    return arr;
};