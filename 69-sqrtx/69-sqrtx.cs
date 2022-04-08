public class Solution {
    public int MySqrt(int x) {
          if (x == 0)
            return 0;
        int left = 1, right = int.MaxValue;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } 
            else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}