import java.util.Scanner;

public class baekjoon5597 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 학생 배열 만들기
        int[] stuNumber = new int[31];

        // 입력 - 과제 제출한 학생 입력
        for (int i = 1; i < 29; i++) {
            int submit = scanner.nextInt();
            // 제출한 사람은 1로
            stuNumber[submit] = 1;
        }

        // 없는 번호만 출력
        for (int i = 1; i < stuNumber.length; i++) {
            if (stuNumber[i] != 1) {
                System.out.println(i);
            }
        }

        scanner.close();

    }

}
