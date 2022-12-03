import java.io.*;

public class findFraction {
    // -테스트 케이스
    // 1 -> 1/1
    // 2 -> 1/2
    // 3 -> 2/1
    // 14-> 2/4

    public static void main(String[] args) {
        // -프로그래밍 순서
        // 값 입력받기
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;
        try {
            input = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 메소드 결과값
        String outputs = output(input);

        // 출력
        System.out.print(outputs);

    }

    public static String output(int input) {
        int crossCnt = 1;
        int prevCntSum = 0;
        while (true) {
            // 대각선 직전 누적합 + 해당 대각선 개수를 이용한 범위를 구분
            if (input <= prevCntSum + crossCnt) {
                // 대각선의 개수가 홀수 일 경우
                if (crossCnt % 2 == 1) {

                    // 분자가 큰 수 부터 시작
                    // 분자는 대각선상 블럭의 개수 - (input번째 - 직전 대각선까지의 블럭개수 -1)
                    String outputs = (crossCnt - (input - prevCntSum - 1)) + "/" + (input - prevCntSum);
                    return outputs;
                } else {
                    // 대각선의 개수가 짝수일 경우
                    // 홀수 일때의 출력을 반대로
                    String outputs = (input - prevCntSum) + "/" + (crossCnt - (input - prevCntSum - 1));
                    return outputs;
                }

            } else {
                prevCntSum += crossCnt;
                crossCnt++;
            }

        }
    }

}

// -try-on
// -실패 시 원인 기록
// 메인 메소드 잘못건드려서 한참 고생했따....