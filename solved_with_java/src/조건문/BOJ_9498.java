package 조건문;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_9498 {
    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        System.out.println((A >= 90) ? "A" : (A >= 80) ? "B" : (A >= 70) ? "C" : (A >= 60) ? "D" : "F");
    }
}
