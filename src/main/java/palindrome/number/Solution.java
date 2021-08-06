package palindrome.number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x <= Math.pow(2, 31) - 1 && x >= Math.pow(-2, 31)) {
            String inputInt = Integer.toString(x);
            StringBuilder revert = new StringBuilder(inputInt);
            revert.reverse();
            return inputInt.equalsIgnoreCase(revert.toString());
        }
        return false;
    }
}
