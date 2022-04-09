public class Solution {
    public int RomanToInt(string s) {
        Dictionary<char,int> dictcmp = new Dictionary<char,int>();
        dictcmp['I']=1;
        dictcmp['V']=5;
        dictcmp['X']=10;
        dictcmp['L']=50;
        dictcmp['C']=100;
        dictcmp['D']=500;
        dictcmp['M']=1000;
        
        
        int rep=0;
        int lenS=s.Length;
        if(lenS==0)
        {
            return 0;
        }
        
            rep=rep+dictcmp[s[lenS-1]];
            for(int i=0;i<lenS-1;i++)
            { 
                if(dictcmp[s[i]]<dictcmp[s[i+1]])
                {
                    rep-=dictcmp[s[i]];
                   
                }
                else
                {
                    rep+=dictcmp[s[i]];
                  
                }
            
            }
        
        return rep;
    }
}