import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int c:candies)if(c>max)max=c;
        List<Boolean> out=new ArrayList<>();
        for(int c:candies)out.add(c+extraCandies>=max);
        return out;
    }
}
