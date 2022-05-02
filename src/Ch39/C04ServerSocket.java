package Ch39;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;



public class C04ServerSocket {

    public static void main(String[] args) {

        try{

            ServerSocket server = new ServerSocket(7777);
            System.out.println("서비스가 시작되었습니다.");

            Socket client = server.accept();        // 외부로 부터 연결객체
            System.out.println(client.getInetAddress() + " 에서 접속합니다."); //상대방의 ip주소
            //주고 받을객체
            DataInputStream Din = new DataInputStream(client.getInputStream());
            DataOutputStream Dout = new DataOutputStream(client.getOutputStream());
            //키보드로
            Scanner sc = new Scanner(System.in);
            String recv = null;
            String send = null;

            while (true){
                recv = Din.readUTF(); //키보드로부터 입력받음

                if(recv == null || recv.equals("q"))    //만약 없거나 q를 입력하면 멈춤
                    break;

                System.out.println("[Client] : " + recv);   //내가입력한값을 출력함
                System.out.print("[Server (q: 종료)] : ");    //서버로부터 받은말

                send = sc.nextLine();             //내가 키보드로 입력함
                Dout.writeUTF(send);                // 저장함

                if(send == null || send.equals("q"))
                    break;
            }
            Dout.close();
            Din.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
