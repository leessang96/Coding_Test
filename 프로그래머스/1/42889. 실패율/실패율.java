import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int user = stages.length;
        double[] failRate = new double[N];
        HashMap<Integer, Integer> fail = new HashMap<>();
		
        for (int i = 1; i <= N; i++) {
            fail.put(i, count(stages, i));
        }

        int idx = 0;
        for (Integer key : fail.keySet()) {
            failRate[idx++] = (double) fail.get(key) / user;
            if (user == fail.get(key))
                user = 1;
            else
                user -= fail.get(key);
        }
		
        //실패율을 내림차순으로 정렬하기 위한 배열 생성
        Double[] temp = new Double[N];
        for (int i = 0; i < N; i++) {
            temp[i] = failRate[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());

		//실패율에 따라 스테이지를 내림차순으로 정렬
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (failRate[i] == temp[j]) {
                    if (answer[j] != 0)
                        continue;
                    answer[j] = i+1;
                    break;
                }
            }
        }

        return answer;
    }
	//배열에서 중복되는 정수값을 카운트하기 위한 메서드
    public int count(int[] arr, int n) {
        int cnt = 0;

        for (int i : arr) {
            if (i == n)
                cnt++;
        }
        return cnt;
    }
}