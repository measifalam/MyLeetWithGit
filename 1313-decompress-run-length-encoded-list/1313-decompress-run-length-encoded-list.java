class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> myList = new ArrayList<Integer>();
        int freq=0;
        int val=0;
        for(int i=0;i<nums.length;i=i+2)
        {
          freq = nums[i];
          val = nums[i+1];
          for(int j=0;j<freq;j++)
          {
            myList.add(val);
          }                    
        }
      int result[]=new int[myList.size()];
      
      
      for(int i=0;i<myList.size();i++)
      result[i]=myList.get(i);
      return result;
    }
}