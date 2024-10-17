class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=0,index1=0;
        while(index<s.length() && index1<t.length())
        {
            if(s.charAt(index)==t.charAt(index1))
            {
                index++;
            }
            index1++;
        }
        return index==s.length();
            
        
    }
}