package Ch19;
/*
자바 메모리 구조
1) Stack
{} 내에서 선언되어지는 변수, {}벗어나면 소멸 // 지역 변수
2) Heap
-> 객체 저장용 공간 // new 예약어 생성 + 참조변수 , 참조변수연결 해제시 GC(가비지)에 의해 소멸
3) Class(==Method)
-> 공유메모리 영역 // 생성자함수/일반함수/static함수/static변수
-> 공유메모리 영역에 변수를 저장할경우 static 변수
 */

class Simple{
    static int x;       //공유메모리 영역에 적재
    int y;

    void ShowXY(){
        System.out.println("x = " + x + ",Y = " + y);
    }
}

public class C01StaticMain {

    public static void main(String[] args) {

        //static 멤버는 클래스명으로 접근 가능
        Simple.x = 123;

        Simple ob1 = new Simple();      // stack            Heap                class(Method)
//        ob1.x = 10;                     //ob1(100)          ob1(x(100),y)       ob1(x(100),y)
//        ob1.y = 20;                     //ob2(x값은 그대로 가지만 y참조하지 않는다.)
//        ob1.ShowXY();

        Simple ob2 = new Simple();
//        ob2.ShowXY();
//        ob2.x = 100;
//        ob1.ShowXY();

        ob1.ShowXY();
        ob2.ShowXY();
    }

}
