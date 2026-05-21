class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> res  = new ArrayList<>();

        Stack<Integer> stk = new Stack<>();

        int k = 0;

        for(int i=1;i<=n;i++){
            stk.push(i);
            res.add("Push");
            if(k < target.length && target[k] != i){
                stk.pop();
                res.add("Pop");
            }
            
            if(!stk.isEmpty() && stk.peek() == target[k])k++;

            if(stk.size() == target.length){
                int arr[] = new int[stk.size()];

                for(int a=0;a<arr.length;a++){
                    arr[a] = stk.pop();
                }

                boolean flag = true;

                int l = 0;
                int r = arr.length-1;

                while(l <= r){
                    if(target[l] != arr[r]){
                        flag = false;
                        break;
                    }
                    l++;
                    r--;
                }

                if(flag)return res;
            }
        }

        return res;
    }
}