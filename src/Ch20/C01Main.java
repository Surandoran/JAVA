package Ch20;
//상위클래스(수퍼클래스,부모클래스)
class Point2D{
    int x;
    int y;
    public Point2D(){
        System.out.println("Point2D 생성자 호출");
    }

    void ShowXY() {
        System.out.println("X = " + x + "Y = " + y);
    }
}
//하위클래스(서브클래스,자식클래스)
class Point3D extends Point2D {

    int z; //황장된 멤버변수
    public Point3D(){
        System.out.println("Point3D 생성자 호출");
    }
    void ShowXYZ() { //추가된 멤버변수1
        ShowXY();
        System.out.println("Z = " + z);
    }
}
public class C01Main {

    public static void main(String[] args) {
        Point3D pos1 = new Point3D();
        pos1.x = 10;//물려받은 2d멤버
        pos1.y = 20;//물려받은 2d멤버
        pos1.z = 30;//추가된 3d 멤버
//        pos1.ShowXY();
        pos1.ShowXYZ();
    }

}
