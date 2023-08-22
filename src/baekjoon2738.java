import java.util.Scanner;

public class baekjoon2738 {

    public static void main(String[] args) {

        // 입력- 스캐너로 값받기
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        // 받은 값으로 배열 만들기
        int[][] arr1 = new int[number1][number2];
        int[][] arr2 = new int[number1][number2];

        // 배열1 값 입력
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                arr1[i][j] = scanner.nextInt();
            }

        }

        // 배열2 값 입력

        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                arr2[i][j] = scanner.nextInt();
            }

        }

        // 처리 배열 1과 2의 값 더하기
        for (int i = 0; i < number1; i++) {
            for (int j = 0; j < number2; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
                // 밑줄로 넘기기
                if (j == number2 - 1)
                    System.out.println();

            }
        }
        scanner.close();

    }

}
