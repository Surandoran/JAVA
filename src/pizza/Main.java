package pizza;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0;
        int num;
        while (true) {
            System.out.println("----------------원하시는 항목을 선택해주세요----------------");
            System.out.println("1.주문");
            System.out.println("2.주문내역");
            System.out.println("3.프로그램종료");
            num = sc.nextInt();


            if (num == 1) {
                HashMap<Integer, String> menu = new HashMap<Integer, String>() {{
                    put(1, "페퍼로니피자");
                    put(2, "파인애플피자");
                    put(3, "콤비네이션피자");
                    put(4, "체다치즈피자");
                    put(5, "도이치휠레피자");
                }};
                System.out.println("피자메뉴는 아래에서 선택해주세요.");
                System.out.println("1.페퍼로니피자");
                System.out.println("2.파인애플피자");
                System.out.println("3.콤비네이션피자");
                System.out.println("4.체다치즈피자");
                System.out.println("5.도이치휠레피자");
                int price = 0;
                int i = sc.nextInt();
                if (i == 1) {
                    int peperoni = 15000;
                    price = peperoni;
                    System.out.println("0.페퍼로니피자의 금액은 " + price + "입니다.");
                }
                if (i == 2) {
                    int pain = 14000;
                    price = pain;
                    System.out.println("1.파인애플피자의 금액은 " + price + "입니다.");
                }
                if (i == 3) {
                    int combi = 16000;
                    price = combi;
                    System.out.println("2.콤비네이션피자의 금액은 " + price + "입니다.");
                }
                if (i == 4) {
                    int ceda = 17000;
                    price = ceda;
                    System.out.println("3.체다치즈피자의 금액은 " + price + "입니다");
                }
                if (i == 5) {
                    int doich = 20000;
                    price = doich;
                    System.out.println("도이치휠레피자의 금액은 " + price + "입니다");
                }
                if (i > 6) {
                    System.out.println("존재하지 않는 메뉴입니다.");
                }
                money += price;
                System.out.println("주문한 총 금액은" + money + "입니다.");
            }else if(num == 3){
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }


    }
    }