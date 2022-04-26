package Ch25;

import java.util.Objects;

class C05Simple{
    int x;
    int y;

    C05Simple(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) { //Object obj = ob2;
//        if (this == o) return true;
//        if (!(o instanceof C05Simple)) return false;
//        C05Simple c05Simple = (C05Simple) o;
//        return x == c05Simple.x && y == c05Simple.y;
        if(obj instanceof C05Simple){
            C05Simple down = (C05Simple) obj;
            return this.x == down.x && this.y == down.y;    //ob1의 x와 ob1의 값을 불러옴
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}

public class C05equalsMain {

    public static void main(String[] args) {

        C05Simple ob1 = new C05Simple(10,20);
        C05Simple ob2 = new C05Simple(10,20);
        C05Simple ob3 = new C05Simple(10,20);

        System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob2));
        System.out.println("ob1.equals(ob3) ? " + ob1.equals(ob3));
        System.out.println("ob1.equals(ob2) ? " + ob2.equals(ob3));
    }

}
