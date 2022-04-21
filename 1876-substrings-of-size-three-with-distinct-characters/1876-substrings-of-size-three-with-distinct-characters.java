class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) {
            return 0;
        }

        var left = 0;
        var right = 2;
        var charFrequency = new int[26];
        var resultCounter = 0;

        while(right < s.length()) {

            for(int i = left; i <= right; i++) {
                charFrequency[s.charAt(i) - 'a']++;
            }


            var isValid = true;
            for(int i = left; i <= right; i++) {
                if(charFrequency[s.charAt(i) - 'a'] != 1) {
                    isValid = false;
                    break;
                }
            }
            if(isValid)
                resultCounter++;

            for(int i = left; i <= right; i++) {
                charFrequency[s.charAt(i) - 'a'] = 0;
            }
            right++;
            left++;
        }
        return resultCounter;
    }
}