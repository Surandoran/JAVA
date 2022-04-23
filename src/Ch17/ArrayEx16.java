package Ch17;

// 5_16 ArrayEx16.java
// 커멘드 라인을 통해 입력받기

public class ArrayEx16 {
    public static void main(String[] args) {
        System.out.println("매개변수의 개수:"+args.length);
        for(int i=0;i<args.length;i++) {
            System.out.println("args["+i+"] = \""+ args[i] + "\"");
        }
    }
}