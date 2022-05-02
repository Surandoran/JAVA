package Ch42;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.swing.*;


import java.net.*;

public class ServerUI extends JFrame implements KeyListener {

    JTextArea area;
    JTextField txt;
    ServerSocket server;
    Socket client;

    ServerUI() {
        super("Chat Server");

        //패널
        JPanel pan = new JPanel();
        pan.setLayout(null);

        //컴포넌트
        area = new JTextArea();
        txt = new JTextField();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(10, 10, 260, 300);
        txt.setBounds(10, 320, 260, 30);

        //이벤트 리스너 등록
        txt.addKeyListener(this);


        //패널에 추가
        pan.add(txt);
        pan.add(scroll);
        //프레임에 추가
        add(pan);

        this.setBounds(100, 100, 300, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        //소켓연결작업
        try {
            server = new ServerSocket(5555);
            client = server.accept();

            //3 수신 스레드 객체 생	성
            ServerRecvThread recv = new ServerRecvThread(client, this);    //client : 소켓수신용
            //this(GUI객체) : 수신한 문자열을 Area로 append
            Thread th1 = new Thread(recv);

            //4 스레드 동작
            th1.start();

            //처음접속메시지 띄우기
            area.append(client.getInetAddress() + "에서 접속했습니다.\n");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        new ServerUI();
    }


    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == 10) {

            //입력한 내용이 클라이언트로 전달되어야한다
            //Send스레드에 입력한 내용을 전달
            area.append("[Server] : " + txt.getText() + "\n");
            txt.setText("");

        }
    }



    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}

