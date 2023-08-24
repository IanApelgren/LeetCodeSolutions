class Solution(object):
    def repeatedSubstringPattern(self, s):
        """
        :type s: str
        :rtype: bool
        """
        sub = s
        rep = 0
       
        for i in range(1,len(s)):
            if len(s) % i == 0:
                rep = len(s) / i
                sub = s[:i]
                comp = sub * rep
                if comp == s:
                    return True
            
        