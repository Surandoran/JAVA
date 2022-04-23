package Ch09;

class C14Car {
	String owner;
	String Carname;
	int speed;
	int fuel;
	String cup1;
	String cup2;

	C14Car(String owner,String Carname,int speed,int fuel,String cup1, String cup2){
		this.owner = owner;
		this.Carname = Carname;
		this.speed = speed;
		this.fuel = fuel;
		this.cup1 = cup1;
		this.cup2 = cup2;
	}
	C14Car(String owner,String Carname,int speed,int fuel,String cup1){
		this.owner = owner;
		this.Carname = Carname;
		this.speed = speed;
		this.fuel = fuel;
		this.cup1 = cup1;
	}
	C14Car(String owner,String Carname,int speed,int fuel){
		this.owner = owner;
		this.Carname = Carname;
		this.speed = speed;
		this.fuel = fuel;
	}
	void Info() {
		System.out.println("소유주(owner) : " + owner);
		System.out.println("모델(Carname) : " + Carname);
		System.out.println("연료량(fuel) : " + fuel);
		System.out.println("속도(speed : " + speed);
		System.out.println("홀더1(cup1) : " + cup1);
		System.out.println("홀더2(cup2) : " + cup2);
		System.out.println();

	}
}
public class C14CarMain{

	public static void main(String[] args) {
		C14Car mycar1 = new C14Car("홍길동","Avantee",0,100,"식혜","수정과");
		//소유자(owner),모델(model),연료량(fuel),속도(speed),홀더1(cup1),홀더(cup2)
		mycar1.Info();
		C14Car mycar2 = new C14Car("홍길동","펠리세이드",0,100,"아아");
		//소유자(owner),모델(model),연료량(fuel),속도(speed),홀더1(cup1)
		mycar2.Info();
		C14Car mycar3 = new C14Car("홍길동","그렌져",0,100);
		//소유자(owner),모델(model),연료량(fuel),속도(speed)
		mycar3.Info();
	}
}

