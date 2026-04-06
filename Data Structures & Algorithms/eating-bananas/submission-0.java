class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        
        // Find max pile (upper bound)
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (canFinish(piles, h, mid)) {
                right = mid; // try smaller k
            } else {
                left = mid + 1; // need bigger k
            }
        }

        return left;
    }

    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        
        for (int pile : piles) {
            // ceil(pile / k)
            hours += (pile + k - 1) / k;
        }
        
        return hours <= h;
    }
}