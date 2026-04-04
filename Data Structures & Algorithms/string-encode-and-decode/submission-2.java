class Solution {

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append("$").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        String c = "$";
        char y = c.charAt(0);
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != y) j++;
            int size = Integer.parseInt(str.substring(i, j));
            res.add(str.substring(j + 1, j + 1 + size));
            i = j + 1 + size;
        }
        return res;
    }
}