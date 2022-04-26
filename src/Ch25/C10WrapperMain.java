package Ch25;

public class C10WrapperMain {

    public static void main(String[] args) {
        //자동 Boxing
        Integer obj = 100;
        System.out.println("obj : " + obj);

        //자동 UnBoxing
        int val = obj;
        System.out.println("val : " + val);

        //자동UnBoxing(산술연산자)
        int result = obj+val;
        System.out.println("result1 : " + result);
    }

}
