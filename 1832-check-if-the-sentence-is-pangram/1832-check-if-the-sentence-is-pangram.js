/**
 * @param {string} sentence
 * @return {boolean}
 */
var checkIfPangram = function(sentence) {
    // const boo=new Array(26);
    // for(let i=0;i<boo.length;i++){
    //     if('a'<=sentence.charAt(i) && sentence.charAt(i)<='z'){
    //         boo[sentence.charAt(i)-'a']=true;
    //     }
    // }
    // for(const b of boo){
    //     if(b==false){
    //         return false;
    //     }
    // }
    // return true;
    const boo = new Array(26).fill(false); // Initialize with false
    for (let i = 0; i < sentence.length; i++) {
        const char = sentence.charAt(i).toLowerCase(); // Convert to lowercase
        if ('a' <= char && char <= 'z') {
            boo[char.charCodeAt(0) - 'a'.charCodeAt(0)] = true;
        }
    }
    for (const b of boo) {
        if (!b) {
            return false;
        }
    }
    return true;
};