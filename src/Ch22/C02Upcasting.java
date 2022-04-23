package Ch22;

class C02Super{
    int x;

}

class C02Sub extends C02Super{
    int y;
}

public class C02Upcasting {

    public static void main(String[] args) {
        //No casting : 클래스 자료형변환
        C02Super ob1 = new C02Super(); //
        ob1.x = 10;
        C02Sub ob2 = new C02Sub();
        ob2.x = 10;
        ob2.y = 20;
        //Up Casting(자동형변환) : 상위클래스 잠조변수 = 하위클래스 객체
        //자료형이 자동으로 형변환되는 과정
        //상위클래스형의 멤버(int x)까지만 사용할수 있다.
        C02Super ob3 = new C02Sub(); //Upcasting 상태
        ob3.x = 10;
        //ob3.y = 20; //접근불가...! 멤버는 존재하나 접근할 수 없다

        //DownCasting : 하위클래스 참조변수 = 상위클래스
        //Upcasting 상태에서 확장(추가)된 멤버에 접근하기 위해 사용
        C02Sub down = (C02Sub) ob3;
        down.x = 10;
        down.y = 20;
    }

}
