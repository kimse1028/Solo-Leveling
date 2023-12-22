class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int todoArraySize = todo_list.length;
        int answerArraySize = 0;
        String[] copy = new String[todoArraySize];
        for(int i = 0; i < todoArraySize; i++) {
            if(finished[i] == true) {
                continue;
            } else {
                copy[answerArraySize] = todo_list[i];
                answerArraySize++;
            }
        }
        String[] answer = new String[answerArraySize];
        for(int j = 0; j < answerArraySize; j++) {
            answer[j] = copy[j];
        }
        return answer;
    }
}