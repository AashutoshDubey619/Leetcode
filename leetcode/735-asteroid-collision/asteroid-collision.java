class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            int curr = asteroids[i];

            if (!stk.isEmpty() && stk.peek() > 0 && curr < 0) {

                boolean alive = true;

                while (!stk.isEmpty() && stk.peek() > 0 && alive) {
                    if (stk.peek() < -curr) {
                        stk.pop();
                    } else if (stk.peek() == -curr) {
                        stk.pop();
                        alive = false;
                    } else {
                        alive = false;
                    }
                }

                if (alive) stk.push(curr);

            } else {
                stk.push(curr);
            }
        }

        int[] res = new int[stk.size()];
        for (int i = stk.size() - 1; i >= 0; i--) {
            res[i] = stk.pop();
        }

        return res;
    }
}
