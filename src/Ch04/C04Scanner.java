package Ch04;
import java.util.*;

public class C04Scanner {

	public static void main(String[] args) {
		
		//문제
		
		//이름을 입력하세요?홍길동          <- 이름은 키보드로 입력받습니다.
		//홍길동 님의 나이를 입력하세요? 33  <- 나이는 키보드로 입력받습니다. 이름은 서식문자로 출력
		//홍길동 님의 나이는 33살입니다.    <- 서식문자로 이름과 나이를 출력합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		System.out.println(name + "님의 나이를 입력하세요 : ");
		String age = sc.nextLine();
		System.out.println(name + "님의 나이는 " + age + "입니다");
		
		String id,jumin,phone;
		
		System.out.print("이름 : ");
		id = sc.nextLine();
		System.out.print("주민번호 6자리 : ");
		jumin = sc.nextLine();
		System.out.print("전화번호 : ");
		phone = sc.nextLine();
		
		System.out.println("1.이름 : " + id + "\n2.주민번호 6자리 : " + jumin + "\n3.전화번호 : " + phone);
		sc.close();
	}

}
