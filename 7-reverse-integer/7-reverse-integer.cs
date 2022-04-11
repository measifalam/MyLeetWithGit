public class Solution {
    public int Reverse(int x) 
    {
        bool flag = true;
        if(x<0)
        {
           flag=false; x=-x;
        }


        long y=0;
        while(x>0)
        {
           int temp=x%10; 
           y=y*10+temp;
           x=x/10;
        }
 
       if(flag==false)
        {
           y=-y;
        }
 
      if(y<int.MinValue || y>int.MaxValue)
        {
           return 0;
        }
      
     return (int)y;
    }
}