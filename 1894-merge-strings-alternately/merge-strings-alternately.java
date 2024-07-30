import java.util.*;
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuffer sb=new StringBuffer();
        int length=Math.min(word1.length(),word2.length());
        for(int i=0;i<length;i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(word1.length()>length)
        {
            sb.append(word1.substring(length));
        }
        else if(word2.length()>length)
        {
            sb.append(word2.substring(length));
        }
        return sb.toString();
    }
}