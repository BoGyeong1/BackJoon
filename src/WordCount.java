import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {

    public static void main(String[] args) {
        // -테스트 케이스
        // The Curious Case of Benjamin Button -> 6
        // The first character is a blank->6
        // -프로그래밍 순서

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer;
        try {
            // 입력받고 " "단위로 끊기
            stringTokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            // 갯수 센것을 출력
            System.out.println(stringTokenizer.countTokens());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // -try-on
        // -실패 시 원인 기록

    }

}
