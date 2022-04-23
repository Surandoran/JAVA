package Ch07;

import java.util.Scanner;

public class C01while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//01 반복문 탈출 조건
		//1) 탈출용 변수
		//2) 탈출 조건식
		//3) 탈출 연산식
//		int i = 1;	//1) 탈출용 변수
//		while(i <= 10) { //2) 탈출 조건식
//			System.out.println("Hello World");
//			i++;	//03) 탈출 연산식
//		}
		
		//02 1부터 10까지의 합을 구하기
		
//		int i = 1;		//탈출용 변수
//		int sum = 0;	//누적용 변수
//		while(i <= 10) {
//			System.out.println("i = " + i);
//			sum += i;
//			i++;
//			System.out.println("1부터 10까지의 합 : " + sum);
//		}
		
		//문제
		//1부터 N(키보드로 입력받습니다)까지의 합을 구합니다
		//n부터 m까지수의 합을 구합니다(n,m은 키보드로 입력받습니다)
		
//		int N = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = 0;
//		int sum1 = 0;
//		
//		while(N <= m) {
//			System.out.println(N + "번째 출력");
//			sum += N;
//			N++;
//			
//			System.out.println(sum);
//		}
		
		//문제
		//구구단 2단 출력합니다
		//단수를 하나 입력받아서 해당 단수를 출력합니다.
//		int x = sc.nextInt();
//		int y = 2;
//		
//		while(x <= 9) {
//			System.out.println(y + " x " + x + " = " + x * y);
//			x++;
//		}
		//문제
		int x = 1;
		int y = 10;
		int temp;
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		//-----------
		if(n > m) {
			temp = n;
			n = m;
			m = temp;
		}
		//-----------
		int sum = 0;
		int Even = 0;
		int odd = 0;
		
		//1부터 10까지 수 중의 3의배수의 합만 출력
		//1부터 10까지의 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
		
//		while(x <= y) {
//			if(x % 3 == 0) {
//				sum += x;
//			}
//			if(x % 2 == 0) {
//				Even += x;
//			}
//			if(x % 2 == 1) {
//				odd += x;
//			}x++;
//		}
//		System.out.println("3의 배수의 합은 " + sum);
//		System.out.println("짝수의 합은 " + Even);
//		System.out.println("홀수의 합 " + odd);
//		
		
		//1부터 N까지 수 중의 3의 배수의 합만 출력
		//1부터 N까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력
//		int N = sc.nextInt();
		
//		while(x < N) {
//			if(x % 3 == 0) {
//				sum += x;
//			}
//			if(x % 2 == 0) {
//				Even += x;
//			}
//			if(x % 2 == 1) {
//				odd += x;
//			}x++;
//		}
//		System.out.println("3의 배수의 합은 " + sum);
//		System.out.println("짝수의 합은 " + Even);
//		System.out.println("홀수의 합 " + odd);
		
		//n부터 m까지 수 중의 3의 배수의 합만 출력
		//n부터 m까지 수 중의 짝수의 합 / 홀수의 합 따로 구해서 출력

		while(n <= m) {
			if(n % 3 == 0) {
				sum += n;
			}
			if(n % 2 == 0) {
				Even += n;
			}
			if(n % 2 == 1) {
				odd += n;
			}n++;
		}
		System.out.println("3의 배수의 합은 " + sum);
		System.out.println("짝수의 합은 " + Even);
		System.out.println("홀수의 합 " + odd);
				
	}

}
