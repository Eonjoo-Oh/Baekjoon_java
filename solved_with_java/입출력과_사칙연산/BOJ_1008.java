package 입출력과_사칙연산;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */
import java.util.Scanner;

public class BOJ_1008 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double A = in.nextDouble();
        double B = in.nextDouble();

        System.out.println(A / B);

        in.close();
    }
}
