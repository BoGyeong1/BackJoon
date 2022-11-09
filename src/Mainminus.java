import java.util.Scanner;

//refer: https://www.acmicpc.net/submit/1001/48316831
public class Mainminus {
    // -테스트 케이스
    // 3 2 --> 1
    // 5 3 --> 2

    public int minus(int input_first, int input_second) {
        int output = (input_first - input_second);
        return output;
    }

    public static void main(String[] args) {

        // -프로그래밍 순서
        // 두 정수를 입력 받음
        Scanner scanner = new Scanner(System.in);

        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();
        scanner.close();

        // 두 정수를 뺌
        Mainminus main = new Mainminus();
        int output = main.minus(input_first, input_second);

        // 뺀 값을 출력
        System.out.println(output);

    }

}
