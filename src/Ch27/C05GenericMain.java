package Ch27;

//-> C03GenericMain 주석 처리 후 진행합니다

class Meterial	//1) 재료로 사용할 클래스의 상위클래스를 지정
{
    public String toString() {
        return "재료";}
}
class caramel extends Meterial{
    public String toString() {
        return "캬라멜";
    }
}
class onion  extends Meterial {
    public String toString() {
        return "어니언";
    }
}

class Mincho{
    public String toString() {
        return "민트초코";
    }
}

class PopCorn <T extends Meterial> //2) 제한할 재료 범위를 지정 (extends 상위클래스형)
{
    private T meterial;

    public T getMeterial() {
        return meterial;
    }

    public void setMeterial(T meterial) {
        this.meterial = meterial;
    }
    public void Fry() {
        System.out.println(meterial.toString() + " 맛 팝콘을 만듭니다");
    }
}

public class C05GenericMain {

    public static void main(String[] args) {

        //정상 재료
        PopCorn<caramel> corn1 = new PopCorn<caramel>();
        corn1.setMeterial(new caramel());
        corn1.Fry();
        //정상 재료
        PopCorn<onion> corn2 = new PopCorn<onion>();
        corn2.setMeterial(new onion());
        corn2.Fry();

        //비정상 재료
//		PopCorn<Mincho> corn3 = new PopCorn<Mincho>();
//		corn3.setMeterial(new Mincho());
//		corn3.Fry();

    }

}

