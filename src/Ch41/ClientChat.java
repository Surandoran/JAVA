package Ch41;

import java.net.Socket;

public class ClientChat {

    public static void main(String[] args) {

        try{
            Socket client = new Socket("192.168.5.17",7777);
            System.out.println("서비스 실행...!");

            //3스레드 객체 생성
            //클라이언트의 스레드를 받아야 함
            ServerRecvThread recv = new ServerRecvThread(client);
            ServerSendThread send = new ServerSendThread(client);

            Thread th1 = new Thread(recv);
            Thread th2 = new Thread(send);

            //4스레드 동작
            th1.start();
            th2.start();

        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
