class Solution {
    public boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) return false;

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char first = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = first;

            if (new String(arr).equals(goal))
                return true;
        }

        return false;
    }
}
