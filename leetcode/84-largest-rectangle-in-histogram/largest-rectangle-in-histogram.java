class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] NSE = new int[n];
        int[] PSE = new int[n];
        int max_area = 0;

        Arrays.fill(NSE, n);
        Arrays.fill(PSE, -1);

        Stack<Integer> stk1 = new Stack<>();
        Stack<Integer> stk2 = new Stack<>();

        
        for (int i = 0; i < n; i++) {
            while (!stk1.isEmpty() && heights[stk1.peek()] > heights[i]) {
                NSE[stk1.pop()] = i;
            }
            stk1.push(i);
        }

        
        for (int i = 0; i < n; i++) {
            while (!stk2.isEmpty() && heights[stk2.peek()] >= heights[i]) {
                stk2.pop();
            }
            if (!stk2.isEmpty()) {
                PSE[i] = stk2.peek();
            }
            stk2.push(i);
        }

      
        for (int i = 0; i < n; i++) {
            int width = NSE[i] - PSE[i] - 1;
            int area = width * heights[i];
            max_area = Math.max(max_area, area);
        }

        return max_area;
    }
}
