class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        Queue<Integer> q = new LinkedList<>();
        for (int st : students) {
            q.add(st);
        }

        int top = 0;
        int attempts = 0;

        while (!q.isEmpty() && attempts < q.size()) {
            if (q.peek() == sandwiches[top]) {
                q.poll();
                top++;
                attempts = 0;   
            } else {
                q.add(q.poll());
                attempts++;    
            }
        }

        return q.size();
    }
}
