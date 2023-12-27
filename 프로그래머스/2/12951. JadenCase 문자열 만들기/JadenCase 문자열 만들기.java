class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArray = s.split(" ");
        
        for(int i = 0; i < sArray.length; i++) {
            String x = sArray[i];
            
            //split으로 공백이 있을 수 있으므로 조건 추가
            if(!x.isEmpty()) {
                //첫 글자 대문자로 변경
                answer += x.substring(0, 1).toUpperCase();
                //첫 글자 제외 나머지 소문자로 변경
                answer += x.substring(1, x.length()).toLowerCase();
                
                //다음 문자열 사이 공백 추가
                answer += " ";
                
            } else {
    			answer += " ";
    		} 
        }
        // 입력 받은 문자열의 맨 마지막이 " " 라면 바로 answer 반환
    	if(s.substring(s.length()-1, s.length()).equals(" ")){
    		return answer;
    	}
    	
    	// 맨 마지막 " " 제거하고 answer 반환
        return answer.substring(0, answer.length()-1);
    }
}