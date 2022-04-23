package Coffee;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.util.*;

class Menu {
    String name;        //메뉴명 지정
    int price;          //메뉴에 따른 가격 지정

    Menu(String name, int price) {
        this.name = name;       //메뉴 생성자
        this.price = price;     //가격 생성자
    }
}

public class coffee {
    //메뉴와 개수
    static HashMap<String,Integer> hashMap = new HashMap<>();
    //주문했던 메뉴와 개수가 저장됨
    static HashMap<String,Menu> menuMap = new HashMap<>();
    //CountAdd(String 메뉴, int 개수)
    static void CountAdd(String order, int count){
        //만약 메뉴가맞다면
        if (hashMap.containsKey(order)) {
            //메뉴선정과 동시에 그 메뉴에 대한 개수가 올라감
            hashMap.put(order, hashMap.get(order) +count);
        }else {
            hashMap.put(order, count);
        }
    }
    //메뉴를 정하고 //수량을 출력함
    void counting(String order,Scanner input){
        //Scanner input = new Scanner(System.in);
        //메뉴를 선택후 그 메뉴의 개수를 입력함
        System.out.printf("%s 수량 : \n", order);
        int count = input.nextInt();
        //메뉴가 몇개인지 출력
        CountAdd(order, count);
        System.out.printf("%s %d개 주문\n", order, count);

    }
    void menuSetup(){
        //메뉴 종류
        System.out.println("현재까지 주문하신 내역은" + hashMap);
        System.out.println("1. 아메리카노 3800원");
        System.out.println("2. 바닐라라떼 4500원");
        System.out.println("3. 초코라떼 5000원");
        System.out.println("4. 아이스티 3000원");
        System.out.println("종료 : -1");

    }
    //총 가격 계산

    int TotalAmount(){
        int total = 0;
        //파일 불러오기
        //해쉬 인터레이터 공부하기******
        Iterator<String> iterator = hashMap.keySet().iterator();

        try {
            while(iterator.hasNext()){
                String menuName = iterator.next();
                total += hashMap.get(menuName) * menuMap.get(menuName).price;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        coffee c = new coffee();
        Menu americano = new Menu("아메리카노", 3800);
        menuMap.put("아메리카노", americano);
        Menu vanilla = new Menu("바닐라라떼", 4500);
        menuMap.put("바닐라라떼", vanilla);
        Menu chocolateLatte = new Menu("초코라떼", 5000);
        menuMap.put("초코라떼", chocolateLatte);
        Menu icedTea = new Menu("아이스티", 3000);
        menuMap.put("아이스티", icedTea);

        while (true) {
            //처음 눈에 보이는 화면 여기서 스캐너로 입력받음
            System.out.println("1.주문하기  2. 주문내역  3.결제하기  4.종료");
            int num = input.nextInt();
            //만약 1번을 입력시 coffee c = new coffee();가 실행됨
            if (num == 1) {  //주문하기
                c.menuSetup();
                while (true) {
                    int num1 = input.nextInt();
                    if (num1 == 1) {
                        c.counting("아메리카노",input);
                        c.menuSetup();
                    } else if (num1 == 2) {
                        c.counting("바닐라라떼",input);
                        c.menuSetup();
                    } else if (num1 == 3) {
                        c.counting("초코라떼",input);
                        c.menuSetup();
                    } else if (num1 == 4) {
                        c.counting("아이스티",input);
                        c.menuSetup();
                    } else if (num1 == -1) {
                        break;
                    }else {
                        System.out.println("없는 메뉴 입니다.");
                        continue;
                    }
                }
            }else if (num == 2){ // 주문내역
                System.out.println(hashMap);
            }else if (num == 3) {
                System.out.printf("결제할 금액 %d 원\n", c.TotalAmount());

                while (true) {
                    System.out.println("결제 방법을 선택하세요 : 1. 카드 2. 현금 3. 종료");
                    int num2 = input.nextInt();
                    if (num2 == 1) {
                        System.out.println("카드 결제입니다.");
                        c.TotalAmount();
                        break;
                    } else if (num2 == 2) {
                        System.out.println("현금 결제입니다.");
                        System.out.println("결제 금액 : " + c.TotalAmount());
                        System.out.print("지불할 금액 : ");
                        int money = input.nextInt();
                        if (money > c.TotalAmount()) {
                            System.out.printf("잔돈은 %d원 입니다.\n", money - c.TotalAmount());
                            break;
                        } else {
                            System.out.println("금액이 부족합니다.");
                            System.out.println("다른 결제방법을 선택하세요.");
                            continue;
                        }
                    } else {
                        System.out.println("잘못된 결제 방법입니다.");
                        System.out.println("다른 결제방법을 선택하세요");
                        continue;
                    }
                }
            }else if (num == 4) {
                System.out.println("프로그램이 종료 되었습니다.");
                break;
            }

        }
    }
}
