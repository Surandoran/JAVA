package Ch15;
class C01Simple {
    int x;
    int y;
    int z;
    C01Simple() {
//        System.out.println("C01Simple() 호출!");
//
//        x = 0;
//        y = 0;
//        z = 0;
        this(0,0,0);
    }
    C01Simple(int x) {
        System.out.println("C03Simple(int x) 호출!");
        this.x = x;
        y = 0;
        z = 0;
    }

    C01Simple(int x, int y){
//        System.out.println("C01Simple(int x, int y) 호출!");
//        this.x = x;
//        this.y = y;
//        z = 0;
        this(x, y, 0);
    }

    C01Simple(int x,int y, int z){
        System.out.println("C01Simple(int x, int y, int z) 호출!");
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
public class C01ThisMain {
    public static void main(String[] args) {

        C01Simple ob1 = new C01Simple();
        C01Simple ob2 = new C01Simple(10);
        C01Simple ob3 = new C01Simple(10,20);
        C01Simple ob4 = new C01Simple(10,20,30);

    }
}
