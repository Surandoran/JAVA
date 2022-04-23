package Ch09;
import java.util.*;
// 함수의 4가지 형태를 잘 기억하자!@#!@#!@
class C05Simple{
	//속성
	Scanner sc = new Scanner(System.in);
	//기능
	//반환o, 매개변수o
	int sum1 (int x, int y) {
		return x + y;
	}
	//반환o, 매개변수x
	int sum2() {
		System.out.println("정수 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}
	//반환x, 매개변수o
	void sum3(int x, int y) {
		System.out.printf("sum3(%d, %d)=%d\n", x, y, x + y);
	}
	//반환x, 매개변수x
	void sum4() {
		System.out.print("1값 입력 : ");
		int x = sc.nextInt();
		System.out.print("2값 입력 : ");
		int y = sc.nextInt();
		System.out.printf("%d + %d = %d\n", x, y, x + y);
	}
}

//SubClass 를 선언하고
//sub1,sub2,sub3,sub4멤버 메서드를 만들어서 실행해봅니다(두수의 차계산함수)
//반환O, 매개변수O
//sub1(int x,int y) : int
//반환X, 매개변수X
//sub2() 			: void
//반환X, 매개변수O
//sub3(int x,int y) : void
//반환O, 매개변수X
//sub4() 			: int
class SubClass{
	Scanner sc = new Scanner(System.in);
	//반환 o 매개변수 o
	int sub1 (int x, int y) {
		return x + y;
	}
	//반환 x 매개변수 x
	void sub2() {
		System.out.print("첫번째값 입력 : ");
		int x = sc.nextInt();
		System.out.print("두번째값 입력 : ");
		int y = sc.nextInt();
		System.out.println(x + " + " + y + " = " + (x + y));
	}
	//반환 x 매개변수 o
	void sub3(int x, int y) {
		System.out.println(x + " " + y + " = " + (x + y));
	}
	//반환 o 매개변수 x
	int sub4() {
		System.out.print("정수 두개 입력 :");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x + y;
	}
}

public class C05SimpleMethod {

	public static void main(String[] args) {
//		C05Simple obj = new C05Simple();
//		
//		int result1 = obj.sum1(10, 20);
//		System.out.println("result = " + result1);
//		
//		int result2 = obj.sum2();
//		System.out.println("result2 = " + result2);
//		
//		obj.sum3(2342, 2342);
//		
//		obj.sum4();
		
		SubClass SC = new SubClass();
		//반환o 매개변수o
		int SC1 = SC.sub1(15, 15);
		System.out.println("SC1 = " + SC1);
		//반환x 매개변수x
		SC.sub2();
		//반환x 매개변수o
		SC.sub3(15, 15);
		//반환o 매개변수x
		int SC4 = SC.sub4();
		System.out.println(SC4);
	}

}
