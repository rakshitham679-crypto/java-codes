class Solution {
    public int removeElement(int[] nums, int val) {
        int kept=0;
        for(int v:nums)if(v!=val)nums[kept++]=v;
        return kept;
    }
}
