/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k) {
    let arr = s.split(' ');
    arr.splice(k);
    s = arr.join(' ');
    
    return s;
};