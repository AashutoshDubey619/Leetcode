class Solution {
    public int numberOfBeams(String[] bank) {

        ArrayList<Integer> lasers = new ArrayList<>();

        int laser_beams = 0;

        for(int i=0;i<bank.length;i++){
                int laser = 0;
                for(int j=0;j<bank[i].length();j++){
                    if(bank[i].charAt(j) == '1')laser++;
                }
                if(laser != 0)lasers.add(laser);
            }

        if(lasers.size() == 1)return 0;

        for(int i=0;i<lasers.size()-1;i++){
            laser_beams += lasers.get(i) * lasers.get(i+1);
        }

        return laser_beams;
    }
}