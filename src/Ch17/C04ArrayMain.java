package Ch17;

public class C04ArrayMain {
    public static void main(String[] args) {
//        //2차원 배열 생성
//        int[][] arr = new int[2][3];
//        //배열 안의 값 넣기
//        arr[0][0] = 10;
//        arr[0][1] = 20;
//        arr[0][2] = 30;
//        arr[1][0] = 40;
//        arr[1][1] = 50;
//        arr[1][2] = 60;
//
//        //행길이
//        System.out.println("행의 길이 : " + arr.length);
//        //1행의 열 길이
//        System.out.println("1행의 열 길이 : " + arr[0].length);
//        //2행의 열 길이
//        System.out.println("2행의 열 길이 : " + arr[1].length);
//
//        //행길이 반복
//        for (int i = 0; i < arr.length; i++) {
//            //열길이 반복
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();
//        }
        int[][]arr2 ={
                {10, 20, 30},       //0번째 행
                {40, 50, 60},       //1번째 행
                {70, 80, 90},       //2번째 행
                {100, 110, 1120}    //3번째 행
        };

        System.out.println("전체 행 길이 : " + arr2.length);
        System.out.println("0 행 길이 : " + arr2[0].length);
        System.out.println("1 행 길이 : " + arr2[1].length);
        System.out.println("2 행 길이 : " + arr2[2].length);
        System.out.println("3 행 길이 : " + arr2[3].length);
    }
}
