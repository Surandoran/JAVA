package Ch17;

// 5_14 ArrayEx14.java
// charAt과 .toCharArray()사용하기

// (String문자열).charAt(인덱스)
// char[] chArr = (String문자열).toCharArray();

public class ArrayEx14 {
    public static void main(String[] args) {
        String src ="ABCD";

        for(int i=0;i<src.length();i++) {
            char ch = src.charAt(i);    // String src중의 i번째 문자를 ch에 저장.
            System.out.println("src.charAt("+i+"):"+ch);
        }
        char[] chArr = src.toCharArray();   // String을 char[]로 변환
        System.out.println(chArr);
    }
}