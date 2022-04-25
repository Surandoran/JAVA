package Ch25;

import java.util.Objects;

class C03Simple{
    int x;
    C03Simple(int x){
        this.x = x;
    }
    @Override
    public int hashCode(){
        System.out.printf("hashCode()결과값 : %x\n ",Objects.hash(x));
        return Objects.hash(x);
    }

    @Override
    public boolean equals(Object obj){  //Object obj = ob2;
        if(obj instanceof C03Simple){
            C03Simple down = (C03Simple) obj; //downcasting
            return this.x == down.x; //기준객체(ob1).x == 비교객체(ob2).x
        }
        return false;
    }
}

public class C02equalsMain {

    public static void main(String[] args) {
        C03Simple ob1 = new C03Simple(10);
        C03Simple ob2 = new C03Simple(10);
        C03Simple ob3 = new C03Simple(30);

        System.out.println("ob1 : " + ob1);
        System.out.println("ob2 : " + ob2);
        System.out.println("ob3 : " + ob3);
        System.out.println("===================================");
        System.out.println("ob1.toString() : " + ob1.toString());
        System.out.println("ob2.toString() : " + ob2.toString());
        System.out.println("ob3.toString() : " + ob3.toString());
        System.out.println("===================================");
        System.out.println("ob1.hashCode() : " + ob1.hashCode());
        System.out.println("ob2.hashCode() : " + ob2.hashCode());
        System.out.println("ob3.hashCode() : " + ob3.hashCode());
        System.out.println("===================================");
        System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob2));
        System.out.println("ob1.equals(ob2) ? " + ob1.equals(ob3));

    }

}
