package Ch17;

public class C01ArrayMain {
    public static void main(String[] args) {
        //일차원, 다차원 배열의 선언
        int number[];
        char[] letters;
        int grld[][];


        //배열의 크기(객체생성, 초기화)
        char alphabet[] = new char [26];    //26개 기억장소 생성
        int[] orimes = {7,5,10};            //3개 기억장소 생성

        int [] arr1 = new int [3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < 3; i++) {
            System.out.printf("arr[%d] = %d\n", i, arr1[i]);
        }
        System.out.println("arr1배열 길이 : " + arr1.length);

        double arr2[] = new double[7];

        float arr3[];
        arr3 = new float[10];

        System.out.println("arr2배열 길이 : " + arr2.length);
        System.out.println("arr3배열 길이 : " + arr3.length);
    }
}
