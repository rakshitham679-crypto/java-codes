class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int v:nums){
            int digits=0;
            do{
                digits++;
                v/=10;
            }
            while(v!=0);
            if(digits%2==0)count++;
        }
        return count;
    }
}
