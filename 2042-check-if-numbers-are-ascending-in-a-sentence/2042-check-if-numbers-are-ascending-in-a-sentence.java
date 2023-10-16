class Solution {
    public boolean areNumbersAscending(String s) {
        
        String[] splitArr = s.split(" ");
        int biggest = -1;
        int current;
        for (String word : splitArr)
        {
            if(isInteger(word))
            {
                current = Integer.parseInt(word);
                if ( current > biggest)
                {
                    biggest = current;
                }
                else 
                {
                    return false;
                }
            }
        }
        return true;
    }
    
    public static boolean isInteger(String str) {
    if (str == null) {
        return false;
    }
    int length = str.length();
    if (length == 0) {
        return false;
    }
    int i = 0;
    if (str.charAt(0) == '-') {
        if (length == 1) {
            return false;
        }
        i = 1;
    }
    for (; i < length; i++) {
        char c = str.charAt(i);
        if (c < '0' || c > '9') {
            return false;
        }
    }
    return true;
}
}