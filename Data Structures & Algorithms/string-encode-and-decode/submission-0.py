class Solution:

    def encode(self, strs):
        res = ""
        for s in strs:
            res += str(len(s)) + "$" + s
        return res

    def decode(self, str):
        res = []
        i = 0
        while i < len(str):
            j = i
            while str[j] != "$":
                j += 1
            size = int(str[i:j])
            word = str[j + 1 : j + 1 + size]
            res.append(word)
            i = j + 1 + size
        return res
