import java.io.*;
import java.util.StringTokenizer;

public class Maindivide {

    // -테스트 케이스
    // 1 3 -> 0.33333333333333
    // 4 5 -> 0.8
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;

        try {
            // -프로그래밍 순서
            // A와 B를 입력받음
            String input = bufferedReader.readLine();
            // 받은 값을 분리
            stringTokenizer = new StringTokenizer(input, " ");
            int input_first = Integer.parseInt(stringTokenizer.nextToken());
            int input_second = Integer.parseInt(stringTokenizer.nextToken());
            // A와 B를 나누기
            double divide = (input_first / input_second);

            // 나눈 값을 출력
            System.out.println(divide);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
