import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = "";
        //toCharArray : String 문자열을 char형 배열로 바꿔서 반환해주는 메서드
        for(char b : a.toCharArray()) {
            if(Character.isLowerCase(b)) {
                answer += Character.toUpperCase(b);
            } else {
                answer += Character.toLowerCase(b);
            }
        }
        System.out.println(answer);
    }
}