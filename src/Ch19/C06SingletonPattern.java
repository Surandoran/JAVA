package Ch19;
class Calculator{
    int x;
    int y;

    //int Sum() //x + y를 화면에 print
    //int Sub() //x - y를 화면에 print
    //int Mul() //x * y를 화면에 print
    //int Div() //x / y를 화면에 print
    private static Calculator instance = new Calculator();
    private Calculator(){}
    public static Calculator getInstance(){
        if(instance == null){
            instance = new Calculator();
        }
        return instance;
    }
    void Sum() {
        System.out.println("X + Y = " + (x + y));
    }
    void Sub() {
        System.out.println("X - Y = " + (x - y));
    }
    void Mul() {
        System.out.println("X * Y = " + (x * y));
    }
    void Div() {
        System.out.println("X / Y = " + (x / y));
    }
}

public class C06SingletonPattern {

    public static void main(String[] args) {

        Calculator cal1 = Calculator.getInstance();
        Calculator cal2 = Calculator.getInstance();

        System.out.println(cal1 == cal2);

        cal1.x = 10;
        cal2.y = 20;
        cal1.Sum();
        cal1.Sub();
        cal2.Mul();
        cal2.Div();

    }

}
