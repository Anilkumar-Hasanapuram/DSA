import java.util.*;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> n1=new HashSet<Integer>();
        for(int value:nums1)
        {
            n1.add(value);
        }
        Set<Integer> n2=new HashSet<Integer>();
        for(int value:nums2)
        {
            n2.add(value);
        }
        List<Integer> l1=new ArrayList<>(n1);
        List<Integer> l2=new ArrayList<>(n2);
        l1.removeAll(n2);
        l2.removeAll(n1);
        List<List<Integer>> li=new ArrayList<>();
        System.out.println(l1+" "+l2);
        li.add(l1);
        li.add(l2);
        return li;


        
    }
}