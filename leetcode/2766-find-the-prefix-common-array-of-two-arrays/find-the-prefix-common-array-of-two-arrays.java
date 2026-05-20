class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        int na = A.length;
        int nb = B.length;

        int[] C = new int[na];

        HashSet<Integer> set = new HashSet<>();

        int com = 0;

        for(int i=0;i<A.length;i++){

            if(!set.add(A[i]))com++;
            else set.add(A[i]);

            if(!set.add(B[i]))com++;
            else set.add(B[i]);
            
            C[i] = com;
        }

        return C;
    }
}