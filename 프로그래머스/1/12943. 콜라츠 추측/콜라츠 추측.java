class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        if(n == 1) {
            answer = 0;
        } else {
            for(answer = 0; answer <= 500; answer++) {
                if(n == 1) {
                    break;
                } else {
                    if(n % 2 == 0) {
                        n = n / 2;
                    } else {
                        n = (n * 3) + 1;
                    }
                }
            }
            if(answer >= 500){
                    answer = -1;
                    }
        }
        
        
        return answer;
    }
}