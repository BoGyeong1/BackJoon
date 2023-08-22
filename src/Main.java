import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 입력 - 배열 안의 총 숫자 입력받기
        int number = scanner.nextInt();
        int[] arr = new int[number];

        // 배열에 각 숫자값을 저장
        for (int i = 0; i < number; i++) {
            arr[i] = scanner.nextInt();
        }

        // 찾을 숫자 값

        int findNumber = scanner.nextInt();

        // 처리 - 배열안에서 같은 값 찾기
        int count = 0;
        for (int i = 0; i < number; i++) {
            if (arr[i] == findNumber) {
                count++;
            }
        }

        System.out.println(count);
    }

}
