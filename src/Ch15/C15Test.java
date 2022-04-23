package Ch15;

class person {
    String name;
    int age;
    String addr;

    public person(String name, int age, String addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }


    void info(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + addr);
    }


}
class Position{

    int x;
    int y;

    public Position(int x) {
        this.x = x;
    }

    public Position(int x,int y){
        this.x = x;
        this.y = y;
    }
    void showpos(){
        System.out.println("X : " + x + ", Y : " + y);
    }
}
class Employee{
    String nave;
    String dept;
    String role;
    int salary;

    public Employee(String nave, String dept, String role, int salary) {
        this.nave = nave;
        this.dept = dept;
        this.role = role;
        this.salary = salary;
    }
    int nave(String nave){
        System.out.println("이름 : " + nave);
        return 1;
    }
    void setRole(String setRole) {
        this.role = setRole;
    }
    void setdept(String setdept){
        this.dept = setdept;
    }
    void setSalary(int setSalary){
        this.salary = setSalary;
    }
    void showInfo(){
        System.out.println("이름 : " + nave);
        System.out.println("부서 : " + dept);
        System.out.println("직책 : " + role);
        System.out.println("급여 : " + salary);
    }



}
class TV{
    String brand;
    int age;
    String inch;


    public TV(String brand, int age, String inch){
        this.brand = brand;
        this.age = age;
        this.inch = inch;
    }
    void show(){
        System.out.println(brand + "에서 만든" + age + "년형" + inch + "인치 TV");
    }
}
class Grade{

    private int math;
    private int science;
    private int english;

    public Grade(int math, int science, int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    int average(){
        int sum = math + science + english;
        return sum /3;
    }
}
class Song{
    String title;
    String artist;
    String year;
    String country;

    public Song(String title,String artist,String year,String country ){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }
    void show(){
        System.out.println(year + country + "국적의 " + artist + "가 부른 " + title);
    }
}
class Rectangle{
    // -
    int x;
    int y;
    int width;
    int height;
    // -x, y, width, height 값을 매개변수로 받아 필드를 초기화 하는 생성자
    Rectangle(int x,int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    // - int square() : 사각형 넓이 리턴
    int square(){
        return width * height;
    }
    // - void show() : 사각형의 좌표와 넓이를 화면에 출력
    void show(){
        System.out.printf("좌표=(%d,%d), 넓이=%d\n", x, y, width * height);
    }
    // - boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면 t
    boolean contatins(Rectangle r){
        if(this.x < r.x && this.y < r.y){// 이 객체 x가 비교객체 x 작고 //이 객체의y가 비교객체 y 작아야 한다
            if((this.x+this.width)>(r.x+r.width) && (this.y+this.height)>(r.x+r.height)){
                return true;
            }

        }
        return false;
    }
    // - int square() : 사각형 넓이 리턴
    // - void show() : 사각형의 좌표와 넓이를 화면에 출력
    // - boolean contatins(Rectangle r) : 매개변수로 받은 r이 현 사각형 안에 있으면
    // - true 리턴
    // - main() 메소드의 코드와 실행 결과는 다음과 같다
}

public class C15Test {

    public static void main(String[] args) {
//        Person Jung = new Person("홍길동", 44, "대구");
//        Jung.info();
//
//        Position pos1 = new Position(10); //x좌표(int x)
//        Position pos2 = new Position(30,40); //x좌표(int x),y좌표(int y)
//        pos1.showpos();
//        pos2.showpos();
//
//        Employee emp1 = new Employee("홍길동","인사부","사원",3000);//nave,dept,role,salary
//        emp1.showInfo();
//        System.out.println();
//        emp1.setRole("대리");
//        emp1.setdept("총무부");
//        emp1.setSalary(4000);
//        emp1.showInfo();
//        //1번
//        TV myTV = new TV("LG", 2017, "32"); // LG에서 만든 2017년 32인치
//        myTV.show();
//        //2번
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 >>");
//        int math = sc.nextInt();
//        int science = sc.nextInt();
//        int english = sc.nextInt();
//        Grade me = new Grade(math, science, english);
//        System.out.println("평균은 " + me.average());
//
//        sc.close();
//        Song sg = new Song("1978년","스웨덴","ABBA","Dancing Queen");
//        sg.show();
        Rectangle r = new Rectangle(2, 2, 8, 7);
        Rectangle s = new Rectangle(5, 5, 6, 6);
        Rectangle t = new Rectangle(1, 1, 10, 10);

        r.show();
        System.out.println("s의 면적은 " + s.square());

        if(t.contatins(r)) {
            System.out.println("t는 r을 포함합니다");
        }
        if(t.contatins(s)){
            System.out.println("t는 s을 포함합니다");
        }


    }
}
