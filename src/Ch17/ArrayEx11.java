package Ch17;

// 5_11 ArrayEx11.java
// 배열의 활용 - 빈도수 구하기

public class ArrayEx11 {
    public static void main(String[] args) {
        int[] numArr = new int[10];
        int[] counter = new int[10];

        for(int i=0;i<numArr.length;i++) {
            numArr[i] = (int)(Math.random()*10);    // 0~9의 임의의 수를 배열에 저장
            System.out.print(numArr[i]);
        }
        System.out.println();

        // 개수를 체크하는 배열 count배열에 저장.
        for(int i=0;i<numArr.length;i++) {
            counter[numArr[i]]++;
        }
        for(int i=0;i<numArr.length;i++) {
            System.out.println(i +"의 개수 :"+counter[i]);
        }
    }
}