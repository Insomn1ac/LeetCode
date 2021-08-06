package reverse.integer;

class Solution {
    public int reverse(int x) {
        int rsl = 0;
        while (x != 0) {
            int y = x % 10;
            x /= 10;
            if (rsl > Integer.MAX_VALUE / 10 || rsl < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rsl = rsl * 10 + y;
        }
        return rsl;
    }
}
