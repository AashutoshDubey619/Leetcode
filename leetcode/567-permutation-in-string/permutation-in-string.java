class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())return false;

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];


        for(char c : s1.toCharArray())freq1[c-'a']++;

        int k = s1.length();

        for(int i=0;i<k;i++){
           if(s1.indexOf(s2.charAt(i)) != -1) freq2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1 , freq2))return true;

        int i = 0;
        int j = k;

        while(j < s2.length()){
           if(s1.indexOf(s2.charAt(j)) != -1) freq2[s2.charAt(j)-'a']++;
           if(s1.indexOf(s2.charAt(i)) != -1) freq2[s2.charAt(i)-'a']--;

            if(Arrays.equals(freq1 , freq2))return true;

            i++;
            j++;
        }

        return false;
    }
}