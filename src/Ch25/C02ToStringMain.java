package Ch25;

class C02Simple{
    int x;
    int y;
    C02Simple(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() { //toString 으로 tmp를 재 정의함.........
        return "C02Simple{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class C02ToStringMain {

    public static void main(String[] args) {

        C02Simple tmp = new C02Simple(10,303030);
        System.out.println(tmp.toString()); //getClass() + '@' + hashCode();
                                            //toString 재정의시 -> 재정의한 x = 10, y = 303030 결과가 출력
        System.out.println(tmp);            //==tmp.toString();
        System.out.println(tmp.getClass());
        System.out.println(tmp.hashCode());
        System.out.printf("%x", tmp.hashCode());    // 16진수
    }

}
