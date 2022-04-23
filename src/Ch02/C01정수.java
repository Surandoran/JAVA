package Ch02;

public class C01정수 {

	public static void main(String[] args) {
		
		// 010101101 : 173
		//%d : 10진 출력 서식문자
		System.out.printf("10진 서식 : %d\n", 173);
		System.out.printf("10진 서식 : %d\n", 0255);
		System.out.printf("10진 서식 : %d\n", 0xAD);
		System.out.println("---------------------");
		//%o : 8진 서식 문자
		System.out.printf("8진 서식 : %o\n", 173);
		System.out.printf("8진 서식 : %o\n", 0255);
		System.out.printf("8진 서식 : %o\n", 0xAD);
		System.out.println("---------------------");
		//%x : 16진 서식 문자
		System.out.printf("16진 서식 : %x\n", 173);
		System.out.printf("16진 서식 : %x\n", 0255);
		System.out.printf("16진 서식 : %x\n", 0xAD);

	}

}
