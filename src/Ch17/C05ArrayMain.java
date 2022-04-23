package Ch17;

import java.util.Scanner;

public class C05ArrayMain {
    public static void main(String[] args) {

        //문제
        //5명의 학생의 국/영/수 점수를 입력받아 출력합니다
        //2차원 배열을 사용합니다
        //int score[][] = new int[5][3]
        //학생별 총점과 평균
        //국/영/수 총점과 평균도 함께 출력

        //출력
        //1. 학생 점수입력(국/영/수 순서) : 100 70 60
        //2. 학생 점수입력(국/영/수 순서) : 98 88 77
        //3. 학생 점수입력(국/영/수 순서) : 10 20 30
        //4. 학생 점수입력(국/영/수 순서) : 100 55 66
        //5. 학생 점수입력(국/영/수 순서) : 88 77 66

        //1. 학생 총점 : ? 평균 : ?
        //2. 학생 총점 : ? 평균 : ?
        //3. 학생 총점 : ? 평균 : ?
        //4. 학생 총점 : ? 평균 : ?
        //5. 학생 총점 : ? 평균 : ?

        //국어 총점 : ? 평균 : ?
        //영어 총점 : ? 평균 : ?
        //수학 총점 : ? 평균 : ?

/*
        int[][] score = new int[5][3];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < score.length; i++){
            System.out.printf("%d 학생 점수입력(국/영/수) : " , (i + 1));
            score[i][0] = sc.nextInt(); //1번째 학생의 국어점수
            score[i][1] = sc.nextInt(); //1번째 학생의 영어점수
            score[i][2] = sc.nextInt(); //1번째 학생의 수학점수
        }
        //Score 결과 출력 시작-------------------
        System.out.println("\t국어\t영어\t수학");
        for(int i = 0; i < score.length; i++) {
            System.out.printf("%2d 학생\t", i + 1);
            for(int j = 0; j < score[i].length; j++) {
                System.out.print(score[i][j] + "\t");
            }
            System.out.println();
        }
        //Score 결과 출력 끝---------------------


        //1. 학생 총점 : ? 평균 : ?
        //2. 학생 총점 : ? 평균 : ?
        //3. 학생 총점 : ? 평균 : ?
        //4. 학생 총점 : ? 평균 : ?
        //5. 학생 총점 : ? 평균 : ?

        int sum = 0;
        double avg = 0.0;
        for(int i = 0; i < score.length; i++) { //행이동
            for(int j = 0; j < score[i].length; j++){ //열이동
                sum += score[i][j]

  */

        int number = 1;   //학생번호
        int sum = 0;      //과목 종합점수
        double avg = 5.0; //과목 평균값
        double kor = 0;   //국어 과목
        double eng = 0;   //영어 과목
        double mat = 0;   //수학 과목
        Scanner sc = new Scanner(System.in);
        //5행3열 변수 생성
        int[][] score = new int[5][3];
        //5행만큼 반복
        for (int i = 0; i < score.length; i++) {
            //3열만큼 반복
            System.out.print(number + ". 학생 점수입력(국/영/수 순서) :");
            for (int j = 0; j < score[i].length; j++) {
                score[i][j] = sc.nextInt();
                sum += score[i][j]; // 3과목의 총점

            }
            kor += score[i][0]; // 국어 총점
            eng += score[i][1]; // 영어 총점
            mat += score[i][2]; // 수학 총점
            System.out.print(number + ".학생 총점 : " + sum + "\t"); // 학생 총점
            System.out.print(number + ".학생 평균 : " + sum / score.length);  // 학생 평균
            System.out.println();
            //학생 번호바꿈
            number++;
            System.out.println("-------------------------");
            //총점 초기화
            sum = 0;
        }
        System.out.println("국어 총점 : " + kor + "국어 평균 : " + kor/avg);
        System.out.println("영어 총점 : " + eng + "영어 평균 : " + eng/avg);
        System.out.println("수학 총점 : " + mat + "수학 평균 : " + mat/avg);
        
    }
}
