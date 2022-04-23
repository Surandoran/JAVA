package Ch17;

// 5_15 ArrayEx15.java
// String 배열 - 모르스 부호

public class ArrayEx15 {
    public static void main(String[] args) {
        String source = "SOSHELP";
        String[] morse = { ".-", "-...", "-.-.", "-..", "."
                ,"..-.", "--.", "....", "..", ".---"
                ,"-.-", ".-..", "--", "-.", "---"
                ,".--.", "--.-", ".-.", "...", "-"
                ,"..-", "...-", ".--", "-..-", "-.--"
                ,"--.." }; // 모르스 부호 미리 저장

        String result="";

        for(int i=0;i<source.length();i++) {
            result+=morse[source.charAt(i)-'A'];
        }
        System.out.println("source:"+source);
        System.out.println("morse:"+result);
    }
}