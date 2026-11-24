class Solution {
    public String toLowerCase(String s) {
        StringBuilder out=new StringBuilder();
        for(int i=0; i<s.length(); i++)out.append(Character.toLowerCase(s.charAt(i)));
        return out.toString();
    }
}
