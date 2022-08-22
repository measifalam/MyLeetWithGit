/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    let set = new Set();
    let count = 0;
    
    for(let char of s)
        {
            if(!set.has(char))
                {
                    set.add(char);
                }
            else
                {
                    set.delete(char)
                    count = count+2;
                }
        }
    return count + (s.length>count?1:0);
    
};