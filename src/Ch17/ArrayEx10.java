package Ch17;

// 5_10 ArrayEx10.java
// 배열의 활용 - 정렬하기

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] numArr = new int[10];

        for(int i=0;i<numArr.length;i++) {
            System.out.print(numArr[i] = (int)(Math.random()*numArr.length));
        }
        System.out.println();

        for(int i=0;i<numArr.length-1;i++) {
            boolean changed = false;    // 자리바꿈이 발생했는지를 체크한다

            for(int j=0;j<numArr.length-1-i;j++) {
                if(numArr[j] > numArr[j+1]) {
                    int tmp = numArr[j];
                    numArr[j] = numArr[j+1];
                    numArr[j+1] = tmp;
                    changed = true;
                }
            }
            // 자리바꿈이 없으면 반복문을 벗어난다.(이미 정렬되어 있는경우)
            if(!changed) break;

            // 버블정렬 한번 할때마다 출력
            for(int k=0;k<numArr.length;k++)
                System.out.print(numArr[k]);    // 정렬된 결과를 출력한다
            System.out.println();
        }
    }
}