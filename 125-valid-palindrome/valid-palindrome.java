class Solution {
    public boolean isPalindrome(String s) {
     String res="";
     for(char ch:s.toCharArray()){
        if(Character.isLetter(ch)||Character.isDigit(ch))res+=ch;
     }
     res=res.toLowerCase();
     //System.out.println(res+","+new StringBuffer(res.toLowerCase()).reverse());
     return res.equals(new StringBuffer(res.toLowerCase()).reverse().toString());
    }
}