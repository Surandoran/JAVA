package Hash;
import java.util.*;
public class hashmap {
    public static void main(String[] args) {

/*HashMap 이란?
HashMap은 Map 인터페이스를 구현한 대표적인 Map 컬렉션입니다. Map 인터페이스를 상속하고 있기에
Map의 성질을 그대로 가지고 있습니다. Map은 키와 값으로 구성된 Entry객체를 저장하는 구조를 가지고 있는 자료구조입니다.
여기서 키와 값은 모두 객체입니다. 값은 중복 저장될 수 있지만 키는 중복 저장될 수 없습니다.
만약 기존에 저장된 키와 동일한 키로 값을 저장하면 기존의 값은 없어지고 새로운 값으로 대치됩니다.
HashMap은 이름 그대로 해싱(Hashing)을 사용하기 때문에 많은 양의 데이터를 검색하는 데 있어서 뛰어난 성능을 보입니다.

HashMap 사용법
HashMap 선언

HashMap<String,String> map1 = new HashMap<String,String>();//HashMap생성
HashMap<String,String> map2 = new HashMap<>();//new에서 타입 파라미터 생략가능
HashMap<String,String> map3 = new HashMap<>(map1);//map1의 모든 값을 가진 HashMap생성
HashMap<String,String> map4 = new HashMap<>(10);//초기 용량(capacity)지정
HashMap<String,String> map5 = new HashMap<>(10, 0.7f);//초기 capacity,load factor지정
HashMap<String,String> map6 = new HashMap<String,String>(){{//초기값 지정
    put("a","b");
}};
HashMap을 생성하려면 키 타입과 값 타입을 파라미터로 주고 기본생성자를 호출하면 됩니다.
HashMap은 저장공간보다 값이 추가로 들어오면 List처럼 저장공간을 추가로 늘리는데 List처럼
저장공간을 한 칸씩 늘리지 않고 약 두배로 늘립니다. 여기서 과부하가 많이 발생합니다.
그렇기에 초기에 저장할 데이터 개수를 알고 있다면 Map의 초기 용량을 지정해주는 것이 좋습니다.

HashMap 값 추가

HashMap<Integer,String> map = new HashMap<>();//new에서 타입 파라미터 생략가능
map.put(1,"사과"); //값 추가
map.put(2,"바나나");
map.put(3,"포도");

HashMap에 값을 추가하려면 put(key,value) 메소드를 사용하면 됩니다.
선언 시 HashMap에 설정해준 타입과 같은 타입의 Key와 Value값을 넣어야 하며 만약 입력되는 키 값이
HashMap 내부에 존재한다면 기존의 값은 새로 입력되는 값으로 대치됩니다.
HashMap 값 삭제
HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
    put(1,"사과");
    put(2,"바나나");
    put(3,"포도");
}};

Hash 값 삭제

map.remove(1); //key값 1 제거
map.clear(); //모든 값 제거
HashMap에 값을 제거하려면 remove(key) 메소드를 사용하면 됩니다.
오직 키값으로만 Map의 요소를 삭제할 수 있습니다. 모든 값을 제거하려면 clear() 메소드를 사용하면 됩니다.
HashMap 값 출력
HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
    put(1,"사과");
    put(2,"바나나");
    put(3,"포도");
}};

System.out.println(map); //전체 출력 : {1=사과, 2=바나나, 3=포도}
System.out.println(map.get(1));//key값 1의 value얻기 : 사과

//entrySet() 활용
for (Entry<Integer, String> entry : map.entrySet()) {
    System.out.println("[Key]:" + entry.getKey() + " [Value]:" + entry.getValue());
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도

//KeySet() 활용
for(Integer i : map.keySet()){ //저장된 key값 확인
    System.out.println("[Key]:" + i + " [Value]:" + map.get(i));
}
//[Key]:1 [Value]:사과
//[Key]:2 [Value]:바나나
//[Key]:3 [Value]:포도

*/
//Iterator 사용
HashMap<Integer,String> map = new HashMap<Integer,String>(){{//초기값 지정
    put(1,"사과");
    put(2,"바나나");
    put(3,"포도");
}};

//entrySet().iterator()
//Iterator<Entry<Integer, String>> entries = map.entrySet().iterator();
//while(entries.hasNext()){
//    Map.Entry<Integer, String> entry = entries.next();
//    System.out.println("[Key]:" + entry.getKey() + " [Value]:" +  entry.getValue());
//}
////[Key]:1 [Value]:사과
////[Key]:2 [Value]:바나나
////[Key]:3 [Value]:포도
//
////keySet().iterator()
//Iterator<Integer> keys = map.keySet().iterator();
//while(keys.hasNext()){
//    int key = keys.next();
//    System.out.println("[Key]:" + key + " [Value]:" +  map.get(key));
//}
////[Key]:1 [Value]:사과
////[Key]:2 [Value]:바나나
////[Key]:3 [Value]:포도
//HashMap의 전체출력 시 반복문을 사용하지 않고 Iterator를 사용하여도 됩니다.
//iterator로 Map안의 전체 요소를 출력하는 방법은 위와 같습니다.
    }
}
