class Solution {
    public int calPoints(String[] operations) {
        int value=0;
        List<Integer> list=new ArrayList<>();
        for(String v:operations)
        {
            
            if(!v.equals("C") && !v.equals("D") && !v.equals("+"))
            {
                list.add(Integer.parseInt(v)); 
            }
            else if(v.equals("C"))
            {
                list.remove(list.size()-1);
            }
            else if(v.equals("D"))
            {
                list.add(list.get(list.size()-1)*2);
            }
            else if(v.equals("+"))
            {
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
        }
        for(int v:list)
        {
            value+=v;
        }
        System.out.println(list);
        return value;
    }
}