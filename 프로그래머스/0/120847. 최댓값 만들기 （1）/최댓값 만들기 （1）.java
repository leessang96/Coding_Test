import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        
        Arrays.sort(numbers);
        
        int max = numbers[numbers.length - 1];
        int max2 = numbers[numbers.length - 2];
        
        
        return max * max2;
    }
}