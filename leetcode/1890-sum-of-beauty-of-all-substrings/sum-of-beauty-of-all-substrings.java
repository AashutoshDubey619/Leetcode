class Solution {
    public int beautySum(String s) {

        int beauty = 0;

        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            int max = 0;
            int min = 0;

            for (int j = i; j < s.length(); j++) {

                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                max = Integer.MIN_VALUE;
                min = Integer.MAX_VALUE;

                for (int val : map.values()) {
                    max = Math.max(max, val);
                    min = Math.min(min, val);
                }

                beauty += (max - min);
            }
        }
        return beauty;
    }
}
