class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArray = s.split(" ");
        
        //int 배열로 만들기
        int[] inArray = new int[sArray.length];
        for (int x = 0; x < sArray.length; x++) {
            inArray[x] = Integer.parseInt(sArray[x]);
        }
        
        int max = inArray[0];
        int min = inArray[0];
        
        //최대값 max 찾기
        for(int i = 1; i < inArray.length; i++) {
            if(inArray[i] > max) {
                max = inArray[i];
            }
        }
        
        //최소값 min 찾기
        for(int j = 1; j < inArray.length; j++) {
            if(inArray[j] < min) {
                min = inArray[j];
            }
        }
                    
        //max, min 넣기
        answer = Integer.toString(min) + " " + Integer.toString(max);
        return answer;
    }
}