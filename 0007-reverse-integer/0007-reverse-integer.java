class Solution 
{
    public int reverse(int x) 
    {
        long reverse = 0;
        
    
    
    for (int number = x; number != 0; number = number/10)
    {
        int remainder = number % 10;
        reverse = reverse*10 + remainder;
    }
      
        if (reverse <= Math.pow(-2,31) || reverse > Math.pow(2,31))
        {
            return 0;
        }
        else
        {
            return (int)reverse;
        }
        
    }
}