package Ch27;

class Plastic{

    public void doPrinting(){
        System.out.println( "Plastic 재료로 출력");
    }
}

class Powder{

    public void doPrinting(){
        System.out.println("Powder 재료로 출력");
    }
}

class ThreeDprinter<T>{
    //속성
    private T Meterial;

    public T getMeterial(){
        return Meterial;
    }
    public void setMeterial(T Meterial){
        this.Meterial = Meterial;
    }

    //- meterial : Generic<T> //제너릭 설정할것, Getter and Setter 함수도 같이 만들어보세요 ~
}

public class C02GenericMain {

    public static void main(String[] args) {

        ThreeDprinter<Powder> print1 = new ThreeDprinter<Powder>(); //3d 프린트와 제너릭 타입을 Powder로 지정
        print1.setMeterial(new Powder());                           //3d 프린트(Powder> 객체 생성
        print1.getMeterial().doPrinting();                          //Powder객체 생성 후 주소를 3d 프린트객체로 전달
        ThreeDprinter<Plastic> print2 = new ThreeDprinter<Plastic>(); // 3d프린트의 get함수로 meterial을 꺼내 doPrinting()
        print2.setMeterial(new Plastic());
        print2.getMeterial().doPrinting();
    }

}
