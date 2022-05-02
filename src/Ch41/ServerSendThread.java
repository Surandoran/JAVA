package Ch41;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerSendThread implements Runnable {

    Socket client;
    DataOutputStream Dout;
    Scanner sc = new Scanner(System.in);

    ServerSendThread(Socket client) {
        this.client = client;
    }

    @Override
    public void run() {

        try {
            Dout = new DataOutputStream(client.getOutputStream()); //보조 스트림 연결
            String send; //보낼 객체
            while (true) {
                System.out.println("[Server] : ");
                send = sc.nextLine();
                Dout.writeUTF(send);
                if (send == null || send.equals("q"))
                    System.out.println("프로그램을 종료합니다");
                System.exit(-1);
                Dout.flush();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
