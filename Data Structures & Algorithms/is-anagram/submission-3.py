class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        mappa = {}
        for i in range(len(s)):
            mappa[s[i]] = mappa.get(s[i], 0) + 1
            mappa[t[i]] = mappa.get(t[i], 0) - 1
        return all(v == 0 for v in mappa.values())
        


        