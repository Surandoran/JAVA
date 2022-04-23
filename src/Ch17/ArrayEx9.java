package Ch17;

// 5_9 ArrayEx9.java
// 배열의 활용 - 임의의 값으로 배열 채우기
// 여려개 정해진 값으로 배열을 랜덤으로 초기화

import java.util.Arrays;

public class ArrayEx9 {
    public static void main(String[] args) {
        int[] code = {-4, -1, 3, 6, 11};    // 불연속적인 값들로 구성된 배열
        int[] arr = new int[10];

        for(int i=0;i<arr.length;i++) {
            int tmp = (int)(Math.random()*code.length);
            arr[i] = code[tmp];     // 특정 배열을 직접 복사해 옴.
        }
        System.out.println(Arrays.toString(arr));
    }
}