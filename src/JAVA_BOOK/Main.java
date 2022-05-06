package JAVA_BOOK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

//		150
//		266
//		427

		System.out.println(a * b * c);
		String num = String.valueOf(a * b * c);

		for (int i = 0; i < 10; i++) {
			int count = 0;
			char ch;
//			if(num.indexOf(i) == ch){
//				System.out.println(i + "의 갯수 : " + num.indexOf(String.valueOf(i)));
//			}
		}


	}
}