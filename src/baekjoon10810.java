import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon10810 {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 공백 구분
        StringTokenizer st;

        try {
            st = new StringTokenizer(br.readLine());

            // 입력 - 바구니 숫자
            int n = Integer.parseInt(st.nextToken());
            int[] arr = new int[n];

            // 몇번 넣을지
            int m = Integer.parseInt(st.nextToken());

            //
            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                // I번 숫자 부터 J번 숫자까지 K번 넣기
                int I = Integer.parseInt(st.nextToken());
                int J = Integer.parseInt(st.nextToken());
                int K = Integer.parseInt(st.nextToken());

                for (int j = I - 1; j < J; j++) {
                    arr[j] = K;
                }
            }

            for (int k = 0; k < arr.length; k++) {
                bw.write(arr[k] + " ");
            }

            br.close();
            bw.flush();
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
