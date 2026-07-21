class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int a = x;
        int y = 0;
        // x의 각 자리수의 합을 구하기
        while (a > 0) {
            y += a % 10;
             a /= 10;
        }
        // 하샤드 수 판별
        if (x % y == 0) {
            return answer;
        }
        
        return answer = false;
    }
}