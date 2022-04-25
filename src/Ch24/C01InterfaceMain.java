package Ch24;

interface Remocon{

    int MAXVOL = 100; // public static final
    int MINVOL = 0;   // public static final
    void on();        // 추상메소드
    void off();       // 추상메소드
    void SetVol(int num);
}

class TV implements Remocon{
    int volumn;
    @Override
    public void on() {
        System.out.println("TV를 켭니다");
    }
    @Override
    public void off(){
        System.out.println("TV를 끕니다");
    }
    @Override
    public void SetVol(int num){
        if(MAXVOL < num){
            volumn = MAXVOL;
        }else if(MINVOL < num){
            volumn = MINVOL;
        }else{
            volumn = num;
        }
    }
}

class Radio implements Remocon{
    int volumn;
    @Override
    public void on(){
        System.out.println("라디오를 켭니다");
    }
    @Override
    public void off(){
        System.out.println("라디오를 끕니다");
    }
    @Override
    public void SetVol(int num){
        if(MAXVOL < num){
            volumn = MAXVOL;
        }else if(MINVOL < num){
            volumn = MINVOL;
        }else{
            volumn = num;
        }
    }
}
public class C01InterfaceMain {

    private static void 아빠의오른팔(Remocon controller,int num){ //Remocon controller = new TV();
        controller.on();                                 //Remocon controller = new Radio();
        controller.SetVol(num);
        controller.off();
        System.out.println();
    }

    public static void main(String[] args) {
        아빠의오른팔(new TV(), 101);

        아빠의오른팔(new Radio(), 10);
    }

}
