package Ch17;

import java.util.Scanner;
//
//4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후 아래의 내용처럼 처리하세요.
//
//
//        실행 화면
//        9 3 7 19
//        3 6 9 18
//        6 10 10 26
//        18 19 26 63
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] x = new int[3][3];

        int sum1 = x.length - 1;
        int sum2 = x.length - 1;

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = sc.nextInt();

                sum1 += x[i][0];
                sum2 += x[0][j];
            }
        }
        System.out.println(x[0][3]);
        System.out.println(x[3][0]);

    }
}
