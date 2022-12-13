package 입출력과_사칙연산;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_18108 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int year = Integer.parseInt(str);
        /**
         * BufferedReader는 한 줄 단위로 읽은 뒤 문자열로 반환하기 때문에 입력에 대한 문자열을 정수로 변환해주는 과정이 필요하다
         * Integer클래스의 parseInt()메소드는 숫자형식의 문자열에 대해 정수형으로 반환해주는 역할을 한다.
         */

        System.out.println(year - 543);
        br.close();
    }
}
