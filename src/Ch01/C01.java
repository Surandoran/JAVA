package Ch01;
// 3개의 문자열을 각각의 String[] text 배열에 넣어줍니다
// 특정 문자열을 하나 따로 입력받아 해당문자열이 배열에 포함되어있는지 여부를 확인하는
// Iscontain 메서드를 완성하세요
// String 클래스 문자포함검색(contain) 메서드를 이용합니다

/*출력
1 문자열을 입력하세요 : 이것이 리눅스다
2 문자열을 입력하세요 : 윤성우의 열혈 C
3 문자열을 입력하세요 : DO IT 자바
찾을 문자열 입력하세요 : 열혈
열혈 포함 여부 : true

1 문자열을 입력하세요 : 이것이 리눅스다
2 문자열을 입력하세요 : 윤성우의 열혈 C
3 문자열을 입력하세요 : DO IT 자바
찾을 문자열 입력하세요 : 차차차
차차차 포함 여부 : false
 */

import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] text = new String[3];

        System.out.print("1 문자열을 입력하세요 : ");
        String str1 = sc.nextLine();
        text[0] = str1;

        System.out.print("2 문자열을 입력하세요 : ");
        String str2 = sc.nextLine();
        text[1] = str2;

        System.out.print("3 문자열을 입력하세요 : ");
        String str3 = sc.nextLine();
        text[2] = str3;

        System.out.print("찾을 문자열 입력하세요 : ");
        String find = sc.nextLine();

        boolean result = Iscontain(find, text);
        System.out.printf("%s 포함 여부 : %s\n", find, result);

    }

    public static boolean Iscontain(String str, String[] text) {
        for (int i = 0; i < text.length; i++) {
            if (text[i].contains(str)) {
                return true;
            }
        }
        return false;
    }

}
