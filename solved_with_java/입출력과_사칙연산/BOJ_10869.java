package 입출력과_사칙연산;

/**
 * @author Eonjoo Oh (eonjoo29@hanmail.net)
 */
import java.util.Scanner;

public class BOJ_10869 {
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);

      int A = in.nextInt();
      int B = in.nextInt();

      System.out.println(A + B);
      System.out.println(A - B);
      System.out.println(A * B);
      System.out.println(A / B);
      System.out.println(A % B);

      in.close();
    }
}
