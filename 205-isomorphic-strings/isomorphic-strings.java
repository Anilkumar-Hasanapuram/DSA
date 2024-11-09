class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>  map=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++)
        {
            char current=s.charAt(i);
            if(map.containsKey(current))
            {
                if(map.get(current)!=t.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                if(map.containsValue(t.charAt(i)))
                {
                    return false;
                }
                map.put(current,t.charAt(i));
            }
        }
        return true;
    }
}