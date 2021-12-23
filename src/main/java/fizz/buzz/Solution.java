package fizz.buzz;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> rsl = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                rsl.add("FizzBuzz");
            } else if (i % 5 == 0) {
                rsl.add("Buzz");
            } else if (i % 3 == 0) {
                rsl.add("Fizz");
            } else {
                rsl.add(Integer.toString(i));
            }
        }
        return rsl;
    }
}
