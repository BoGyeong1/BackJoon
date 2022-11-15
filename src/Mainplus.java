import java.util.Scanner;

// -문제파악
// 두 정수 a와 b를 입력받은 다음 a+b를 출력
// 입력값은 (0<A, B<10) 따라야한다
// 테스트 케이스 개수 T가 처음에 주어진다.
// -유추파악
// 정수가 입력되고 입력된 숫자 만큼
// 두 정수를 입력해 합을 출력하는 배열을 생성
// -주요단어 영문이름 선정
// 입력 input
// 정수 decimal
// 출력 output
// 합 plus
// 케이스 case1
// 배열 arr

public class Mainplus {

    // 처리
    public int plus(int input_first, int input_second) {

        int output_plus = input_first + input_second;

        return output_plus;
    }

    public static void main(String[] args) {

        // -테스트 케이스
        // 3
        // 2 + 5 = 7
        // 10 + 20 = 30
        // 1 + 2 = 3

        // 4
        // 1 + 2 = 3
        // 10 + 20 = 30
        // 20 + 40 = 60
        // 3 + 5 = 8

        // -프로그래밍 순서
        // 입력
        // 처리
        // 출력

        // 입력
        Scanner scanner = new Scanner(System.in);
        int input_case = scanner.nextInt();
        int arr[] = new int[input_case];

        // 처리
        for (int i = 0; i < arr.length; i++) {
            int input_first = scanner.nextInt();
            int input_second = scanner.nextInt();
            Main1 main = new Main1();
            arr[i] = main.plus(input_first, input_second);

        }

        // 출력
        for (int output : arr)
            System.out.println(output);

        scanner.close();

    }

}
