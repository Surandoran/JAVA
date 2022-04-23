package Ch17;

import java.util.Arrays;
import java.util.Collections;
public class Arrays메서드 {
    /*
    배열을 다룰 때 알아두면 편리한 Arrays의 메소드를 몇가지 소개한다.

    포스팅에 쓰일 문자형 배열 a와 정수형 배열 b를 선언하겠다.

            String[] a = {"a","b","c","d"};
    int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};

.asList(T..a) :
    배열을 ArrayList로 변환해준다.
    배열은 크기가 정해져있고 값의 삭제 등이 자유롭지 않아 불편한 점이 많다.
    asList를 사용하여 리스트로 변환한 후 체인메소드(chain method) 방식으로 ArrayList의 메소드를 더하여 활용하면 여러모로 편리한 점이 많다.

            Arrays.asList(a);

.toString() :
    배열에도 toString이 존재한다. toString이라는 메소드는 클래스에서 ALT+SHIFT+S를 누른 후 Generate toString을 이용해 오버라이딩할 수 있다.




            (이러한 모양)


    기본적인 형태는 위와 같으며 여기서 직접 코드를 수정하면 toString()을 이용할 때 출력되는 형식을 바꿔줄 수 있다.

            System.out.println(Arrays.toString(b));

[1, 5, 5, 7, 3, 3, 42, 6, 8, 45323, 4, 63, 2, 1]

    Sort(array) :
    정렬은 쓰이는 곳이 굉장히 많은데 기본적으로 Sort()를 하면 오름차순 정렬이 된다.
    정수형 배열을 내림차순 정렬하고 싶으면 반복문으로 배열을 뒤에서부터 꺼내 담아주거나 하는 방식을 사용할 수 있다.

            Arrays.sort(b);
System.out.println(Arrays.toString(b));

[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 45323]

    Sort() 두번째 : Sort(array, Comparator)
Collections.reverseOrder() 라는 메소드가 있는데, sort의 첫번째 파라미터에 문자형 배열을 담고 두번째 파라미터에
Collections.reverseOrder() 를 담으면 문자형 배열을 내림차순 정렬해준다.

            Arrays.sort(a, Collections.reverseOrder());
System.out.println(Arrays.toString(a));

[d, c, b, a]

    정수를 문자형으로 담아서 위와 같은 방식으로 정렬해도 작동하기는 한다.

            String[] cc = {"11","12","13","23","53","223","145","53"};

    다만 숫자 자체를 인식하는 것이 아니다보니 크기에 상관없이 무조건 첫번째 자리를 기준으로 내림차순 정렬해버린다.
    자리수가 모두 같은 정수들을 내림차순으로 쉽게 정렬하고 싶다면 이 방법도 좋겠다.

            Arrays.sort(cc, Collections.reverseOrder());
System.out.println(Arrays.toString(cc));

[53, 53, 23, 223, 145, 13, 12, 11]

    맨 앞자리 숫자만 따져 내림차순 정렬해버린 것을 볼 수 있다.


    Sort() 세번째 : Sort(array, int fromindex, int toindex)​
    인덱스의 시작과 끝을 정해 fromindex부터 toindex-1까지만 오름차순 정렬할 수도 있다.

            Arrays.sort(b,4,14);
System.out.println(Arrays.toString(b));

[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 45323]

        1,5,5,7은 그대로 두고 4인덱스부터 정렬이 시작된 것을 볼 수 있다.

            Sort() 네번째 : Sort(array, int fromindex, int toindex, Comparator)
    두번째와 세번째를 조합할 수도 있다!

            Arrays.sort(a); //{a,b,c,d}로 재정렬
Arrays.sort(a, 2,4,Collections.reverseOrder());
System.out.println(Arrays.toString(a));

[a, b, d, c]

    마찬가지로 a와 b는 그대로 두고 그 뒤부터 내림차순 정렬된 것을 확인할 수 있다.

.copyOf(array, int newlength) :
    배열을 복사한다. 파라미터로는 복사하고자 하는 배열과 새로운 배열의 크기가 들어간다.

    int[] c = Arrays.copyOf(b, 5);
System.out.println(Arrays.toString(c));

[1, 1, 2, 3, 3]

    파라미터로 5를 주었더니, 4인덱스까지 잘라내 복사한 것을 확인할 수 있다.






    포스팅에 사용된 전체 코드:

    Arrays_.java
*/
        public static void main(String[] args) {
            String[] a = {"a","b","c","d"};
            int[] b = {1,5,5,7,3,3,42,6,8,45323,4,63,2,1};
            System.out.println(Arrays.asList(a)); //List로

            Arrays.sort(b,4,14); //b 4번째 부터 14번째 까지 인덱스정렬
            System.out.println(Arrays.toString(b));

            Arrays.sort(b); //오름차순정렬

            System.out.println(Arrays.toString(b)); // string으로
            Arrays.sort(a, Collections.reverseOrder()); //문자형 배열을 거꾸로
            System.out.println(Arrays.toString(a));

            Arrays.sort(a);
            Arrays.sort(a, 2,4,Collections.reverseOrder());
            System.out.println(Arrays.toString(a));

            String[] cc = {"11","12","13","23","53","223","145","53"};
            Arrays.sort(cc, Collections.reverseOrder());
            System.out.println(Arrays.toString(cc));
            int[] c = Arrays.copyOf(b, 5); //복사
            System.out.println(Arrays.toString(c));

            String[] d = Arrays.copyOf(a, 2);
            System.out.println(Arrays.toString(d));

        }
    }
