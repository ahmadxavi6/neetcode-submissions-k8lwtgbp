class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Build frequency map
        Map<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // Step 2: Build buckets — index = frequency
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        // Step 3: Read from the end, collect top k
        int[] res = new int[k];
        int idx = 0;
        for (int i = buckets.length - 1; i >= 1 && idx < k; i--) {
            for (int num : buckets[i]) {
                res[idx++] = num;
                if (idx == k) return res;
            }
        }

        return res;
    }
}