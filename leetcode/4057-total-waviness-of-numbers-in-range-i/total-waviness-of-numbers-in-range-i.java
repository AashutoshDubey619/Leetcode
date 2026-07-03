class Solution {
    public int totalWaviness(int num1, int num2) {
        int sum = 0;

        for(int i=num1;i<=num2;i++){
            ArrayList<Integer> list = new ArrayList<>();
            int wave = 0;

            int x = i;
            while(x > 0){
                list.add(x % 10);
                x /= 10;
            }

            for(int j=1;j<list.size()-1;j++){
                if((list.get(j) > list.get(j-1) && list.get(j) > list.get(j+1)) || (list.get(j) < list.get(j-1) && list.get(j) < list.get(j+1))) wave++;
            }

            sum += wave;
        }

        return sum;
    }
}