class Solution {
    public int solution(String s) {
       int answer = 0;
        int current = 0;
        char firstChar = s.charAt(0);

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (firstChar == charArray[i]) {
                current++;
            } else {
                current--;
            }
            if (current == 0 || i==charArray.length-1) {
                answer++;
                if (i + 1 < charArray.length) {
                    firstChar = charArray[i + 1];
                }
            }
        }
        return answer;
    }
}