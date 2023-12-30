import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        //int를 String으로 변환
        String str = String.valueOf(n);
        
        //String를 toCharArray로 char형 배열로 변환
        char[] charArr = str.toCharArray();
        
        //for문 돌리기
        for(int i = 0; i < charArr.length; i++) {
            //Character.getNumericValue() 함수 사용 char->int
            answer += Character.getNumericValue(charArr[i]);
        }

        return answer;
    }
}