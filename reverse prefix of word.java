class Solution {
    public String reversePrefix(String word, char ch) {
        int end=word.indexOf(ch);
        if(end<0)return word;
        char[] a=word.toCharArray();
        for(int l=0,r=end; l<r; l++,r--){
            char t=a[l];
            a[l]=a[r];
            a[r]=t;
        }
        return new String(a);
    }
}
