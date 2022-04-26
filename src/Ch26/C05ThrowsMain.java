package Ch26;

public class C05ThrowsMain {

    public static void Exceptiontest(int div) throws ArithmeticException{
        int num = 10;
        System.out.println("결과 : " + (num/div));
        System.out.println("함수내부실행코드1");
        System.out.println("항수내부실행코드2");
    }

    public static void main(String[] args) {
        try {
            Exceptiontest(5);
            System.out.println();
            Exceptiontest(3);
            System.out.println();
            Exceptiontest(0);   //예외발생 산술오류
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("실행코드1");
        System.out.println("실행코드2");
    }

}
