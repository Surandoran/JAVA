package Ch05;
import java.util.*;

public class C01Arithmethic {
	public static void main(String[] args) {
		//기본 산술연산자
//		int a = 10,b = 20;
//		System.out.println("a + b = " + (a + b)); // + 덧셈
//		System.out.println("a + b = " + (a - b)); // - 뺼셈
//		System.out.println("a + b = " + (a * b)); // * 곱셈
//		System.out.println("a + b = " + (a / b)); // / 나누기
//		System.out.println("a + b = " + (a % b)); // % 나머지 ( 짝홀 / 배수구분 / 범위제한 / 자리수)
//		
		//대입연산자(공간 = 값(먼저처리)
		
		//복합대입연산자
		
//		int a = 10,b = 4;
//		System.out.println("a += b ? " + (a += b)); //a = a + b ( a = 14 )
//		System.out.println("a -= b ? " + (a -= b)); //a = a - b ( a = 10 )
//		System.out.println("a *= b ? " + (a *= b)); //a = a * b ( a = 40 )
//		System.out.println("a /= b ? " + (a /= b)); //a = a / b ( a = 10 )
//		
		//비교연산자(대소관계 비교, true/false을 반환)
		//참(true)		:프로그래머가 원하는 결과값이 나오는 경우
		//거짓(false)	:X
//		int a = 10; int b = 20;
//		
//		System.out.println("a == b ? " + (a == b)); // == 같냐고 묻는것임
//		System.out.println("a >  b ? " + (a >  b)); // a가 크냐고 묻는것임
//		System.out.println("a >= b ? " + (a >= b)); // a가 같거나 더 크냐고 묻는것임
//		System.out.println("a <  b ? " + (a <  b)); // b가 더 크냐고 묻는것임
//		System.out.println("a <= b ? " + (a <= b)); // <= b가 같거나 더 크냐고 묻는것임
//		System.out.println("a != b ? " + (a != b)); // != 다르냐고 묻는것임
//		
		//논리연산자
//		int a = 10, b = 20, c = 15;
//		//AND 연산자(&&) : 둘모두 true여야 true가 반환됨
//		System.out.println((a >= b) && (b >= c)); //false && true
//		System.out.println((a <= b) && (b <= c)); //true  && false
//		System.out.println((a <= b) && (b >= c)); //true  && true
//		System.out.println((a >= b) && (b <= c)); //false && false
//		System.out.println();
//		//OR 연산자(||) : 둘 중 하나라도 값이 true면 true가 반환
//		System.out.println((a >= b) || (b >= c)); //false || true
//		System.out.println((a <= b) || (b <= c)); //true  || false
//		System.out.println((a <= b) || (b >= c)); //true  || true
//		System.out.println((a >= b) || (b <= c)); //false || false
//		System.out.println();
//		//! : 논리 부정연산자
//		boolean flag = true;
//		System.out.println("!flag = " + !flag);
		//증감 연산자(++ : 1증가,-- : 1감소)
		
		//전치 연산자 : ++a,--a : 변수안의 값을 1증가(or 1감소)를 먼저 연산한 다음 다른 연산 처리
		
		//후치 연산자 : a++,a-- : 다른 연산처리를 다 완료한다음 1증가(or 1감소)
		
//		int a = 10, b = 20, c = 0, d = 0;
//		
//		c = ++a + b--; //a=11 b=19 c=31
//		d = b++ + ++a; //a=12 b=19 d=31
//		System.out.println(a + " " + b + " " + c + " " + d);
		
		//삼항 연산자
//		int score = 85;
//		char grade = (score > 90) ? 'A':'B';
//		
//		System.out.println("grade ? " + grade);
//		
//		Scanner sc = new Scanner(System.in);
//		int num1,num2,num3;
//		
//		System.out.println("세개의 과목 점수를 입력해주세요");
//		num1 = sc.nextInt();
//		num2 = sc.nextInt();
//		num3 = sc.nextInt();
//		
//		int sum = (num1 + num2 + num3) / 3;
//		System.out.println(num1 >= 40 && num2 >= 40 && num3 >= 40 && sum >=70 ? "합격" : "불합격");
//		
//		또 다른 방법
//		int kor = 0, eng = 0, mat = 0;
//		double avg = 0.0;
//		System.out.print("국영수 점수 입려 : ");
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();
//		avg = (double)(kor+eng+mat)/3;
//		
//		String result = (kor >= 40 && eng >= 40 && mat >= 40 && avg >= 70) ? "합격" : "불합격";
//		System.out.println(result);
		//문제
		//조건식 : 국어>=40 && 영어>=40 && 수학 >=40 && 평균 >=70 -> 합격
		//키보드로 국어/영어/수학 점수를 입력받아 각각의 부분점수가 40점이상이고
		//총점수 평균이 70점이상이면 '합격'
		//미만이면 '불합격'을 출력합니다
		
		
		//비트 연산자
//		int num1 = 15;				//00000000 00000000 00000000 00001111 = 4
//		int num2 = 20;				//00000000 00000000 00000000 00010100 = 20
//		int num3 = num1 & num2;		//00000000 00000000 00000000 00000100 = 4
//		int num4 = num1 | num2;		//00000000 00000000 00000000 00011111 = 31
//		int num5 = num1 ^ num2;		//00000000 00000000 00000000 00011011 = 27
//		int num6 = ~num1;			//11111111 11111111 11111111 11110000 = -16
		
		
//		int num7 = num1 << 2;		//00000000 00000000 00000000 00111100 = 60
//		int num8 = num1 >> 3;		//00000000 00000000 00000000 00000001 = 1
//		System.out.println("AND 비트 연산 : " + num3);
//		System.out.println("OR 비트 연산 : " + num4);
//		System.out.println("XOR 비트 연산 : " + num5);
//		System.out.println("NOT 비트 연산 : " + num6);
//		System.out.println("<< 시프트 연산 : " + num7);
//		System.out.println(">> 비트 연산 : " + num8);
		
	}

}
