package Ch22;

class Super1{
    int x;
    void Func(){
        System.out.println("TEST");
    }
}

class Sub1 extends Super1{

    int y;

    @Override
    void Func() {
        System.out.println("Sub Class Test");
    }

    void ShowXY(){
        System.out.printf("x = %d, y = %d\n",x,y);
    }

}


public class C04UpcastingOverridding {

    public static void main(String[] args) {
        Super1 ob1 = new Sub1();    //NoCasting
        Sub1 ob2 = new Sub1();      //NoCasting
        Sub1 ob3 = new Sub1();      //NoCasting
        //UpCasting
        Super1 ob4 = new Sub1();

        ob1.Func();
        System.out.println();
        ob2.ShowXY();
        System.out.println();
        ob2.Func();
        System.out.println();
        ob4.Func();//ob4.y = 10; ob4.ShowXY();
        System.out.println();
    }

}
