class Solution {
    public int minSubArrayLen(int S, int[] arr) {
      int windowSum=0,minLength=Integer.MAX_VALUE;
      int windowStart=0;
      for(int windowEnd=0;windowEnd<arr.length;windowEnd++)
      {
        windowSum = windowSum+arr[windowEnd];
        while(windowSum >= S)
        {
          minLength = Math.min(minLength,windowEnd-windowStart+1);
          windowSum = windowSum - arr[windowStart];
          windowStart++;
        }
      }
      return minLength == Integer.MAX_VALUE?0:minLength;
        
    }
}