package backjoon.silver.level2;

import java.util.Scanner;

//백준 > 실버4 > 수 이어 쓰기 1 (1748번)
public class Q06_1748 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        String str = "";

        if (N < 10) {
            System.out.println(N);
        } else {
            int digit = (int) (Math.log10(N) + 1);

            for (int i = digit - 1; i > 0; i--) {
                str += "" + i;
            }

            int front = (9 * Integer.parseInt(str));
            int back = (int) (digit * (N - Math.pow(10, digit - 1) + 1));

            System.out.println(front + back);
        }

    }
}
