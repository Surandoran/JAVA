package Ch23;

// 추상 클래스
// 문방구(write()) - 샤프(write())
//                 - 연필(writable())
//---------완성된 클래스--------
class Super1{
    void Func1() { //일반메소드(함수선언+함수정의)

    }
}

class Sub1 extends Super1{
    void Func1(){ // 함수 재정의 가능
        System.out.println("Sub1에서 재정의한 Func1");
    }
}

//---------추상 클래스----------
abstract class Super2{
    abstract void Func1();  //추상메소드(함수선언)
}

class Sub2 extends Super2{
    void Func1(){
        System.out.println("Sub2에서 재정의한 Func1");
    }
}
public class C01AbstractMain {

    public static void main(String[] args) {
        //일반클래스 상속관계
        Super1 ob1 = new Super1(); // 가능
        Sub1 ob2 = new Sub1();     // 가능

        //추상클래스 상속관계
//        Super2 ob3 = new Super2(); // 불가능( 미완성된 함수를 포함하고 있기 때문에)
        Sub2 ob4 = new Sub2();      // 가능 (물려받은 추상메소드를 정의했을때만 가능)

        //
        Super2 up = new Sub2(); //Upcasting
        up.Func1();
    }

}
