package Ch17;

// 5_6 ArrayEx6.java
// 배열의 활용 - 최대값과 최소값

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] score = {79, 88, 91, 33, 100, 55, 95};

        int max = score[0]; //초기화
        int min = score[0]; //초기화

        for(int i=1;i<score.length;i++) {
            if(score[i]>max) {
                max = score[i];
            } else if (score[i]<min) {
                min = score[i];
            }
        }
        System.out.println("최대값 :"+max);
        System.out.println("최소값 :"+min);
    }
}