class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        int end = overwrite_string.length();
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+end);
        return answer;
        // my_string 에서 변경할 인덱스 범위 : s 부터 overwrite_string.length 까지 overwirte_string 으로 변경
    }
}