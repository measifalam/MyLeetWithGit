class Solution {
    public int subtractProductAndSum(int n) {
      int arr[]=new int[6];
      int i=0;
      int sum=0;
      int product=1;
        while(n>0)
        {
          int rem=n%10;
          arr[i]=rem;
          sum=sum+arr[i];
          product=product*arr[i];
          n=n/10;
          i++;
        }
      
      return product-sum;
      
      
    }
}