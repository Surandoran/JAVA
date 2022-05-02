package Ch41;

import java.io.*;
import java.net.*;

public class ServerChat {

    public static void main(String[] args) {

        try{
            //1
            ServerSocket server = new ServerSocket(6666);
            System.out.println("서비스 실행...!");
            //2
            Socket client = server.accept(); //서버와의 연결객체
            System.out.println(client.getInetAddress() + "에서 접속!"); //연결된 클라이언트의 ip주소
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
