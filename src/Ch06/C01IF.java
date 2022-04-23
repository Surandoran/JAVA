package Ch06;
import java.util.*;

public class C01IF {

	public static void main(String[] args) {
		
		//단순 IF
		
//		int age = 6;
//		
//		if(age >= 8) {
//			System.out.println("취학 아동입니다.");
//		}
//		System.out.println("첫번째 if 벗어남");
//		
//		if(age < 8) {
//			System.out.println("미취학 아동입니다");
//		}
//		System.out.println("두번째 if 벗어남");
		
		//정수 3개값을 입력받아
		//입력받은 수가 짝수이면 "짝수입니다"
		//홀수 이면 "홀수입니다"를 if-else 문을 이용하여 출력
		Scanner sc = new Scanner(System.in);
		
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
//		sc.close();
//		
//		int sum = x + y + z;
//		
//		if(sum % 2 == 0) {
//			System.out.println("짝쑤");
//		}else {
//			System.out.println("홀수");
//		}
		
		//짝수이면서 3의배수
//		//홀수이면서 5의배수
//		int n = 0;
//		System.out.print("정수 입력 : ");
//		n=sc.nextInt();
//		
//		if(n % 2 == 0) {//짝수인가
//			System.out.println("짝수입니다");
//			if(n % 3 == 0) {
//				System.out.println("짝수이면서 3의 배수입니다.");
//			}
//		}else {
//			System.out.println("홀수입니다");
//			if(n % 5 == 0) {
//				System.out.println(n + "은 홀수이면서 5의배수");
//			}
//		}
//		System.out.println("종료");
		//문제
		//위 코드의 조건식과 if문을 and연산자 기호를 써서 바꿔보세요
		//두수를 입력받아 큰수를 출력하세요
		//세수를 입력받아 가장 큰수를 출력하세요
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
//		if(num1 % 2 == 0 && num1 % 3 == 0) {
//			System.out.println("짝수이며 3의 배수입니다");
//		}else if(num1 % 5 == 0){
//			System.out.println("홀수이며 5의 배수입니다");
//		}else {
//			System.out.println("홀수입니다");
//		}
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("num1 이 클때");
		}else if(num2 > num3) {
			System.out.println("num2가 클때");
		}else {
			System.out.println("num3이 클때");
		}
	}

}