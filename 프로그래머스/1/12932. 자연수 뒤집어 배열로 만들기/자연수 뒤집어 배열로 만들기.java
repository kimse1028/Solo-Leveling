class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        char[] charArr = str.toCharArray();
        int arraySize = charArr.length;
        int[] answer = new int[arraySize];
        
        for(int i = arraySize-1, j = 0; i >= 0; i--, j++) {
            answer[j] = Character.getNumericValue(charArr[i]);
        }
        return answer;
    }
}