package Ch21.Computer;

import Ch21.Computer.Computer;

public class NoteBook extends Computer {

    int battery;

    NoteBook(String sn, String cpu, String ram, String disk, int Battery) {
        super(sn, cpu, ram, disk);
        battery = Battery;
    }


    void Move() {
        if (battery > 0) {
            System.out.println("이동합니다");
            System.out.println("Battery가 -5 만큼 줄어들었습니다");
            battery -= 5;
            System.out.println("현재 Battery = " + battery);
        }else{
            System.out.println("정지합니다");
        }
    }
    void Showinfo(){
        System.out.println("SN = " + SN);
        System.out.println("CPU = " + CPUSpec);
        System.out.println("RAM = " + RAMSpec);
        System.out.println("DISK = " + DISKSpec);
        System.out.println("BATTERY = " + battery);
    }
}
