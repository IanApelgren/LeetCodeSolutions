class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length())return false;
        unordered_map<char,int>m;
        unordered_set<char>st;
        for(int i=0;i<s.length();i++){
            if(m.find(s[i])==m.end() ){
                if(st.find(t[i])==st.end()){
                    m[s[i]]=t[i];
                    st.insert(t[i]);
                }else
                return false;
            }
            else{
                if(t[i]!=m[s[i]])return false;
            }
        }
        return true;
    }
};