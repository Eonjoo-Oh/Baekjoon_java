package 입출력과_사칙연산;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_10926 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lastString = "??!";

        String s = br.readLine();
        System.out.println(s + lastString);
    }
}
