class Solution {
    public int findMinArrowShots(int[][] points) {
        
       Arrays.sort(points, (a,b) -> {
          if(a[1] == b[1])return Integer.compare(a[0] , b[0]);
          return Integer.compare(a[1] , b[1]);
       });

       int arrows = 1;

       int min_end = points[0][1];

       for(int i=1;i<points.length;i++){
            if(points[i][0] > min_end){
                arrows++;
                min_end = points[i][1];
            }
       }

       return arrows;
    }
}