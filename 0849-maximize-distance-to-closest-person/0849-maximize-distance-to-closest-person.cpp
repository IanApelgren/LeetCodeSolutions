class Solution {
public:
    int maxDistToClosest(vector<int>& seats) {
        int ans = 0;
        for(int i=0;i<seats.size();i++){
            int low = i;
            int high = i;
            while(low >= 0 && seats[low] != 1) low--;
            while(high < seats.size() && seats[high] != 1) high++;
            if(low < 0) low = high;
            if(high == seats.size()) high = low;
            ans = max(ans, min(abs(low - i), abs(high - i)));
        }
        return ans;
    }
};