class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
        int len=strs[0].length();
        for(int w=1; w<strs.length; w++){
            int i=0;
            while(i<len&&i<strs[w].length()&&strs[0].charAt(i)==strs[w].charAt(i))i++;
            len=i;
            if(len==0)return "";
        }
        return strs[0].substring(0,len);
    }
}
