class Solution {
    public int solution(int n) {
        int x = 1;
        for(x = 2; x >= 2; x++) {
            if(n % x == 1) {
                break;
            } else {
                continue;
            }
        }
        return x;
    }
}