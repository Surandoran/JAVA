package Ch28;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class C07MapMain {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap();

        //추가하기
        //map.put(key,value);
        if(map.containsKey("aaa")){
            map.put("aaa",1234);
        }
        if(map.containsKey("aaa")){
            map.put("bbb",1111);
        }
        if(map.containsKey("aaa")){
            map.put("ccc",2222);
        }
        if(map.containsKey("aaa")){
            map.put("aaa",9999); //중복된 Key 전달(마지막 Key : Value저장)
        }

        //개수확인
        System.out.println("개수 : " + map.size()); //size() 배열의 길이확인

        //조회하기
        //1. 모든 Key 수집(Set)
        Set<String> set = map.keySet(); //map.의 Key값을 저장
        //2. Iterator 를 통한 Key 순회
        Iterator<String> iter = set.iterator();
        //3. 각각 Key에 해당되는 value를 추출
        while (iter.hasNext()){
            String key = iter.next(); // 하나 Key 받기
            int Value = map.get(key); // Key에 대응되는 Value꺼내기
            System.out.println("Key : " + key + "\nValue : " + Value);
        }
        System.out.println("확인 : " + map.toString());

    }

}
