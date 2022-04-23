package JAVA_BOOK;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		
		//System.out : 표준 출력 스트림(해석 : 표준출력장치(모니터)에 데이터를 전달)
		
		//System.out.print() : 콘솔 화면에 데이터 출력
		
		//Escape(탈출) 문자 : 본래의 정보표ㅕ시용으로 사용하는게 아닌
		//				    제어문자용으로 쓰기위해 지정된 문자
		
		// \n : 개행(줄바꿈)
		// \b : 한문자 삭제
		// \t : 탭(8칸)만큼 커서 이동
		// \r : 행의 처음으로 이동
		
		//   *
		//  ***
		// *****
		//*******
		
		//System.out.printf() : 서식문자를 이용한 출력
		//서식 : 서류를 꾸미는 일정한 양식
		//%d : 10진 정수 서식
		//%f : 10진 실수 서식
		//%c : 한문자 서식
		//%s : 문자열 서식
//		System.out.printf("%d + %d = %d\n",10,20,10+20);
//		System.out.printf("%d + %d = %d\n",10.1, 20.2, 10.1+20.2);
//		System.out.printf("%c %c %c \n",'a', 'b', 'c');
//		System.out.printf("%s %s %s \n","this is ", "String ", "test");
//		System.out.printf("%d.[%c] %s\n", 1, 'A', "Java programming Basic");
		
		//문제
		//다음 내용을 printF로 출력하세요
		
		//이름	 나이		 주소
		//홍길동	 20		 대구 
		//김철수	 30		 울산 
		//박영의	 40		 인천
		
		System.out.printf("%s\t%s\t%s\n", "이름","나이","주소");
		System.out.printf("%s\t%s\t%s\n", "홍길동","20","대구");
		System.out.printf("%s\t%s\t%s\n", "김철수","30","울산");
		
		//서식문자를 이용하여 다음과 같은 문장을 완ㅅ ㅓㅇ합니다.
		//나의 이름은 %s 입니다.
		//나의 나이는 %d 살입니다.
		
		System.out.printf("나의 이름은 %s 입니다\n","손필욱");
		System.out.printf("나의 나이는 %d 입니다\n",29);
		
		//System.out.println(); --> \n포함한 출력
		
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		
		//주의
		
		// " 의 문자그대의 출력
		// System.out.println("I say :"Hello?" "); 오류!
	}
}
