package Ch25;

public class C07ClassExam {

    public static void main(String[] args) {

        // 방법 1
//        Class c1 = Person.class;
        // 방법 1 의 확인
//        System.out.println(c1.getName());
//        System.out.println(c1.getSimpleName());
//        System.out.println(c1.getPackage().getName());
        // 방법 2 포네임을 써주기 위해 예외처리 해주기
//        Class c2 = null;
//        try {
//            c2 = Class.forName("Ch29.Person");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
        // 방법 2 의 확인
//        System.out.println(c2.getName());
//        System.out.println(c2.getSimpleName());
//        System.out.println(c2.getPackage().getName());
        // 방법 3
        Person obj = new Person("홍길동","대구",22);
        Class c1 = obj.getClass();
        // 방법 3 의 확인
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        System.out.println(c1.getPackage().getName());

    }

}
