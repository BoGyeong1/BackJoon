import java.util.Scanner;

public class baekjoon2444 {

    public static void main(String[] args) {
        // 입력받기
        Scanner scanner = new Scanner(System.in);
        final int NUMBER = scanner.nextInt();

        // 처리
        for (int i = 1; i <= NUMBER; i++) {
            for (int j = 0; j < NUMBER - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = NUMBER - 1; i >= 0; i--) {
            for (int j = 0; j < NUMBER - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();

    }

}
