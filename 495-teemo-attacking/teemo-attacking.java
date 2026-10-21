class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total_time = timeSeries.length * duration;

        int totdiff =0;
        for (int i =0; i< timeSeries.length-1; i++){
            if(timeSeries[i] + duration >= timeSeries [i+1]){
                totdiff += timeSeries[i] + duration - timeSeries[i+1];

            }
        }
        return total_time - totdiff;
    }
}