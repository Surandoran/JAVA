package Ch04;
import java.util.*;

public class C02Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//문제
		//국어(kor) 영어(eng) 수학(mat) 점수를 Scanner로 입력받아
		//총합과 평균을 구해보세요
		//평균값은 소수점을 포함하여 출력합니다.
		
		System.out.println("국어 점수를 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int mat = sc.nextInt();
		
		int sum = kor + eng + mat;
		
		System.out.println("총 점수 = " + sum + "\n평균 값 = " + (double)sum/3);
		
		sc.close();
	}

}
