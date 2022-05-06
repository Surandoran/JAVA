package CosmeticReview;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Member M = new Member();
        Review R = new Review();
        Product P = new Product();
        int num;

        while (true){
            System.out.println("---------회원가입메뉴----------");
            System.out.println("1.회원가입");
            System.out.println("2.기존아이디로그인");
            num = sc.nextInt();
            switch (num){
                case 1:
                    System.out.print("ID 입력 : ");
                    System.out.print("PW 입력 : ");
                    System.out.print("PHONE 입력 : ");
                    System.out.print("ADDR 입력 : ");

            }
        }

    }

}
