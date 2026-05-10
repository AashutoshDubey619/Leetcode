class Solution {
    public int[] scoreValidator(String[] events) {

        int score = 0;
        int counter = 0;


        for(int i=0;i<events.length && counter < 10;i++){
            if(events[i].equals("1")){
                score += 1;
            }
            else if(events[i].equals("2")){
                score += 2;
            }
            else if(events[i].equals("3")){
                score += 3;
            }
            else if(events[i].equals("4")){
                score += 4;
            }
            else if(events[i].equals("6")){
                score += 6;
            }
            else if(events[i].equals("W")){
                counter++; 
            }
            else if(events[i].equals("WD")){
                score++;
            }
            else if(events[i].equals("NB")){
                score++;
            }
        }

        return new int[]{score , counter};
    }
}