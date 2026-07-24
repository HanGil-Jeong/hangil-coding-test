class Solution {
    public String solution(String phone_number) {
        String answer = "";
        char[] arrPhoneNumber = phone_number.toCharArray();
        
        for (int i = 0; i < arrPhoneNumber.length - 4; i++) {
            arrPhoneNumber[i] = '*';
        }
        
        answer = String.valueOf(arrPhoneNumber);
        
        return answer;
    }
}