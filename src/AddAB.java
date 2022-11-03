import java.util.Scanner;

//문제 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//refer : https://www.acmicpc.net/submit/1000/48316653
public class AddAB {

    public static void main(String[] args) {

        // -테스트 케이스
        // 3 + 5 = 8
        // 20 + 50 = 70
        // -1 + 5 = error

        // -프로그래밍 순서
        // 입력
        // 처리
        // 출력

        Scanner scanner = new Scanner(System.in);

        // 입력 : 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
        int input_first = scanner.nextInt();
        int input_second = scanner.nextInt();

        // 처리
        int output_plus = input_first + input_second;

        // 출력 : 첫째 줄에 A+B를 출력한다.
        System.out.println(output_plus);

        scanner.close();
    }

}

// -문제파악
// 두 정수 a와 b를 입력받은 다음 a+b를 출력
// 입력값은 (0<A, B<10) 따라야한다
// -유추파악
// 두 정수를 입력해 합을 출력
// -주요단어 영문이름 선정
// 입력 input
// 정수 decimal
// 출력 output
// 합 plus
