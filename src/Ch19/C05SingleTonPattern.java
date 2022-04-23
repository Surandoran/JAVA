package Ch19;
/*1. Singleton pattern(싱글톤 패턴) 이란?
1) 개념

프로그래밍을 하다보면 단 하나만 존재하는 인스턴스가 존재할 수 있다.
예를들어 회사에 대한 정보를 저장하는 클래스를 생성한다고 가정하면 회사명은 하나만 존재하면 된다.
이렇게 인스턴스가 오직 1개만 생성되야 하는 경우에 사용하는 패턴이다.
싱글턴 패턴을 구현할 때 멀티 스레딩 환경에서도 동작이 가능해야 하기 때문에 Thread-safe가 보장되어야 한다.
 */
/*2) Eager Initalzation (이른 초기화 방식)
static 키워드의 특징을 이용하여 프로그램이 시작하는 시점에서 정적 바인딩을 통해 해당 공유 인스턴스를 메모리에 올려 사용하는 방식이다.

2.1) Company.java

static 키워드로 instance 객체를 생성한 후 해당 인스턴스를 가져올 때 마다 static 메서드인 getInstance를 통해 가져오도록 설정한다.
public class Company {

	private static Company instance = new Company();
	private Company() {}
	public static Company getInstance() { //외부에서 가져오기 위해서 static으로 생성
		return instance;
	}
}

2.2) CompanyTest.java

인스턴스를 가져오고 싶을 경우 직접 호출을 통해 해당 값을 바로 가져올 수 있다.
2개의 객체를 생성하고 인스턴스를 가져올 경우 출력하면 동일한 값이 출력된다.
public class CompanyTest {
	public static void main(String[] args) {
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();

		System.out.println("company1: " + company1);
		System.out.println("company2: " + company2);
	}
}
3) Lazy initialization (늦은 초기화 방식)

이른 초기화 방식과 정반대로 클래스가 로드 되는 시점이 아닌 인스턴스가 필요한 시점에 요청할 경우 동적 바인딩을 통해 인스턴스를
 생성하는 방식이다. Thread-safe를 만족 시키기 위해서 synchronized 키워드를 사용한다.
사용 전까지 메모리를 차지하지 않는 장점이 있다.

3.1) Company.java
public class Company {
	private static Company instance;
	private Company() {}

	public static synchronized Company getInstance() { //외부에서 가져오기 위해서 static으로 생성
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
 Lazy Initialization + Double Checking Locking(DCL, Thread-safe)

위 방법은 많은 thread 들이 인스턴스를 호출할 경우 성능 저하가 발생하기 때문에 이를 개선한 방법이다.
이 방식은 인스턴스가 생성되지 않은 경우에만 동기화 블럭이 실행되게끔 구현하는 방식이다.

4.1) Company.java

volatile 키워드는 멀티스레딩 환경에서 인스턴스 초기화 하는 과정이 올바르게 진행될 수 있도록 설정해 준다.
첫번 째 if문에서 인스턴스가 생성되지 않은 경우 synchronized 블럭에 접근한 후 한번 더 존재 유무를 체크한 후 없는 경우 인스턴스를 생성한다.
이후 재 호출될 경우 인스턴스가 존재하기 때문에 synchronized 블럭에 접근하지 않아 성능 저하를 예방할 수 있다.
public class Company {
	private volatile static Company instance;
	private Company() {}

	public static Company getInstance() { //외부에서 가져오기 위해서 static으로 생성
		if(instance == null) {
			synchronized (Company.class) {
				if(instance == null) {
					instance = new Company();
				}
			}
		}
		return instance;
	}
}
 */

class C05Company{
    int x;
    int y;
    int z;

    //싱글톤 패턴 코드 시작;
    private static C05Company instance = new C05Company();
    private C05Company(){}
    public static C05Company getInstance(){
        if(instance == null)                //계속 실행하다가 인스턴스가 버려질수도 있으므로 만약 인스턴스가 없다면 인스턴스를 다시 받겠다.
            instance = new C05Company();
        return instance;
    }
    //싱글톤 패턴 코드 끝
}

public class C05SingleTonPattern {

    public static void main(String[] args) {
        C05Company com1 = C05Company.getInstance();
        C05Company com2 = C05Company.getInstance();
        System.out.println(com1 == com2);
        com1.x = 10;
        com1.y = 20;
        com1.z = 30;
        System.out.println(com2.x + "," + com2.y + "," + com2.z);
    }

}
