package Ch25;

import java.util.Objects;

class Person{
    String name;
    String add;
    int age;

    public Person(String name, String add, int age) {
        this.name = name;
        this.add = add;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", add='" + add + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name) && add.equals(person.add);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, add, age);
    }
}

public class C06EqualsMain {

    public static void main(String[] args) {

        Person ob1 = new Person("손필욱","대구",29);
        Person ob2 = new Person("손필욱","대구",22);
        Person ob3 = new Person("이상민","울산",55);
        Person ob4 = new Person("손필욱","대구",29);
        System.out.println("ob1과 ob2의 일치 : " + ob1.equals(ob2));
        System.out.println("ob1과 ob3의 일치 : " + ob1.equals(ob3));
        System.out.println("ob2과 ob3의 일치 : " + ob2.equals(ob3));
        System.out.println("ob1과 ob4의 일치 : " + ob1.equals(ob4));
    }

}
