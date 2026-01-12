class Solution {
    public int numDifferentIntegers(String word) {

        String[] parts = word.split("[^0-9]+"); 
        HashSet<String> set = new HashSet<>();

        for(String part : parts){
            if(part.length() == 0) continue;

            
            String normalized = part.replaceFirst("^0+", "");

            
            if(normalized.length() == 0)
                normalized = "0";

            set.add(normalized);
        }

        return set.size();
    }
}
