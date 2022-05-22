public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
      
      return hammingWeight(n&(n-1))+1;
    }
}