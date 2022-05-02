package Ch41;

import java.io.*;
import java.net.*;

public class ServerRecvThread implements Runnable{

    Socket client;
    DataInputStream Din;

    ServerRecvThread(Socket client){
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
                System.out.println("[Client] : " + recv);
            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
