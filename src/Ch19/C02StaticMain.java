package Ch19;

import javax.net.ssl.SSLServerSocket;
import java.sql.SQLData;

class Rectangle{
    //기준좌표 설정
    static int x;
    static int y;
    int width;
    int height;

    //생성자 함수
    Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }

    //끝점확인 기능
    void ShowEndPoint(){
        System.out.printf("(%d,%d)\n",(x+width),(y+height));
    }
    //시작점,너비,높이,끝점확인
    void ShowInfo(){
        int endx = x + width;
        int endy = y + height;
        System.out.printf("시작 - 끝점 : (%d,%d) - (%d,%d)\n",x ,y ,endx,endy);
        System.out.println("너비,높이 : " + width + " , " + height);
        System.out.println("넓이 : " + (width * height));
        System.out.println();
    }
}

public class C02StaticMain {

    public static void main(String[] args) {
        //기준점
        Rectangle.x = 10;
        Rectangle.y = 20;

        Rectangle rec1 = new Rectangle(10, 10);
        Rectangle rec2 = new Rectangle(5, 7);
        Rectangle rec3 = new Rectangle(6, 5);

        rec1.ShowInfo();
        rec2.ShowInfo();
        rec3.ShowInfo();
    }

}
