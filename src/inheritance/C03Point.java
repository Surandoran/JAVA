package inheritance;

class Point {
    private int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Point() {}
    public int getX() { return x; }
    public int getY() { return y; }
    protected void move(int x, int y) { this.x =x; this.y = y;}
}

class ColorPoint extends Point{

    private String color;

    ColorPoint(){
        super();
    }

    ColorPoint(int x,int y){
        super(x,y);
    }

    ColorPoint(int x,int y,String color){
        super(x,y);
        this.color = color;
    }

    public void setXY(int x, int y) {
        move(x,y);
    }

    public void setColor(String color){
        this.color = color;
    }

    public String toString(){
        String temp = color + "색의 (" + getX() + "," + getY() + ")의 점";
        return temp;
    }
}

class Point3D extends Point {
    int z;

    Point3D(int x,int y,int z) {
        super(x,y);
        this.z = z;
    }

    public void moveUp(){
        z++;
    }

    public void moveDown(){
        z--;
    }

    public void move(int x,int y,int z){
        move(x, y);
        this.z = z;
    }

    public String toString(){
        String temp = "색의 (" + getX() + "," + getY() + "," + z + ")의 점";
        return temp;
    }
}

class PositivePoint extends Point {


    PositivePoint(int x,int y){
        super(x,y);
        if(x < 0 || y < 0){
            move(0, 0);
        }
    }
    PositivePoint(){
        super();
    }
    @Override
    public void move(int x, int y){

        if(x < 0 || y < 0){
            return;
        }
        super.move(x, y);
    }

    public String toString(){
        String temp = "색의 (" + getX() + "," + getY() + ")의 점";
        return temp;
    }
}

public class C03Point {

    public static void main(String[] args) {
        PositivePoint p = new PositivePoint();
        p.move(10, 10);
        System.out.println(p.toString() + "입니다.");
        p.move(-5, 5); // 객체 p는 음수 공간으로 이동되지 않음
        System.out.println(p.toString() + "입니다.");
        PositivePoint p2 = new PositivePoint(-10, -10);
        System.out.println(p2.toString() + "입니다.");

//        (10,10)의 점입니다.
//        (10,10)의 점입니다.
//        (0,0)의 점입니다.
//        [Hint] Point 클래스의 move()를 PositivePoint 클래스에서 오버라이딩하여 재작성하고 적절히 super.move()를
//        호출해야 한다. PositivePoint의 2 개의 생성자에서도 적절히 super() 생성자와 super.move()를 호출해야 한다.


//        Point3D p = new Point3D(1, 2, 3); // 1,2,3은 각각 x, y, z축의 값.
//        System.out.println(p.toString() + "입니다.");
//        p.moveUp(); // z 축으로 위쪽 이동
//        System.out.println(p.toString() + "입니다.");
//        p.moveDown(); // z 축으로 아래쪽 이동
//        p.move(10, 10); // x, y 축으로 이동
//        System.out.println(p.toString() + "입니다.");
//        p.move(100, 200, 300); // x, y, z축으로 이동
//        System.out.println(p.toString() + "입니다.");

//        (1,2,3) 의 점입니다.
//        (1,2,4) 의 점입니다.
//        (10,10,3) 의 점입니다.
//        (100,200,300) 의 점입니다.
//        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
//        cp.setXY(10, 20);
//        cp.setColor("RED");
//        String str = cp.toString();
//        System.out.println(str + "입니다. ");
//    }
//        ColorPoint zeroPoint = new ColorPoint(); // (0,0) 위치의 BLACK 색 점
//        zeroPoint.setXY(0,0);
//        zeroPoint.setColor("BLACK");
//        System.out.println(zeroPoint.toString() + "입니다.");
//
//        ColorPoint cp2 = new ColorPoint(10, 10); // (10,10) 위치의 BLACK 색 점
//        cp.setXY(10,10);
//        cp.setColor("RED");
//        System.out.println(cp.toString()+"입니다.");

    }
}
