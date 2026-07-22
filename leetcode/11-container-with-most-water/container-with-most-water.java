class Solution {
    public int maxArea(int[] height) {
        
        int i = 0 , j = height.length-1;
        int max_area = 0;

        while(i < j){
            int area = (j - i) * Math.min(height[i] , height[j]);
            max_area = Math.max(area , max_area);

            if(height[i] > height[j])j--;
            else i++;
        }

        return max_area;
    }
}