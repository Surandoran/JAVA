package Ch03;

public class Ch04ArithChange {

	public static void main(String[] args) {
		//산술연산시 자동형변환
		
		//정수연산식(int보다 작은 변수자료형(short,char,byte))
		//-> int로 자동형변환
		byte x = 10;
		byte y = 20;
		short z = 30;
		
		int result = x + y + z; // 산술연산시 int보다 작으면 int로 자동형변환
		
		//정수연산식(int보다 큰 변수자료형(long)
		//-> 큰자료형으로 형변환
		
		byte x1 = 10;
		int y1 = 20;
		long z1 = 30L;
		
		long result1 = x1 + y1 + z1;
		
		//실수연산식
		
		int x2 = 10;
		float y2 = 3.3F;
		double z2 = 5.5;
		
		double result2 = x2 + y2 + z2; //실수자료형(size큰자료형) 으로 자동형변환

	}

}
