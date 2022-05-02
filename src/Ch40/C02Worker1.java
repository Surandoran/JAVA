package Ch40;

public class C02Worker1 implements Runnable {


    @Override
    public void run() {
        //일꾼1
        for (int i = 0; i < 5; i++) {
            System.out.println("TASK1");
            try{
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
