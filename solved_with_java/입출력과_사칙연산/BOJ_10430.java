package 입출력과_사칙연산;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_10430 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        //stringTokenizer : 문자열을 지정한 구분자로 쪼개주는 클래스. 쪼개진 문자열을 토큰이라고 부른다.
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println((A + B) % C);
        System.out.println((A % C) + (B % C) % C);
        System.out.println((A * B) % C);
        System.out.println((A % C) * (B % C) % C);

        br.close();
    }

}

