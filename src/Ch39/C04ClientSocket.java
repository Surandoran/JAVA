package Ch39;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class C04ClientSocket {

    public static void main(String[] args) {

        try{
            Socket Client = new Socket("192.168.5.19",7777); //주고받을 상대방의 ip와 그리고 동일한 port번호
            System.out.println("서버와 연결이 완료되었습니다");
            //주고 받을객체
            DataInputStream Din = new DataInputStream(Client.getInputStream());     //시스템입력개체
            DataOutputStream Dout = new DataOutputStream(Client.getOutputStream()); //시스템출력개체
            //키보드로 주고받음
            Scanner sc = new Scanner(System.in);
            String recv = null;
            String send = null;

            //대화가 계속되게 반복문
            while (true){
                System.out.print("[Client (q:종료)] : ");

                send = sc.nextLine();
                Dout.writeUTF(send);

                if(send == null || send.equals("q"))
                    break;

                recv = Din.readUTF();

                if(recv == null || recv.equals("q"))
                    break;

                System.out.println("[Server] : " + recv);
            }
            Dout.close();
            Din.close();
            Client.close();
            System.out.println("서버와 연결을 종료합니다.");

        }catch (Exception e){
            e.printStackTrace();
        }




    }

}
