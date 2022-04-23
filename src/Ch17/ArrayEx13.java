package Ch17;

// 5_13 ArrayEx13.java
// 16진수를 2진수로 변환
// 별별별별별

public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C','A','F','E'};

        String[] binary = { "0000", "0001", "0010", "0011"
                ,"0100", "0101", "0110", "0111"
                ,"1000", "1001", "1010", "1011"
                ,"1100", "1101", "1110", "1111" }; // 0~15 까지의 binary를 전부 저장한다.
        String result = ""; // 결과를 String으로 저장한다.

        for(int i=0;i<hex.length;i++) {
            if('0'<=hex[i] && hex[i]<='9') {
                result += binary[hex[i]-'0'];   // 오...String으로 저장할때 이렇게함.
            } else {    // A~F 이면
                result += binary[hex[i]-'A'+10];
            }
        }
        System.out.println("hex:" + new String(hex));
        System.out.println("binary:"+result);

    }
}