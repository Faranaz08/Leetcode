/**
 * @param {string} s
 * @return {string}
 */
var reverseWords = function(s) {
    let ns=s.trim().split(' ');
    let result = '';
    for (var i = ns.length - 1; i >= 0; i--) {
        if (ns[i] !== '') {
            result += `${ns[i]} `;
        }
    }
    return result.trim();
};