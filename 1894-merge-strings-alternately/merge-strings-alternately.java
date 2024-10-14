class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int value=0;
        for(int i=0;i<word1.length() && i<word2.length();i++)
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            value++;
        }
        if(word1.length()<word2.length())
        {
            sb.append(word2.substring(value));
        }
        else
        {
            sb.append(word1.substring(value));
        }
        return sb.toString();
        
    }
}