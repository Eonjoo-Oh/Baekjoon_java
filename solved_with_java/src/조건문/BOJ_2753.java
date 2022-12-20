package 조건문;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2753 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());

        System.out.println((A % 4 == 0) ? ((A % 400 == 0) ? "1" : (A % 100 == 0) ? "0" : 1) : "0");
    }
}
