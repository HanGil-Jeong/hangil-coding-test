class Solution {
    public int[] solution(long n) {
        int x = String.valueOf(n).length();
        int[] answer = new int[x];
        for (int i = 0; i < x; i ++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }
        return answer;
    }
}