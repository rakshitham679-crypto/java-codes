import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> first=new ArrayList<>(),second=new ArrayList<>();
        for(int v:nums1)if(!has(nums2,v)&&!first.contains(v))first.add(v);
        for(int v:nums2)if(!has(nums1,v)&&!second.contains(v))second.add(v);
        List<List<Integer>> out=new ArrayList<>();
        out.add(first);
        out.add(second);
        return out;
    }
    private boolean has(int[] values,int target){
        for(int v:values)if(v==target)return true;
        return false;
    }
}
