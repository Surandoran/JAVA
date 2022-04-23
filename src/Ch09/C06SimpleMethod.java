package Ch09;

import java.util.Scanner;

class C06Simple{        //head
    int x;
    int y;

    void ShowXY(){
        System.out.println("X = " + x + ", Y = " + y);
    }
}

public class C06SimpleMethod {

    public static void AddmemberXY(C06Simple obj,int x, int y) { //참조변수, 매개변수,매개변수
        obj.x = x;
        obj.y = y;
    }
    public static  int SubMemberXY(C06Simple obj){
        //다른 지역으로부터 객체의 위치를 받아 Simple객체 멤버의 차를
        //return 해보세요
        //매개 변수가 없으므로 지정해 주어야 함.
        Scanner sc = new Scanner(System.in);
        if (obj.x > obj.y){
            return obj.x - obj.y;
        }else{
            return obj.y - obj.x;
        }
    }
    public static void main(String[] args){
        C06Simple testobj = new C06Simple();
        AddmemberXY(testobj,10,20);
        testobj.ShowXY();

        int result = SubMemberXY(testobj);
        System.out.println("두수의 차 : " + result);
    }
}
