package Ch23;

abstract class Moonbanggu{   //추상메소드 1이상포함, 자체적 객체생성X, 하위객체 연결 시 재정의한 함수접근가능

    protected static int sharpenCnt = 100; //상속관계에서 접근가능
    protected static int pencilCnt = 100;
    abstract public void write(); // 추상 메소드

    void ShowInfo(){
        System.out.println("샤프개수 : " + sharpenCnt);
        System.out.println("연필개수 : " + pencilCnt);
    }
}

class Pencil extends Moonbanggu{

    Pencil(){
        pencilCnt--;
    }
    @Override
    public void write(){
        System.out.println("연필을 씁니당");
    }
}

class Sharpen extends Moonbanggu{
    Sharpen(){
        sharpenCnt--;
    }
    @Override
    public void write(){
        System.out.println("샤프를 씁니당");
    }
}

public class MoonMain {
    public static void MoonWrite(Moonbanggu gu){
        gu.write();
        gu.ShowInfo();
    }

    public static void main(String[] args) {
        //Moonbanggu gu = new Moonbanggu(); // 객체생성 불가
//        Moonbanggu gu;
//        gu = Pencil();          하위 객체 연결
//        gu.write();             Pancil에서 재정의한 write() 사용가능
//        gu = new Sharpen();     하위 객체 연결
//        gu.write();             Sharpen에서 재정의한 write() 사용가능
//        Moonbanggu ob1 = new Pencil();
//        ob1.write();
//        Moonbanggu ob2 = new Sharpen();
//        ob2.write();

        MoonWrite(new Pencil());
        MoonWrite(new Pencil());
        MoonWrite(new Pencil());
        MoonWrite(new Sharpen());
    }

}
