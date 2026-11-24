class Solution {
    public int[] buildArray(int[] nums) {
        int[] out=new int[nums.length];
        for(int i=0; i<nums.length; i++)out[i]=nums[nums[i]];
        return out;
    }
}
