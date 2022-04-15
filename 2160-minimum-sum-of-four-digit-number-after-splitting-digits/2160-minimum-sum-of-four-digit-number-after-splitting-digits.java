class Solution {
    public int minimumSum(int num) {
       int[] data = new int[4];
       int i=0;
        while(num>0)
        {
         
          int rem=num%10;
          data[i]=rem;
          num=num/10;
          i++;
        }
      Arrays.sort(data);
      int sum=(data[0]*10+data[2])+(data[1]*10+data[3]);
      return sum;
    }
}