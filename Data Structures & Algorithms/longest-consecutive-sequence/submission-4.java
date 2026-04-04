class Solution {
    public int longestConsecutive(int[] nums) {
        var seqs = new HashSet<Integer>();
        for(int num : nums){
            seqs.add(num);
        }
        int longest = 0;
        int len = 0;
        for(int seq : seqs){
            if(!seqs.contains(seq-1)){
                len = 1;
                int current = seq;
                while(seqs.contains(seq+len)){
                    len++;
                    current++;
                }
            }
            longest = Math.max(longest,len);
        }

        return longest;
    }
}
