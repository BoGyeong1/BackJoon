import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class baekjoon_2869 {

    // //-처리 (잔여 길이가 남는 다면 한번 더 미끄러져야함)
    public int calculation(int length, int down, int up) {
        int day = (length - down) / (up - down);
        if ((length - down) % (up - down) != 0)
            day++;

        return day;
    }

    public static void main(String[] args) {
        // -테스트 케이스
        // 2 1 5 -> 4
        // 5 1 6 -> 2
        // -프로그래밍 순서
        // -입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // -토큰분리해서 변수에 지정
            int up = Integer.parseInt(st.nextToken());
            int down = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            baekjoon_2869 main = new baekjoon_2869();
            int output = main.calculation(length, down, up);
            // 출력

            System.out.println(output);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // -try-on
        // -실패 시 원인 기록
        // 단순하게 생각했다가 시간 초과...

    }

}
