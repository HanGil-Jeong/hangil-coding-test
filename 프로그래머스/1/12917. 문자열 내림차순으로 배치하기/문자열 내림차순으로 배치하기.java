import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        for (int i = 0; i < charArr.length / 2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[charArr.length - 1 - i];
            charArr[charArr.length - 1 - i] = temp;
        }
        String answer = new String(charArr);
        return answer;
    }
}