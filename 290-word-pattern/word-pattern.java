class Solution {
    public boolean wordPattern(String pattern, String s) {
      String word[]=s.split(" ");
      if(pattern.length()!=word.length) return false;
      HashMap<Character,String> map=new HashMap();
      for(int i=0;i<pattern.length();i++)
      {
        char current=pattern.charAt(i);
        if(map.containsKey(current))
        {
            if(!map.get(current).equals(word[i]))
            {
                return false;
            }
        }
        else
        {
            if(map.containsValue(word[i]))
            {
                return false;
            }
            map.put(current,word[i]);
        }
      }
      return true;
    }
    
}