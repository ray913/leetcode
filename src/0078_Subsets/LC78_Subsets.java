class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, 0);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] nums, int start) {
        ans.add(new ArrayList<>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(ans, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}
