import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        List<Integer> s=Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> s1=Arrays.stream(nums2).boxed().collect(Collectors.toList());
        List<Integer> v=s.stream().filter(num->!s1.contains(num)).collect(Collectors.toList());
        List<Integer> v1=s1.stream().filter(num->!s.contains(num)).collect(Collectors.toList());
        System.out.println(v+" "+v1);
        list.add(new ArrayList<>(new HashSet<Integer>(v)));
        list.add(new ArrayList<>(new HashSet<Integer>(v1)));
        return list;
        
    }
}