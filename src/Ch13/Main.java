package Ch13;

import java.util.Locale;

class Simple{

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Main {

    public static void main(String[] args) {
        Simple obj1 = new Simple();
        Simple obj2 = new Simple();

        obj1.setX(10);
        obj1.setY(20);
        obj2.setX(30);
        obj2.setY(40);
        System.out.println("obj1의 x,y" + obj1.getX() + "," + obj1.getY());
        System.out.println("obj2의 x,y" + obj2.getX() + "," + obj2.getY());




    }

}
