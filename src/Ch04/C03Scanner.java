package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("정수 값 : " + num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("실수 값 : " + num2);
		
		System.out.print("문자열 입력 : ");
		String str1 = sc.next(); //띄어쓰기 미포함
		System.out.println("문자열(띄어쓰기x) : " + str1);
		
		System.out.print("문자열 입력 : ");
		String str2 = sc.nextLine(); //띄어쓰기 포함
		System.out.println("문자열(띄어쓰기o) : " + str2);
		System.out.println((int)str2.charAt(0));
		
		sc.close();
		
		

	}

}
