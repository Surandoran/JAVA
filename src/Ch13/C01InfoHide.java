package Ch13;
//접근한정자
//public        : 모든 패키지에서 사용가능
//default(기본) : 현재 패키지에서만 사용가능
//protected     : 상속관계전제하에 하위클래스에서 사용가능
//private       : 해당 클래스 내에서만 사용가능

//Person
//이름, 나이, 성별, 취미, 연봉, 주소..

class C01Person{
    //속성
    public String name;
    private int age;
    private float weight;
    private double height;


    //생성자
    C01Person(String name,int age,float weight, double height){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Getter(private 속성을 반환함수)
    int getAge(){
        return this.age;
    }
    //Setter(private 속성에 값 변경함수)
    void setAge(int age){
        this.age = age;
    }
}

public class C01InfoHide {

    public static void main(String[] args) {
        C01Person hong = new C01Person("홍길동", 30,70.8f,177.5);
//        hong.age = 40;//접근불가
//        hong.weight = 60.8F;
        System.out.println("나이 : " + hong.getAge());
        hong.setAge(31);
        System.out.println("나이 : " + hong.getAge());

        hong.setWeight(88.5F);
        hong.setHeight(179.5);
        hong.getWeight();
        hong.getHeight();
    }

}
