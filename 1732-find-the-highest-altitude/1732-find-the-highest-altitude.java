class Solution {
    public int largestAltitude(int[] gain) {
        int cur = 0;
        int largest = 0;
        
        for (int i = 0; i < gain.length; i++)
        {
            cur = cur + gain[i];
            if (cur > largest)
            {
                largest = cur;
            }
        }
        return largest;
    }
}