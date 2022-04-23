package Ch17;

// 5_3 ArrayEx3.java
// 배열의 복사 - for문 이용

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        // 배열 초기화
        for(int i=0;i<arr.length;i++)
            arr[i] = i+1;

        // 변경전 상태를 보여줌
        System.out.println("변경전 -  arr.length:"+arr.length);
        for(int i=0;i<arr.length;i++)
            System.out.println("arr["+i+"]:"+arr[i]);

        // 두배로 배열을 늘림
        int[] tmp = new int[arr.length*2];

        // 늘린 배열에 첫번째 배열 복사
        for(int i=0;i<arr.length;i++)
            tmp[i] = arr[i];

        arr = tmp;

        System.out.println("변경후 - arr.length:"+arr.length);
        for(int i=0;i<arr.length;i++)
            System.out.println("arr["+i+"]:"+arr[i]);

    }
}