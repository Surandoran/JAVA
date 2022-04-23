package Ch13;
//캡슐화
//특정 목적 달설을 위해 필요한 여러 기능들(단일클래스 or 여러클래스내의)을 묶는 작업
//캡슐화 과정에서는 정보은닉을 수반
//특정 공정과정의 순서가 바뀌거나 잘못된 값이 전달되었을때 전체 프로세스에 결함이
//발생 할 수 있기 때문에 부분적(or 전체)으로 private 설정을 하게 된다
//정확한 공정과정을 이해한뒤에 캡슐화작업을 하여야 한다.
class CarEngine{
    //흡입 -> 압축 -> 폭발 -> 배기 (private 은닉)
    private void Induction(){
        System.out.println("흡입!!!!!");
    }
    private void Compress(){
        System.out.println("압축!!!!!");
    }
    private void Power(){
        System.out.println("폭발!!!!!");
    }
    private void Exhaust(){
        System.out.println("배기!!!!!!");
    }

    public void EngineStart() {
        System.out.println("엔진구동!!!!");
        Induction();
        Compress();
        Power();
        Exhaust();
    }
}
class C02Car{
    CarEngine engine;
    C02Car(){
        engine = new CarEngine();
    }
    void StarCar(){
        // 전등불 ON;
        // 핸들 OFF -> ON
        // 엔진 동작 ON
        engine.EngineStart();
    }
}
public class C02Capsulation {

    public static void main(String[] args) {
        C02Car mycar = new C02Car();
        mycar.StarCar();

    }
}
