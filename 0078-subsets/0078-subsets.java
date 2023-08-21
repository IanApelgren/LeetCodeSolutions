class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> list = new ArrayList<>();
        recur(list, new ArrayList<>(), nums, 0);
        return list;
    }
    
    private void recur(List<List<Integer>> list, List<Integer> temp, int[] nums, int start)
    {
        list.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++)
        {
            temp.add(nums[i]);
            recur(list, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}