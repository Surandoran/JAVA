package Ch17;

// 5_5 ArrayEx5.java
// 배열의 활용 - 총합과 평균

public class ArrayEx5 {
    public static void main(String[] args) {
        int sum = 0;            // 총점
        float average = 0f;     // 평균

        int[] score = {100, 88, 100, 100, 90};

        for(int i=0;i<score.length;i++) {
            sum+=score[i];
        }

        average = sum / (float)score.length;    //계산결과를 float로 얻기위해 형변환

        System.out.println("총점: "+sum);
        System.out.println("평균: "+average);
    }
}