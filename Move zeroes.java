class Solution {
    public void moveZeroes(int[] nums) {
        int next=0;
        for(int v:nums)if(v!=0)nums[next++]=v;
        while(next<nums.length)nums[next++]=0;
    }
}
