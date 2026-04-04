class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> seqs = new HashSet<>();
        for (int num : nums) {
            seqs.add(num);
        }

        int longest = 0;

        for (int seq : seqs) {
            // Start only if seq is the beginning of a sequence
            if (!seqs.contains(seq - 1)) {
                int current = seq;
                int len = 1;

                while (seqs.contains(current + 1)) {
                    current++;
                    len++;
                }

                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}