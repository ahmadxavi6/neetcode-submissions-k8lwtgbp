class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if(position.length == 1) return 1;
        int res = 1;

        List<int[]> pairs = new ArrayList<>();

        for(int i = 0 ; i<speed.length ; i++){
            pairs.add(new int[]{position[i], speed[i]});
        }
        // Position:  10    8    5    3    0
        // Speed:      2    4    1    3    1
        // Time:      1.0  1.0  7.0  3.0  12.0  
        //basically sort by postion and check timing and Track maxTime — the slowest time seen so far. If a car's time is greater than maxTime, it forms a new fleet.
        //sort in descending closest to target first
        pairs.sort((a,b) -> b[0] - a[0]);

        double maxTime = (double)(target - pairs.get(0)[0]) / pairs.get(0)[1];

        for (int i = 1; i < pairs.size(); i++) {
            double time = (double)(target - pairs.get(i)[0]) / pairs.get(i)[1];
            if (time > maxTime) {
                maxTime = time;
                res++;
            }
        }

        return res;

    }
}