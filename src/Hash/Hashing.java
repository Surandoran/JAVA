package Hash;
/*Hashing
HashMap과 같이 Hashing을 구현한 컬렉션 클래스에서는 Object 클래스에 정의된 hashCode()를 Hash Method로 사용한다.
Object 클래스에 정의된 hashCode()는 객체의 주소를 이용하는 알고리즘으로 해시 코드를 만들어내기 때문에
모든 객체에 대해 중복되지 않는 값을 제공한다.
String 클래스의 경우 Object로 부터 상속받은 hashCode()를 오버 라이딩하여 문자열의 내용으로 해시 코드를 만들어 낸다.
서로다른 String 인스턴스 일지라도 같은 내용의 문자열을 가졌다면 hashCode()를 호출했을 때 같은 값을 얻는다.
 */
import java.util.*;

public class Hashing {

    public static void main(String[] args) {
        String s = "string";
        String s1 = "string";
        System.out.println(s.hashCode()); // -891985903
        System.out.println(s1.hashCode()); // -891985903
        System.out.println(s.equals(s1)); // true

        HashMap<String,Integer> testMap = new HashMap<String,Integer>();
        testMap.put("s",2);
        testMap.put("s",1);
        testMap.put("s1",2);
        System.out.println(testMap); // {s=1, s1=2}
/*정리 -
Hash는 ArrayList의 추가/삭제 시 속도가 느려지는 단점과 LinkedList의 검색시 처음부터 끝까지
 다 찾아봐야하는 비효율성을 해결하고자 나온 방법이다.
앞서 살펴보았던 HashMap을 떠올리며 정리해보자.
HashMap은 key-value 로 값을 저장한다. ArrayList 처럼 index로 해당 데이터에 바로 찾아가는 기능이 구현되어 있는 것이다.
그리고 key를 추가/삭제 할 때  LinkedList 처럼 다른 데이터들의 index를 바꿔 줄 필요 없이 key의 중복만을 검사해서
빠르게 변경해준다.

MAP에 대해서 다시한번 정리해보자.
MAP은 key-value로 데이터를 다를 수 있도록 하는 인터페이스이다. 이때 key-value의 특징을 기억해보면
key는 중복이 되면 안된다는 것이다. 중복을 허용하지 않는다는 것은 key를 따로 저장해두고 새로운 key가
추가될 때 key 저장소를 검사해야 한다는 뜻이다.

HashMap 에서 중복검사 등을 담당하는 것이 Hash라고 생각하면 될 것 같다.
HashTable, HashMethod, Hashing으로 설명해보자.
Hash는 key-value를 HashTable에 저장한다. 이 때 저장할 key를 HashMethod인 hashCode()를
사용해 중복없는 고유의 값으로 만든다.
방법은 String 클래스를 보면 알 수 있다. String 클래스에서 값이 입력되면 Object의 hashCode()를 오버라이딩 하여
해당 값을 코드로 변환한다. 그렇기 때문에 서로다른 String 객체라도 입력된 값이 같다면 hashCode는 동일한 코드를 반환한다.
이때 String 클래스의 equals()로 두 객체를 비교하면 값도 같고 hashCode도 동일하기 때문에 같은 객체로 인지하게 되는 것이다.

이 방법 그대로 HashTable에 key를 저장할때 hashCode()를 사용하여 특정 코드로 변환하고 변환된 코드를 저장한다.
같은 key값이 들어오면 hashCode로 변환후 같은 값을 찾아 덮어쓴다.
이렇게 HashMethod를 써서 HashTable에 저장하는 것을 Hashing이라고 한다.
어렵다.. 이해가 안된다기 보다는 분명 봐야할것이 산더미처럼 많은느낌이다...
String이 hashCode()를 사용해서 서로 다른 객체이지만 값은 같은 경우 같은객체로 인자하여 eqauls()를 사용해
중복검사를 하는 부분을 이해해두고 같은 방법으로 HashMap에서 key 관리한다 정도로 정리해두자.
 */
    }

}
