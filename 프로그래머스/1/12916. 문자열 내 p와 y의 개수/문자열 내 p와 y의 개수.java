class Solution {
    boolean solution(String s) {
        
        //문자열 s를 char형으로 하나씩 전부 for문 안에서 p와 P와 y와 Y를 각각 카운팅 하는 방식으로 하기
        char[] sArray = s.toCharArray();
        int pCount = 0;
        int yCount = 0;
        for(int i = 0; i < sArray.length; i++) {
            if((sArray[i] == 'p') || (sArray[i] == 'P')) {
                pCount++;
            } else if((sArray[i] == 'y') || (sArray[i] == 'Y')) {
                yCount++;
            }
        }
        //p + P 의 개수인 pCount와 y + Y 의 개수인 yCount를 비교 후 true와 false return. p, y 없으면 true
        boolean answer = (pCount + yCount == 0 ? true : (pCount == yCount ? true : false));

        return answer;
    }
}