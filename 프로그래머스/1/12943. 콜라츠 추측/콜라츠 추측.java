class Solution {
    public int solution(int num) {
        int answer = 0;
        if (num == 1) {
            return answer;
        }
        
        long n = num;
        int i = 1;
        while (i <= 500) {
            n = (n % 2== 0) ? n / 2 : n * 3 + 1;
            if (n == 1) {    
                return answer = i;

            }
            i++;
        }
        
        return answer = -1;
    }
}