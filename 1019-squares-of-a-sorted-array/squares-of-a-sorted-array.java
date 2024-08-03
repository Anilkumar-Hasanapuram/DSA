import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
       List<Integer> li=Arrays.stream(nums).boxed().map(i->i*i).sorted().collect(Collectors.toList());
       return li.stream().mapToInt(Integer::intValue).toArray();
}
}