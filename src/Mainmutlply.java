import java.io.*;
import java.util.StringTokenizer;

public class Mainmutlply {
    public int multiply(int input_first, int input_second) {
        int multiply = (input_first * input_second);
        return multiply;
    }

    // -테스트 케이스
    // 1 2 -> 2
    // 3 4 -> 12
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
            // A와 B를 곱합
            Mainmutlply main = new Mainmutlply();
            int output = main.multiply(input_first, input_second);
            // 곱한 값을 출력
            System.out.println(output);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
