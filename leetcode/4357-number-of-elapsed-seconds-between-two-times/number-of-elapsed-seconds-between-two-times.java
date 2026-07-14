class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        
        String[] start = startTime.split(":");
        String[] end = endTime.split(":");

        int shr = Integer.parseInt(start[0]) * 60 * 60;
        int smin = Integer.parseInt(start[1]) * 60;
        int ssec = Integer.parseInt(start[2]);

        int ehr = Integer.parseInt(end[0]) *60 * 60;
        int emin = Integer.parseInt(end[1])* 60;
        int esec = Integer.parseInt(end[2]);

        int s = shr + smin + ssec;
        int e = ehr + emin + esec;

        return e - s;
    }
}