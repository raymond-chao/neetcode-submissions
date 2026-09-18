class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        TreeMap<Integer, List<Integer>> tMap = new TreeMap<>();

        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            int count = map.getOrDefault(val, 0);
            map.put(val, count + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(int num : map.keySet()) {
            int count = map.get(num);
            if(!tMap.containsKey(count)) {
                tMap.put(count, new ArrayList<>());
            } 
                tMap.get(count).add(num);
        }
        for (int freq : tMap.descendingKeySet()) {
            for (int num : tMap.get(freq)) {
                if (result.size() == k) {
                    break;
                }
                result.add(num);
            }
                if (result.size() == k) {
                    break;
            }
    }
    int[] answer = new int[k];

    for(int j = 0; j < result.size(); j++) {
        answer[j] = result.get(j);
    }
    return answer;
        

    
    }
}
