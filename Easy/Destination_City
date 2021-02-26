// https://leetcode.com/problems/destination-city/

class Solution {
    public String destCity(List<List<String>> paths) {
       ArrayList<String> list = new ArrayList<>(); 
        List<String> temp = new ArrayList<>();
        for(int i =0;i<paths.size();i++)
        {
            temp = paths.get(i);
            if(list.contains(temp.get(1))==false)
                list.add(temp.get(1));
        }
      
        for(int j=0;j<paths.size();j++)
        {
             temp = paths.get(j);
            if(list.contains(temp.get(0)))
                list.remove(temp.get(0));
        }
        Iterator iterator = list.iterator();
      if(iterator.hasNext())
         return (String)iterator.next();
   
   return ""; }
}
