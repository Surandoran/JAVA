package Ch17;

import java.util.Scanner;

public class C03ArrayMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

          //강사님 풀이
          //1)
          //5 int 배열 생성수
          //정수값을 각 배열 요소에 차례대로 저장 한 다음
          //모든 수의 합과 평균을 출력하세요
//        //스캐너
//        Scanner sc = new Scanner(System.in);
//        //배열
//        int arr[] = new int[5];
//        //값받기
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("%d 번째 요소 값 : ", i);
//            arr[i] = sc.nextInt();
//        }
//        //합 누적
//        int sum =0;
//        double avg =0.0;
//        for (int i = 0; i < 5; i++) {
//            sum += arr[i];
//        }
//        //평균 계산
//        avg = (double) sum/arr.length;
//        System.out.print("%합 : 5d, 평균 : %f\n", sum,avg);

        //2)
        //5 int 배열 생성후
        //정수값과 각 배열 요소에 차례대로 저장 한 다음
        //최대값과 최소값을 출력하세
        // 스캐너
//        Scanner sc = new Scanner(System.in);
//        //배열
//        int arr[] = new int[5];
//        //값받기
//        for (int i = 0; i < 5; i++) {
//            System.out.printf("%d 번째 요소 값 : ", i);
//            arr[i] = sc.nextInt();
//        }
//        //최대 값,최소 값
//        int max = arr[0];
//        for (int i = 0; i < 5; i++) {
//            if(max < arr[i]){
//                max = arr[i];
//            }
//            if(min > arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println("최대값 : " + max + " 최소값 : " + min);


        //1)
        //5 int 배열 생성수
        //정수값을 각 배열 요소에 차례대로 저장 한 다음
        //모든 수의 합과 평균을 출력하세요
        int[] x = new int[5];
        x[0] = sc.nextInt();
        x[1] = sc.nextInt();
        x[2] = sc.nextInt();
        x[3] = sc.nextInt();
        x[4] = sc.nextInt();
        int sum = 0;
        for (int num : x) {
            sum += num;
        }
        System.out.println(sum);
        System.out.println("---------------------------");

        //2)
        //5 int 배열 생성후
        //정수값과 각 배열 요소에 차례대로 저장 한 다음
        //최대값과 최소값을 출력하세요

        //int 배열
        int[] y = new int[5];
        y[0] = sc.nextInt();
        y[1] = sc.nextInt();
        y[2] = sc.nextInt();
        y[3] = sc.nextInt();
        y[4] = sc.nextInt();

        //합계 계산
        int sum1 = 0;
        for (int num1 : y) {
            sum1 += num1;
        }

        //평균 계산
        double average = sum1 / y.length;

        //결과 출력
        System.out.println(average);

        //최소 값 최대 값 지정
        int iMax = 0;
        int iMin = 999999999;

        //연산식
        for (int i : y) iMax = Math.max(i, iMax);

        for (int i : y) iMin = Math.min(i, iMin);
        //결과 출력
        System.out.println("최소 값은 : " + iMin);
        System.out.println("최대 값은 : " + iMax);

        int xMax = 0;
        int xMin = 999999999;
        int[][] X = {{10,15},{20,25}};

    }
}
