class Solution {
    public int[] countBits(int n) {
        int myArr[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
        myArr[i] = myArr[i/2] + i%2;
        }
      return myArr;
    }
}