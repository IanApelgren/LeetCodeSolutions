class Solution(object):
    def repeatedSubstringPattern(self, s):
        """
        :type s: str
        :rtype: bool
        """
        sub = s
        rep = 0
        for i in range(len(s)):
            if i != 0:
                if len(s) % i == 0:
                    rep = len(s) / i
                    sub = s[:i]
                    comp = sub * rep
                    if comp == s:
                        return True
            
        