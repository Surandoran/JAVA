package Ch22;
/*오버라이딩과 오버로딩의 차이
1. 오버로딩(Overloading)
- 메서드의 이름은 같고 매개변수의 갯수나 타입이 다른 함수를 정의하는 것을 의미한다.
- 리턴값만을 다르게 갖는 오버로딩은 작성 할 수 없다.

2. 오버라이딩(Overriding)
- over + ride =  먼가 위에서 (라이딩 한다)달린다???
- 상위 클래스의 메서드를 하위 클래스가 재정의 하는 것이다.
- 메서드의 이름은 물론 파라메터의 갯수나 타입도 동일해야 하며,
주로 상위 클래스의 동작을 상속받은 하위 클래스에서 변경하기 위해 사용된다.

즉,
오버로딩(Overloading)은 기존에 없던 새로운 메서드를 정의하는 것이고,(함수정의)
오버라이딩(Overriding)은 상속 받은 메서드의 내용만 변경 하는 것이다.(함수재정의)

 */


class Anlmal{
    void Sound(){
        System.out.println("소리를 냅니다");
    }
}
class Dog extends Anlmal{
    void Sound(){
        System.out.println("강아지가 소리를 냅니다");
    }
}
class Cat extends Anlmal{
    @Override
    void Sound(){
        System.out.println("고양이가 소리를 냅니다");
    }
}

public class C01OverridingMain {

    public static void main(String[] args) {
        Dog poppi = new Dog();
        Cat yummi = new Cat();

        poppi.Sound();
        yummi.Sound();
    }

}
