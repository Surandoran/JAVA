package pizza;

import java.awt.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CAFE {
    Scanner sc = new Scanner(System.in);
    //메뉴와 개수
    static HashMap<String,Integer> hashMap = new HashMap<>();
    //주문했던 메뉴와 개수가 저장하는 해쉬를 만듬
    static HashMap<String, Menu> menuMap = new HashMap<>();
    //countAdd(메뉴와 개수)
    static void CountAdd(String order, int count){
        //만약 메뉴가 맞다면
        if(hashMap.containsKey(order)){
            //메뉴선정과 동시에 그 메뉴에 대한 개수가 올라감
            hashMap.put(order, hashMap.get(order) + count);
        }else{
            hashMap.put(order, count);
        }
    }

    //메뉴를 정하고 //수량을 출력함
    void counting(String order, Scanner sc){
        //Scanner input = new Scanner(System.in);
        //메뉴를 선택후 그 메뉴의 개수를 입력함
        System.out.printf("%s 수량 : \n", order);
        int count = sc.nextInt();
        //메뉴가 몇개인지 출력
        CountAdd(order, count);
        System.out.printf("%s %d개 주문\n", order, count);

    }

    void menuSetup(){
        //메뉴 종류
        System.out.println("1. 페퍼로니피자");
        System.out.println("2. 콤비네이션피자");
        System.out.println("3. 체다치즈피자");
        System.out.println("4. 포테이토피자");
        System.out.println("5. 베이컨체다치즈피자");
        System.out.println("6. 도이치휠레피자");
    }
    //총 가격 계산

//    int TotalAmount(){
//        int total = 0;
//        //파일 불러오기
//        //해쉬 인터레이터
//        Iterator<String> iterator = hashMap.keySet().iterator();
//
//        try{
//            while(iterator.hasNext()){
//                String menuName = iterator.next();
//                total += hashMap.get(menuName) * menuMap.get(menuName).;
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        return  total;
//    }

}
