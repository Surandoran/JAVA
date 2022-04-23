package Ch07;
import java.util.*;

public class C03while {
	
	public static void main(String[] args) {
		//break, continue
		
		//break
		//-1을 입력하기 전까지 수를 계속 입력받아
		//입력된 수의 합을 출력
		
		Scanner sc = new Scanner(System.in);
//		int tmp = 0; // 키보드로 값 임시저장
//		long sum = 0L;
//		
//		while(true) {
//			System.out.print("입력(-1: 종료) : ");
//			tmp = sc.nextInt();
//			if(tmp == -1) {
//				break; //가장 가까이에 있는 반복문 탈출
//			}	
//			sum += tmp; //sum = sum + tmp;
//		}
//		System.out.println("종합 : " + sum);
//		int dan = 2;
//		int i = 1;
//		boolean flag = false;
//		
//		while(dan <= 9) {
//			i = 1;
//			while(i <= 9) {
//				System.out.printf("%d x %d = %d\n",dan,i,(dan*i));
//				i++;
//				if(dan == 7 && i == 7) {
//					flag = true;
//					break;
//				}
//			}
//			if(flag == true) {
//				break;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//Continue
		
		//1부터 10 까지 수중의 3의 배수는 제외하고 출력
		
//		int i = 0;
//		while(i <= 10) {
//			if(i % 3 == 0) {
//				i++;
//				continue;
//			}
//			System.out.println("i = " + i);
//			i++;
//		}
	}

}
