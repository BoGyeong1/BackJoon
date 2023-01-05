import java.io.*;
import java.util.*;

public class ABPlus {
    BufferedReader bufferedReader;
    static StringTokenizer stringTokenizer;
    static String string;
    StringBuilder stringBuilder;

    public static StringBuilder sum(String string, BufferedReader bufferedReader, StringTokenizer stringTokenizer,
            StringBuilder stringBuilder) {

        // 공백으로 분리
        try {
            while ((string = bufferedReader.readLine()) != null) {
                stringTokenizer = new StringTokenizer(string, " ");
                int a = Integer.parseInt(stringTokenizer.nextToken());
                int b = Integer.parseInt(stringTokenizer.nextToken());
                // 분리한 값을 더함
                stringBuilder.append(a + b).append("\n");
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return stringBuilder;
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();

        StringBuilder output = sum(string, bufferedReader, stringTokenizer, stringBuilder);

        System.out.println(output);
    }

}
