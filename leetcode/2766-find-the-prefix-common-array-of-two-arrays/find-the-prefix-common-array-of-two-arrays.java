class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;

        int[] C = new int[n];

        HashSet<Integer> set = new HashSet<>();

        int com = 0;

        for(int i = 0; i < n; i++) {

            if(!set.add(A[i])) com++;

            if(!set.add(B[i])) com++;

            C[i] = com;
        }

        return C;
    }
}