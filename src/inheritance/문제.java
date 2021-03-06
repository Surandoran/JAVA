package inheritance;
//[5장 1~2번]
//
//
//
//        다음 TV 클래스가 있다.
//
//class TV{
//    private int size;
//    public TV(int size) { this.size = size; }
//    protected int getSize() { return size; }
//}
//
//
//[1번] 다음 main() 메소드와 실행 결과를 참고하여 TV를 상속받은 ColorTV 클래스를 작성하라.
//
//
//
//public static void main(String[] args) {
//        ColorTV myTV = new ColorTV(32, 1024);
//        myTV.printProperty();
//        }
//        32인치 1024컬러
//
//
//        [2번] 다음 main() 메소드와 실행 결과를 참고하여 ColorTV를 상속받는 IPTV 클래스를 작성하라.
//
//public static void main(String[] args) {
//        IPTV iptv = new IPTV("192.1.1.2", 32, 2048); //"192.1.1.2" 주소에 32인치, 2048컬러
//        iptv.printProperty();
//        }
//        나의 IPTV는 192.1.1.2 주소의 32인치 2048컬러
//
//
//
//
//        [5장 3~4번]
//
//
//
//        다음은 단위를 변환하는 추상 클래스 Converter이다.
//
//        import java.util.Scanner;
//abstract class Converter {
//    abstract protected double convert(double src); // 추상 메소드
//    abstract protected String getSrcString(); // 추상 메소드
//    abstract protected String getDestString(); // 추상 메소드
//    protected double ratio; // 비율
//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println(getSrcString()+"을 "+getDestString()+"로 바꿉니다.");
//        System.out.print(getSrcString()+"을 입력하세요>> ");
//        double val = scanner.nextDouble();
//        double res = convert(val);
//        System.out.println("변환 결과: "+res+getDestString()+"입니다");
//        scanner.close();
//    }
//}
//
//
//[3번] Converter 클래스를 상속받아 원화를 달러로 변환하는 Won2Dollar 클래스를 작성하라. main() 메소드와 실행 결과는 다음과 같다.
//
//public static void main(String args[]) {
//        Won2Dollar toDollar = new Won2Dollar(1200); // 1달러는 1200원
//        toDollar.run();
//        }
//        원을 달러로 바꿉니다.
//        원을 입력하세요>> 24000
//        변환 결과: 20.0달러입니다
//
//
//
//
//        [4번] Converter 클래스를 상속받아 Km를 mile(마일)로 변환하는 Km2Mile 클래스를 작성하라, main() 메소드와 실행 결과는 다음과 같다.
//
//public static void main(String args[]) {
//        Km2Mile toMile = new Km2Mile(1.6); // 1마일은 1.6km
//        toMile.run();
//        }
//        Km을 mile로 바꿉니다.
//        Km을 입력하세요>> 30
//        변환 결과: 18.75mile입니다
//
//
//
//
//        [5장 5~8번]
//
//
//
//        다음은 2차원 상의 한 점을 표현하는 Point 클래스이다.
//
//class Point {
//    private int x, y;
//    public Point(int x, int y) { this.x = x; this.y = y; }
//    public int getX() { return x; }
//    public int getY() { return y; }
//    protected void move(int x, int y) { this.x =x; this.y = y; }
//}
//
//
//[5번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//        cp.setXY(10, 20);
//        cp.setColor("RED");
//        String str = cp.toString();
//        System.out.println(str+"입니다. ");
//        }
//        RED색의 (10,20)의 점입니다.
//
//
//
//
//
//        [6번] Point를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
//        System.out.println(zeroPoint.toString() + "입니다.");
//        ColorPoint cp = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
//        cp.setXY(5,5);
//        cp.setColor("RED");
//        System.out.println(cp.toString()+"입니다.");
//        }
//        BLACK색의 (0,0) 점입니다.
//        RED색의 (5,5) 점입니다.
//
//
//
//
//
//        [7번] Point를 상속받아 3차원의 점을 나타내는 Point3D 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//        Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x, y, z축의 값.
//        System.out.println(p.toString()+"입니다.");
//        p.moveUp(); // z 축으로 위쪽 이동
//        System.out.println(p.toString()+"입니다.");
//        p.moveDown(); // z 축으로 아래쪽 이동
//        p.move(10, 10); // x, y 축으로 이동
//        System.out.println(p.toString()+"입니다.");
//        p.move(100,  200, 300); // x, y, z축으로 이동
//        System.out.println(p.toString()+"입니다.");
//        }
//        (1,2,3) 의 점입니다.
//        (1,2,4) 의 점입니다.
//        (10,10,3) 의 점입니다.
//        (100,200,300) 의 점입니다.
//
//
//
//
//        [8번] Point를 상속받아 양수의 공간에서만 점을 나타내는 PositivePoint 클래스를 작성하라. 다음 main() 메소드를 포함하고 실행 결과와 같이 출력되게 하라.
//
//public static void main(String[] args) {
//        PositivePoint p = new PositivePoitn();
//        p.move(10, 10);
//        System.out.println(p.toString()+"입니다.");
//        p.move(-5,5); // 객체 p는 음수 공간으로 이동되지 않음
//        System.out.println(p.toStrgin()+"입니다.");
//        PositivePoint p2 = new PositivePoint(-10, -10);
//        System.out.println(p2.toString()+"입니다.");
//        }
//        (10,10)의 점입니다.
//        (10,10)의 점입니다.
//        (0,0)의 점입니다.
//        [Hint] Point 클래스의 move()를 PositivePoint 클래스에서 오버라이딩하여 재작성하고 적절히 super.move()를
//        호출해야 한다. PositivePoint의 2 개의 생성자에서도 적절히 super() 생성자와 super.move()를 호출해야 한다.
//
//

public class 문제 {
}
