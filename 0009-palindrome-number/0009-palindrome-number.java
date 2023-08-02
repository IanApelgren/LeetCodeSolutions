class Solution {
    public boolean isPalindrome(int x) {
        int reverse = 0; 
        
        boolean ret = false;
        if (x == 0)
        {
            ret = true;
        }
        else if (x > 0)
        {
            for (int number = x; number != 0; number = number/10)
            {
                int remainder = number % 10;
                reverse = reverse*10 + remainder;
            }
            if (reverse == x)
            {
                ret = true;
            }
           

        }
        return ret;
    }
}