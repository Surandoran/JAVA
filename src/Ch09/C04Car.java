package Ch09;

public class C04Car {
	String owner;
	int speed;
	int fuel;
	//함수의 헤더
	public int Accel() {
		System.out.println(owner + "님의 차가 가속합니다");
		return 8;
	}
	public void Break() {
		System.out.println(owner + "님의 차가 감속합니다");
	}
}
