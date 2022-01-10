package reverse.words.in.a.string.iii;

class Solution {
    public String reverseWords(String s) {
        String[] splitted = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : splitted) {
            StringBuilder reversed = new StringBuilder();
            reversed.append(str).reverse();
            sb.append(reversed).append(" ");
        }
        return sb.toString().trim();
    }
}
