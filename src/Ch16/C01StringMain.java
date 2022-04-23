package Ch16;
//자바/Java String클래스 생성자와 메서드 정리
//
//
//        1. substring
//        String substring(int begin)
//        String substring(int begin, int end)
//        한 문자열에서 내용의 일부를 추출하는 메서드
//        주어진 시작위치(begin)부터 끝 위치(end) 범위에 포함된 문자열을 얻는다.
//
//
//        String s = "java.lang.Object";
//        String c = s.substring(10);          c = "Object"
//        String p = s.substring(5,9);         p = "lang"
//
//        substring(int start , int end)를 사용할 때 주의해야할 점은 매개변수로 사용되는 문자열에서 각 문자의 위치를 뜻하는 index가 0부터 시작한다는 것과 start부터 end의 범위 중 end위치에 있는 문자는 결과에 포함되지 않는다는 것이다.
//
//        (start <= x < end)
//
//        [참고] end에서 start값을 빼면 substring에 의해 추출될 글자의 수가 된다.
//        [참고] substring의 철자에 주의하도록 한다. subString이 아니다.
//
//        index  0 1 2 3 4 5 6 7 8 9
//        char   H e l  l  o .  j a v a
//
//        사용예                                                  결과
//        string a = str.substring(0,5);                a = "hello"
//        string b = str.substring(6.10);               b = "java"

//        2.split
//        String[] split(String regex)
//        문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환 한다.
//
//        String animals = "dog, cat, bear";
//        String[] arr = animals.split(",")
//
//        결과
//        arr[0] = "dog"
//        arr[1] = "cat"
//        arr[2] = "bear"

//        3. contains
//        boolean contains(charSequence s)
//        지정된 문자열(s)이 포함되었는지 검사 한다.
//
//        String s = "abcedfg";
//        boolean b = s.contains("bc");
//
//        결과
//        b = true

//        4. endsWith
//        boolean endsWith(String suffix)
//        지정된 문자열(suffix)로 끝나는지 검사 한다.
//
//        String file = "Hello.txt";
//        boolean b = file.endsWith("txt");
//
//        결과
//        b = true

//        5. equals
//        boolean equals(Object obj)
//        매개변수로 받은 문자열(obj)과 String인스턴스의 문자열을 비교한다. obj가 String이 아니거나 문자열이 다르면 false를 반환한다. String 클래스는 equals 메소드를 오버라이드 해서 사용한다.
//
//        String s = "Hello";
//        boolean b = s.equals("Hello");
//        boolean b2 = s.equals("hello");
//
//        결과
//        b = true
//        b2 = false

//        6.replace
//        String replace(CharSequence old, CharSequence nw)
//        문자열 중의 문자열(old)을 새로운 문자열(nw)로 모두 바꾼 문자열을 반환 한다.
//
//        String s = "Hellollo";
//        String sl = s.replace("ll","LL"));
//
//        결과
//        sl = "HeLLoLLo"

//        7.toString
//        String toString()
//        String 인스턴스에 저장되어 있는 문자열을 반환 한다.
//
//        String s = "Hello";
//        String sl = s.toString();
//
//        결과
//        sl = "Hello"

//        8. toLowerCase
//        String toLoweCase()
//        String 인스턴스에 저장되어있는 모든 문자열을 소문자로 변환하여 반환 한다.
//
//        String s = "Hello";
//        String sl = s.toLowerCase();
//
//        결과
//        sl = "Hello"

//        9. toUpperCase
//        String toUpperCase()
//        String 인스턴스에 저장되어있는 모든 문자열을 대문자로 변환하여 반환 한다.
//
//        String s = "Hello";
//        String sl = s.toUpperCase();
//
//        결과
//        sl = "HELLO"

//        10. trim
//        String trim()
//        문자열의 왼쪽 끝과 오른쪽 끝에 있는 공백을 없앤 결과를 반환한다. 이 때 문자열 중간에 있는 공백은 제거되지 않는다.
//
//        String s = "     Hello World   ";
//        String sl = s.trim();
//
//        결과
//        sl = "Hello World"

//        11. valueOf
//static String valueOf(boolean b)
//static String valueOf(char c)
//static String valueOf(int i)
//static String valueOf(long l)
//static String valueOf(float  f)
//static String valueOf(double d)
//static String valueOf(Object o)

//        지정된 값을 문자열로 변환하여 반환 한다.
//        참조변수의 경우, toString()을 호출한 결과를 반환 한다.
//
//        String b = String.valueOf(true);
//        String c = String.valueOf('a');
//        String i = String.valueOf(100);
//        String l = String.valueOf(100L);
//        String f = String.valueOf(10f);
//        String d = String.valueOf(10.0);
//        java.util.Date dd = new java.util.Date();
//        String date = String.valueOf(dd);
//
//        결과
//        b = "true"
//        c = "a"
//        i = "100"
//        l = "100"
//        f = "10.0"
//        d = "10.0"
//        date = "Sub Jan 27:21:26:29 KST 2008"
//        --------------------------------------------------------------------------------
//        자바(java)의 String 클래스(class)는 여러가지의 메소드(method)들을 포함하고 있는데
//        그중 자주 사용되는 메소드(method)들에 대해서 알아보자.
//        (외워놓으면 유용하게 쓰일수있다.)
//        char
//        charAt(int index)
//
//        지정된 인덱스에 있는 문자를 반환한다.
//        int
//        compareTo(String anotherStirng)
//
//        사전적 순서로 문자열을 비교한다. 문자열 인스턴스가 작으면 음수, 같으면 0, 크면 양수가 반환 된다.
//        String
//        concat(String str)
//
//        주어진 문자열을 현재의 문자열 뒤에 붙인다.
//        boolean
//        equals(Object anObject)
//
//        주어진 객체와 현재의 문자열을 비교한다.
//        boolean
//        equalsIgnoreCase(String antherString)
//
//        대소문자를 무시하고 비교한다.
//        boolean
//        isEmpty()
//
//        length()가 0 이면 true를 반환한다.
//        int
//        length()
//
//        현재 문자열의 길이를 반환 한다.
//        String
//        replace(char oldChar, char newChar)
//
//        주어진 문자열에서 oldChar를 newChar로 변경한, 새로운 문자열을 생성하여 반환한다.
//        String
//        substring(int beginIndex, int endIndex)
//
//        현재 문자열의 일부를 반환한다.
//        String
//        toLowerCase()

//        문자열의 모든 문자열을 소문자로 변경한다.
//        String
//        toUpperCase()
//
//        문자열의 모든 문자열을 소문자로 변경한다.
//        위와같이 11개 정도를 주로 쓰는데.
//        사용 방법은 이러하다.

//public static void main(String[] args) {
//
//        String proverb="A barking dog"; // 0의 자리부터 12번째 자리까지 있음
//        String s1, s2, s3,s4;
//        char ch1;
//        int n1;
//        boolean b1,b2,b3;
//
//        System.out.println(proverb);
//        System.out.println("문자열의 길이 ="+proverb.length()); // 총 13개의 문자가 있다.
//
//        s1 = proverb.concat(" never Bites!");			  // 문자열 결합
//        s2 = proverb.replace('b', 'B');				  // 문자 교환(b를 B로 교환)
//        s3 = proverb.substring(2, 5);					  // 부문 문자열 추출 (2번째 자리부터 4번째 자리까지 추출)
//        s4 = proverb.toUpperCase();				  // 문자열 모두를 대문자로 변환
//        ch1 = proverb.charAt(2);					  // 해당위치의 문자 반환(char 형식)
//        n1 = proverb.compareTo("The barking dog");		  // 사전적 순서로 비교를 함 (int 형식)
//
//        b1 = proverb.equals("A Barking Dog");			  // 대소문자를 구분하여 비교함(boolean 형식)
//        b2 = proverb.equalsIgnoreCase("a barking DOG");	  // 대소문자 구분없이 비교함(boolean 형식)
//        b3 = proverb.isEmpty();					  // 문자열의 길이가 0 이면 true 아니면 false(boolean 형식)

//        System.out.println(s1);                                           // A barking dog never Bites!
//        System.out.println(s2);                                           // A Barking dog
//        System.out.println(s3);                                           // bar
//        System.out.println(s4);                                           // A BARKING DOG
//        System.out.println(ch1);                                           // b
//        System.out.println(n1);                                           // -19
//        System.out.println(b1);                                           // false
//        System.out.println(b2);                                           // true
//        System.out.println(b3);                                           // false
//
//        }

//        결과

//        A barking dog
//        문자열의 길이 =13
//        A barking dog never Bites!
//        A Barking dog
//        bar
//        A BARKING DOG
//        b
//        -19
//        false
//        true
//        false
//        -------------------------------------------------------------------
//        String substring(int start) : 현재 문자열 객체 start위치부터 끝까지 문자열 발췌
//        String substrnig(int start, int end) : 현재 문자열 객체에서 start 부터 end 직전까지 문자열 발췌
//        Char charAt(int location) : 현재 문자열 객체에서 해당위치의 문자값 1개를 발췌. 반환값은 char형
//        int indexOf(int ch) : 현재 문자열 객체에서 ch문자가 첫번째로 발견된 위치를 반환,없으면 -1반환
//        int indexOf(String str) : 현재 문자열 객체에서 str를 찾아서 존재하면 첫째문자 위치를 반환하고 없으면 -1반환
//
//        -----------------------------------------
//
//        ex1) 문자과 문자열의 추출 예
//
//        String str = "goodmorning-kil-dong"
//        String s1 = str.substring(12) ; // kil-dong // 시작값만 주어지면 그 위치부터 끝까지 추출
//        String s2 = str.substring(12,15); //kil // 시작값위치부터 끝값-1 위치까지 추출(끝값위치의 문자는 포함하지않음)
//        char 문자열변수 = 문자열.charAt(12) // k // 12번째 문자1개만 반환한다
//        String str2 = "banana";
//        int a1 = str2.indexOf('a'); // 1 // 맨 처음값의 위치를 찾음
//        String str3 = "총 비용은 $45.76";
//        int a2 = str3.indexOf("$45.76"); // 6 // 문자열이 시작하는 위치를 찾음

//        ex2) 이런식으로 substring 과 indexOf 와 length를 적절히 사용하면 문자열에서 원하는 문자추출이 가능하다
public class C01StringMain {
    public static void main(String[] args) {
        String str1 = "java";
        String str2 = "java";

        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 ? " + (str1 == str2));
        System.out.println("str3 == str4 ? " + (str3 == str4));
        System.out.println("str1 == str3 ? " + (str1 == str3));
        System.out.println("str1 == str4 ? " + (str1 == str4));
        System.out.println("str2 == str4 ? " + (str2 == str4));
        System.out.println();
        //문자열 자체 비교시 기준객체.equals(비교 대상객체)
        System.out.println("str1 == str2 ? " + (str1.equals(str2)));
        System.out.println("str1 == str2 ? " + (str3.equals(str3)));
        System.out.println("str1 == str2 ? " + (str1.equals(str3)));
    }
}
