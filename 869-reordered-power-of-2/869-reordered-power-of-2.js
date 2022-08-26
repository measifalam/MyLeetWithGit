/**
 * @param {number} n
 * @return {boolean}
 */
var reorderedPowerOf2 = function(n) {
    let s = n.toString().split('').sort().join('');    
    let pw = 0;
    let lstpw = 29;  // as n will never exceed this power
    let table = [];
    for(let i = pw ; i <= lstpw ; i++){
        let t = Math.pow(2,i).toString().split('').sort().join('');
        if(t == s)return true;
    
    }
    return false;
};