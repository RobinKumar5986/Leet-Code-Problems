class Solution(object):
    def isAnagram(self, s, t):
        if len(s) != len(t):
            return False
        f1 = {}
        for i in range(0, len(s)):
            f1[s[i]] = f1.get(s[i], 0) + 1
            f1[t[i]] = f1.get(t[i], 0) - 1
        for key, val in f1.items():
            if val != 0:
                return False
        return True
