package Ch09;

class C08Car {
	String owner;
	int speed;
	int fuel;
	//함수의 헤더
	public void Accel() {
		speed = speed + 10;
		fuel = fuel - 5;
		if(fuel <= 0){
			System.out.println("연료량은 = " + fuel + "가속 불가합니다");
		}else if(speed >= 200){
			System.out.println("속도가 " + speed + "가 200을 넘었습니다. 가속 X");
		}
		else{
			System.out.println(owner + "님 차량이 가속합니다. 연료량 = " + fuel + "현재속도 = " + speed);
		}
		//현재속도에서 +10 증가
		//195Km/h
//		if(fuel - 5 <= 0){
//			fuel = 0;
//			System.out.println("연료량 0.. 가속불가입니다.");
//			return;
//		}else {
//			fuel -= 5;
//		}
//		if(speed + 10 >= 200){
//			speed = 200;
//			System.out.println(owner + "님 차량이 최대속력입니다");
//		}else {
//			speed = speed + 10; //speed += 10;
//			System.out.printf(owner + " 님 차량 가속. fuel=%d,시속 =%dKm/h,fuel,speed);
//		}
		//연료량은 -5 감소
		//연료량이 0 순간 가속X("연료량 0 .. 가속불가합니다.")
		//최대속도 : 200Km/h 를 넘지 않게 설정

		//정상가속이 되면 (name 님 차량이 가속합니다. 연료량 = ? 현재속도 = ?)

	}
	public void Break() {
//		speed = speed - 10;
//		if(speed <= 0){
//			System.out.println("차량이 정지했습니다.");
//		}
		if(speed - 10 < 0){
			speed = 0;
			System.out.printf("현재속도 %d km/h..정지합니다\n",speed);
			System.exit(-1); // 프로그램 종료 코드
		}else {
			speed -= 10;
			System.out.printf("현재속도 %d km/h \n", speed);
		}
		//현재속도에서 -10 감소
		//현재속도가 0이라면 차량이 정지했습니다. 를 출력
	}
}
public class C08CarMain{

	public static void main(String[] args) {
		C08Car obj = new C08Car();
		obj.owner = "홍길동";
		obj.speed = 50;
		obj.fuel = 100;
		while(true){
			try {
				Thread.sleep(1000);//0.5초 일시정지
				//obj.Accel();
				obj.Break();
			}
			catch(Exception e){}
		}
	}
}

