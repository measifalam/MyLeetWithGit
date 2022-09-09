class Solution {
    public char findTheDifference(String s, String t) {
        int a=0;
        int b=0;
        for(char ch1:s.toCharArray())
            a=a+ch1;
        
        for(char ch2:t.toCharArray())
            b=b+ch2;
        
        return (char)(b-a);
    }
}