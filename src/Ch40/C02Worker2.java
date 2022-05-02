package Ch40;

public class C02Worker2 implements Runnable {

    @Override
    public void run() {
        //일꾼2
        for (int i = 0; i < 5; i++) {
            System.out.println("TASK2");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
