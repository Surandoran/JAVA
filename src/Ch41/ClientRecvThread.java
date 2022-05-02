package Ch41;

import java.io.DataInputStream;
import java.net.Socket;

public class ClientRecvThread implements  Runnable{
    Socket client;
    DataInputStream Din;

    ClientRecvThread(Socket client){
        this.client = client;
    }

    @Override
    public void run() {
        try{
            Din = new DataInputStream(client.getInputStream());
            String recv; //메세지를 보낼객체
            while (true){
                recv = Din.readUTF(); // 받아낼객체
                if(recv == null || recv.equals("q")) //만약 받아낼 메세지나 q가 있다면 멈춤
                    System.out.println("프로그램을 종료합니다");
                System.exit(-1);
                System.out.println("[Server] : " + recv);
                Din.close();
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
