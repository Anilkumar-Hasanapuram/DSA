class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int value:arr)
        {
            map.put(value,map.getOrDefault(value,0)+1);
        }
        Set<Integer> s=new HashSet<>(map.values());

        return map.size()==s.size();
    }
}