package Ch22;

class A{
    int a;
}

class B extends A{
    int b;
}

class C extends A{
    int c;
}

class D extends B{
    int d;
}

class E extends C{
    int e;
}

class F extends D{
    int f;
}

class G extends E{
    int g;
}



public class C03InstanceOfmain {

    public static void UpDownFunc(A obj){ //A obj = new B(); 가 된다. A는 상위객체 B는 하위 //Upcasting
        //Downcasting
        if(obj instanceof B){   //instanceof : 객체 타입 확인 예약어
            B down = (B)obj;    //DownCasting B
            down.a = 10;
            down.b = 20;
            System.out.printf("a = %d, b = %d \n",down.a,down.b);
        }else if(obj instanceof C){
            C down = (C)obj;
            down.a = 11;
            down.c = 20;
            System.out.printf("a = %d, c = %d\n",down.a,down.c);
        }
    }

    public static void main(String[] args) {
        UpDownFunc(new B());
        UpDownFunc(new C());
    }

}
