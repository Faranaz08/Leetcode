/**
 * @param {number} n
 * @return {boolean}
 */
var hasAlternatingBits = function(n) {
    let cur=0,pre=-1;
    while(n!=0){
        cur=n&1;
        if(cur==pre) return false;
        n>>>=1;
        pre=cur;
    }
    return true;
};