package Ch17;

// 5_7 ArrayEx7.java
// 배열의 활용 - 섞기(shuffle)
// 인덱스0과 0~9사이의 인덱스와 바꿔치기

public class ArrayEx7 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0;i<numArr.length;i++) {
            numArr[i] = i;  // 배열을 0~9의 숫자로 초기화 한다.
            System.out.print(numArr[i]);
        }
        System.out.println();

        // shuffling 인덱스0과 0~9사이의 인덱스와 바꿔치기
        for(int i=0;i<100;i++) {
            int n = (int)(Math.random()*10);    // 0~9중의 한 값을 임의로 얻는다
            int tmp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = tmp;
        }

        for(int i=0;i<numArr.length;i++)
            System.out.print(numArr[i]);
    }
}