/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let map={
      ")":"(",
      "]":"[",
      "}":"{"      
    }
    
    let _stack = [];
    for(let i=0;i<s.length;i++)
      {
        if(s[i]==="(" || s[i]==="[" || s[i]==="{")
          {
            _stack.push(s[i]);
          }
        else if(_stack[_stack.length-1]===map[s[i]])
          {
            _stack.pop();
          }
        else
          return false;
      }
 return  _stack.length?false:true;
};