package Ch27;

class C04Simple<K,T>{

    K x;
    T y;

    C04Simple(K x,T y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "C04Simple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class C04GenericMain {

    public static void main(String[] args) {
        //기본자료형을 제너릭타입에 전달할 수 없다 -> Wrapper 클래스로 기본자료형을 대체한다
        C04Simple<Integer,Double> ob1 = new C04Simple(10,10.2);
        System.out.println(ob1.toString());

        C04Simple<Character,String> ob2 = new C04Simple('가', "Hello World");
        System.out.println(ob2.toString());

        C04Simple<String,Person> ob3 = new C04Simple("KEY1",new Person("홍길동","대구"));
        System.out.println(ob3.toString());
    }
}
