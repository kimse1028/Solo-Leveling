import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        a.chars().limit(a.length())
            .forEach(b -> System.out.println((char)b));
    }
}