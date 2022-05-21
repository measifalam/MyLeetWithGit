class Solution {
    public double average(int[] salary) {
      double sum=0;
      Arrays.sort(salary);
      for(int i=0;i<=salary.length-1;i++)
      {
       sum = sum + salary[i];
      }
      
      double avg = (sum - salary[0] - salary[salary.length-1]) / (salary.length - 2);
      
      return avg;
        
    }
}