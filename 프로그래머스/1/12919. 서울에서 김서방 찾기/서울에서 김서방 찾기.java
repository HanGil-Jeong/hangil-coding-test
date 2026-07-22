class Solution {
    public String solution(String[] seoul) {
                String answer = "";
        int arrLength = seoul.length;
        for (int i = 0; i < arrLength; i++) {
            String serchKim = seoul[i];
            if (serchKim.equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
                break;
            }
        }
        return answer;
    }
}