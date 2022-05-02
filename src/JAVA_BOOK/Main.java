package JAVA_BOOK;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(a * b * c);
		String num = String.valueOf(a * b * c);

		for (int i = 0; i < 9; i++) {
			if(num.contains(String.valueOf(i))){
				System.out.println(num.indexOf(String.valueOf(i)));
			}else{
				System.out.println(0);
			}
		}


	}
}