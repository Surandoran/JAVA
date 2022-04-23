package Ch06;

import java.util.Scanner;

public class C02IF {

	public static void main(String[] args) {
		//Else IF 문
		Scanner sc = new Scanner(System.in);
//		
//		int age = sc.nextInt();
//		if(age >= 20) {
//			System.out.println("성인입니다.");
//		}else if(age >= 8) {
//			System.out.println("취학아동입니다.");
//		}else {
//			System.out.println("미취학아동입니다");
//		}
		
		//문제
		//Score를 입력받아서
		//90점이상이면 'A'
		//90점미만 80점 이상이면 'B'
		//80점미만 70점 이상이면 'C'
		//70점미만 60점 이상이면 'D'
		//60점미만이면 'F'
		//출력
		
		int Score = sc.nextInt();
		
		if(Score >= 90) {
			System.out.println("점수는 " + Score + "등급은 A");
		}else if(Score >= 80) {
			System.out.println("점수는 " + Score + "등급은 B");
		}else if(Score >= 70) {
			System.out.println("점수는 " + Score + "등급은 C");
		}else if(Score >= 60) {
			System.out.println("점수는 " + Score + "등급은 D");
		}else {
			System.out.println("점수는 " + Score + "등급은 F");
		}
		
		//문제
		//나이별로 요금을 부과하는 else if만드세요
		//8세미만 : 1000원
		//14세미만 : 2000원
		//20세미만 : 2500원
		//20세이상 : 3000원
		
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println(age + "세이상 : 요금은 3000원");
		}else if(age >= 14) {
			System.out.println(age + "세이상 20세미만 : 요금은 2500원");
		}else if(age >= 8) {
			System.out.println(age + "세이상 14세미만 : 요금은 2000원");
		}else {
			System.out.println(age + "세 미만 : 요금은 1000원");
		}
	}

}
