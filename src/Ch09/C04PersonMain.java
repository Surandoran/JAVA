package Ch09;
import java.io.*;
import java.util.*;
//주의! 메인클래스가 아닌 다른클래스에는 접근한정자를 붙이지 않는다
class C04Person{
	String name;
	int age;
	float height;
	double weight;
	
	//가능 (=멤버메서드, 멤버함수)
	void talk() {
		System.out.println(name + "님이 말합니다");
	}
	void walk() {
		System.out.println(name + "님이 걷습니다");
	}
}
//주의! main메서드를 포함한 java파일명과 class 명은 일치해야한다
public class C04PersonMain {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			int sum = a + b;

			bw.write(sum + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
		
		C04Person obj = new C04Person();
		obj.name = "홍길동";
		obj.age = 35;
		obj.talk();
	}

}
