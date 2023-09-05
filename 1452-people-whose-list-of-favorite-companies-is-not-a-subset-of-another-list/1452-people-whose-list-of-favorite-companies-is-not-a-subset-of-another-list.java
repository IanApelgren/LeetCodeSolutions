class Solution {
    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        List<Integer> res= new LinkedList<>();
        List<Set<String>> fcs = new LinkedList<>();
        for (List<String> fc: favoriteCompanies) fcs.add(new HashSet<>(fc));
        int l = fcs.size();
        int[] f = new int[l];
        for (int i=0; i<l; i++) f[i]=i;
        for (int i=0; i<l; i++)
            for (int j=i+1; j<l; j++){
                int a = find(f, i), b = find(f, j);
                if (a==b) continue;
                else if (contains(fcs.get(a), fcs.get(b))) f[b]=a;
                else if (contains(fcs.get(b), fcs.get(a))) f[a]=b;
            }
        Set<Integer> set= new HashSet<>();
        for (int i: f) set.add(find(f, i));
        res.addAll(set);
        Collections.sort(res);
        return res;
    }
    public boolean contains(Set<String> a, Set<String> b){
        if (a.size()<=b.size()) return false;
        return a.containsAll(b);
    }
    public int find(int[] f, int i){
        while (f[i]!=i){
            f[i]=f[f[i]];
            i=f[i];
        }
        return i;
    }
}