class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>();

        for (int a : asteroids) {

            if (a < 0) {
                boolean alive = true;

                while (alive && !stk.isEmpty() && stk.peek() > 0) {
                    if (stk.peek() < -a) {
                        stk.pop();
                    } else if (stk.peek() == -a) {
                        stk.pop();
                        alive = false;
                    } else {
                        alive = false;
                    }
                }

                if (alive) stk.push(a);

            } else {
                stk.push(a);
            }
        }

        int[] res = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            res[i] = stk.pop();
        }

        return res;
    }
}
