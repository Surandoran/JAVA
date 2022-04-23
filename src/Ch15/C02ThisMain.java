package Ch15;
class Person{
    String name;
    String addr;
    int age;

    public Person() {
    }
    public Person(String name, String addr) {
        this.name = name;
        this.addr = addr;
    }
    public Person(String name, String addr, int age){
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    void info(){
        System.out.println(name);
        System.out.println();
        System.out.println(addr);
        System.out.println();
        System.out.println(age);
        System.out.println("-----------------");
    }



}
public class C02ThisMain {
    public static void main(String[] args) {
//        person kim = new person();
//        person Lee = new person("이자성","서울특별시");
//        person Son = new person("손민수","대구광역시",20);
//
//        kim.info();
//        Lee.info();
//        Son.info();
    }
}
