import java.util.Arrays; 

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        char[] chars = Long.toString(n).toCharArray();
        
        Arrays.sort(chars);
        
        String reversed = new StringBuilder(new String(chars)).reverse().toString();
        
        answer = Long.parseLong(reversed);
        
        return answer;
    }
}