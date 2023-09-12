class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        rNum = {
            "I": 1,
            "V": 5,
            "X": 10,
            "L": 50,
            "C": 100,
            "D": 500,
            "M": 1000
        }
        total = 0
        for i in range(len(s) - 1):
            if rNum[s[i]] < rNum[s[i+1]]:
                total -= rNum[s[i]]
            else: 
                total += rNum[s[i]]
        return total + rNum[s[-1]]
    
    