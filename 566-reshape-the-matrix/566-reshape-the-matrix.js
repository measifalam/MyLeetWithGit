/**
 * @param {number[][]} mat
 * @param {number} r
 * @param {number} c
 * @return {number[][]}
 */
var matrixReshape = function(mat, r, c) {
    let a = [];
    let b = mat.flat();
    
    if(r*c !== b.length)
        {
            return mat;
        }
    
    for(let i=0;i<r;i++)
        {
            a.push(b.splice(0,c))
        }
    return a;
};