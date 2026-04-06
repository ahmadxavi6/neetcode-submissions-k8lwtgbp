class Solution {
          int res = 0;
    public int hammingWeight(int n) {
  
        if(n == 0){
            return res;
        }
        if(n%2 == 1){
            res+= 1;
        }
        return hammingWeight(n/2);
    }
}
