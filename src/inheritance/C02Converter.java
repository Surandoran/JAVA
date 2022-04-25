package inheritance;
import java.util.Scanner;


abstract class Converte {
    abstract protected double convert(double src);  //추상 메소드

    abstract protected String getSrcString(); // 추상 메소드

    abstract protected String getDestString(); // 추상 메소드

    protected double ratio; // 비율

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요>> ");
        double val = sc.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과 : " + res + getDestString() + " 입니다.");

    }

}
//Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Doller 클래스를 작성하라. main() 메소드와 실행 결과는 다음과 같다.

class Won2Dollar extends Converte {
    int dolor;

    public Won2Dollar(int dolor) {
        super();
        this.dolor = dolor;
    }

    @Override
    protected double convert(double src) {
        return src / this.dolor;
    }

    @Override
    protected String getSrcString() {
        return "원";
    }

    @Override
    protected String getDestString() {
        return "달러";
    }
}

class Km2Mile extends Converte{
    double km;

    public Km2Mile(double km){
        super();
        this.km = km;
    }

    @Override
    protected double convert(double src){
        return src / km;
    }

    @Override
    protected String getSrcString(){
        return "km";
    }

    @Override
    protected String getDestString(){
        return "mile(마일)";
    }
}
public class C02Converter{

    public static void main(String[] args) {

        Won2Dollar toDollar = new Won2Dollar(1200);

        toDollar.run();

        Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
        toMile.run();
//        Km을 mile로 바꿉니다.
//        Km을 입력하세요>> 30
//        변환 결과: 18.75mile입니다

    }


}

