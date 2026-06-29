class Solution {
    public long solution(long n) {
        long answer = 0;
        double i = Math.sqrt(n);
        
            if (i % 1 == 0) {
                answer = ((long)i + 1) * ((long)i + 1);
            } else {
                answer = -1;
            }
       

        return answer;
    }
}