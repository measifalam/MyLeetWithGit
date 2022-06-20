class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> _boolList = new ArrayList<Boolean>();
      int maxCandies=0;
      for(int i=0;i<candies.length;i++) 
      {
        if(candies[i]>maxCandies)
        {
          maxCandies=candies[i];
        }
      }
      
      for(int i=0;i<candies.length;i++)
      {
        if(candies[i]+extraCandies>=maxCandies)
        {
           _boolList.add(true);
        }
        else
        {
           _boolList.add(false);
        }
      }
    
      return _boolList;
    }
}