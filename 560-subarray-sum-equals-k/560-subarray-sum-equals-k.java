class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> seen = new HashMap<>();
        int sum=0;
        int count=0;
        
      for(int n:nums)
      {
        sum = sum + n;
        if(sum==k)
        { 
          count++;
        }
        int required = sum - k;
        count = count + seen.getOrDefault(required,0);
        seen.put(sum,seen.getOrDefault(sum,0)+1);
      }
      
      return count;
      
      
    }
}