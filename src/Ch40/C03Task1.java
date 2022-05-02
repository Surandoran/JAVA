package Ch40;

public class C03Task1 implements Runnable{

    C01GUI gui;
    C03Task1(C01GUI gui){
        this.gui = gui;
    }
    @Override
    public void run() {

            while (true) {
                gui.area1.append("TASK1.........\n");
                try {
                    Thread.sleep(500); //인터럽트 발생시 예외객체생김

                } catch (Exception e) {
                    System.out.println("인터럽트걸림");
                    break;  //인터럽트가 발생하면 while을 벗어나도록 함
                }
            }
    }
}
