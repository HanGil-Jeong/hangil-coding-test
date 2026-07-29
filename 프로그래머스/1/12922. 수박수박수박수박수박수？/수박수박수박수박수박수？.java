class Solution {
    public String solution(int n) {
        String answer = "";
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (i % 2 == 0) ? '수' : '박';
        }
        answer = String.valueOf(arr);
        return answer;
    }
}