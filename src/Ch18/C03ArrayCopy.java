package Ch18;

public class C03ArrayCopy {

    public static void main(String[] args) {

        int[] arr1 = {10, 20, 30};
        int[] arr2;
        //얕은 복사(참조변수를 복사함,즉 주소 값 복사)
        //arr2 = arr1;

        //깊은 복사(값 자체를 복사함)
        arr2 = new int[3];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr1[i];
        }


        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] = %d\n",i,arr2[i]);
        }
        arr1[0] = 100;
        arr1[1] = 200;
        arr1[2] = 300;
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("arr2[%d] = %d \n",i,arr2[i]);
        }

    }
}
