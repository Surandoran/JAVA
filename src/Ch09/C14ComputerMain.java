package Ch09;

class C14Computer{
    //속성
    String SN;
    String CPUSpec;
    String RAMSpec;
    String DISKSpec;

    //생성자
    C14Computer(String SN,String CPU,String RAM, String DISK){
        this.SN=SN;
        this.CPUSpec=CPU;
        this.RAMSpec=RAM;
        this.DISKSpec=DISK;

    }

    //기능
    int StartApp(String app1) {
        System.out.println(app1+"을 실행합니다");
        return 1;
    }
    int StartApp(String app1,String app2) {
        System.out.println(app1+","+app2+"을 실행합니다");
        return 2;
    }
    void ShowInfo() {
        System.out.printf("Infomation-----\n%s\n%s\n%s\n%s", SN,CPUSpec,RAMSpec,DISKSpec);
    }
}
public class C14ComputerMain {

    public static void main(String[] args) {
        C14Computer Lggram123 = new C14Computer("1-2-3-4","I7","16G","1Tb");

        Lggram123.StartApp("Chrome URL:www.naver.com");
        Lggram123.StartApp("Excel 1.xls", "NotePad");
        Lggram123.ShowInfo();

    }

}

