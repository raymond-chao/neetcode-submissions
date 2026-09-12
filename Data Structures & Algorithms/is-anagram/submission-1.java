class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> same = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = same.getOrDefault(c, 0);
            same.put(c, count + 1);
        }
        for(int j = 0; j < t.length(); j++) {
            char x = t.charAt(j);
            int count2 = same.getOrDefault(x, 0);
            same.put(x, count2 -1);
        }
        for(int v : same.values()) {
            if (v != 0) {
                return false;
            }
        }
        return true;
    }
}
