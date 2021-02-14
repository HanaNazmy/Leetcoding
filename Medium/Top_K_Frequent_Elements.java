// https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                int val = map.get(nums[i]);
                map.put(nums[i],val+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        
        Stream<Map.Entry<Integer,Integer>> sorted = map.entrySet().stream().
            sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));    
  
        Map<Integer,Integer> topk = map.entrySet().stream()
       .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
       .limit(k)
       .collect(Collectors.toMap(
          Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    
        int[] res = new int[k]; 
        int i=0;
         for (Integer key : topk.keySet()) {
			res[i] = key;
             i++;
         }
     
        return res;
    }
}
