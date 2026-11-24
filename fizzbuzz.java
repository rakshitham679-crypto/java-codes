import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        for (int number = 1; number <= n; number++) {
            if (number % 3 == 0 && number % 5 == 0) {
                answer.add("FizzBuzz");
            } else if (number % 3 == 0) {
                answer.add("Fizz");
            } else if (number % 5 == 0) {
                answer.add("Buzz");
            } else {
                answer.add(String.valueOf(number));
            }
        }
        return answer;
    }
