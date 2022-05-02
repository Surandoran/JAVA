package Ch42;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ClientUI extends JFrame implements KeyListener{

    JTextArea area;
    JTextField txt;
    ServerSocket server;
    Socket client;

    ClientUI(){
        super("Chat Client");

        //패널
        JPanel pan = new JPanel();
        pan.setLayout(null);

        //컴포넌트
        area = new JTextArea();
        txt = new JTextField();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(10,10,260,300);
        txt.setBounds(10,320,260,30);

        //이벤트 리스너 등록
        txt.addKeyListener(this);


        //패널에 추가
        pan.add(txt);
        pan.add(scroll);
        //프레임에 추가
        add(pan);

        this.setBounds(100,100,300,400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


        //소켓연결작업
        try {

            client = new Socket("192.168.5.8",1234);

            //3 수신 스레드 객체 생	성
            ClientRecvThread recv = new ClientRecvThread(client,this);	//client : 소켓수신용
            //this(GUI객체) : 수신한 문자열을 Area로 append
            Thread th1 = new Thread(recv);
            //4 스레드 동작
            th1.start();

            area.append(client.getInetAddress() + "에서 접속했습니다.\n");





        }catch(Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        new ClientUI();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getSource()==txt) {
            if(e.getKeyCode()==10)
            {
                //입력한 내용이 클라이언트로 전달되어야한다
                try {
                    DataOutputStream Dout=new DataOutputStream(client.getOutputStream());
                    Dout.writeUTF(txt.getText());
                    Dout.flush();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
                //Send스레드에 입력한 내용을 전달
                area.append("[Client] : "+txt.getText()+"\n");
                txt.setText("");

            }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub

    }
}
