package Ch21.Computer;

public class Computer {

    String SN;
    String CPUSpec;
    String RAMSpec;
    String DISKSpec;

    Computer(String sn,String cpu,String ram,String disk){
        SN = sn;
        CPUSpec = cpu;
        RAMSpec = ram;
        DISKSpec = disk;
    }
    void PowerON(){
        System.out.println("전원을 켭니다");
    }
    void PowerOFF(){
        System.out.println("전원을 끕니다");
    }
    void ShowInfo(){
        System.out.println("SN = " + SN);
        System.out.println("CPU = " + CPUSpec);
        System.out.println("RAM = " + RAMSpec);
        System.out.println("DISK = " + DISKSpec);
    }

}

