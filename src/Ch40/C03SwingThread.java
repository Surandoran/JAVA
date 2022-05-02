package Ch40;

import Ch32.C01SwingMain;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


class C01GUI extends JFrame implements ActionListener, KeyListener {
    private Image screenImage;//전체화면에 이미지를담음
    private Graphics screenGraphic;
    JButton btn1, btn2, btn3, btn4; //버튼 객체생성
    JPanel pan1;        //패널 객체생성
    JTextField txt1;    //텍스트필드 객체생성
    JTextField txt2;
    JTextArea area1;    //텍스트공간 객체생성
    JTextArea area2;
    JScrollPane scroll; //스크롤 객체생성
    JScrollPane scroll2;
    Thread th1;
    Thread th2;

    private Image background = new ImageIcon(C01SwingMain.class.getResource("../images/introBackground(Title).jpg")).getImage();

    C01GUI() {

        //스레드 추가

        setTitle("Listner적용하기");    //제목설정

        pan1 = new JPanel();
        btn1 = new JButton("시작");
        btn2 = new JButton("중지");
        btn3 = new JButton("시작");
        btn4 = new JButton("중지");

        Color col = new Color(233, 155, 55);    //Red,Green,Blue(0-255,0-255,0255)
        pan1.setBackground(col);    //기본배경 화면 색 설정

        //컴포넌트 객체 생성
        area1 = new JTextArea();
        area2 = new JTextArea();
        scroll = new JScrollPane(area1);
        scroll2 = new JScrollPane(area2);
        txt1 = new JTextField();
        txt2 = new JTextField();


        //컴포넌트 위치 지정(x좌표,y좌표,가로크기,세로크기)
        btn1.setBounds(50, 400, 80, 30);    //버튼1 위치
        btn2.setBounds(160, 400, 80, 30);   //버튼2 위치
        btn3.setBounds(300, 400, 80, 30);    //버튼1 위치
        btn4.setBounds(410, 400, 80, 30);   //버튼2 위치
        area1.setBounds(50, 50, 180, 280);     //공간1 위치
        scroll.setBounds(50, 50, 180, 280);    //스크롤위치
        scroll2.setBounds(300, 50, 190, 280);   //
        txt1.setBounds(50, 350, 180, 30);      //필드1 위치
        txt2.setBounds(300, 350, 180, 30);

        pan1.add(btn1); //버튼1 넣기
        pan1.add(btn2); //버튼2 넣기
        pan1.add(btn3);
        pan1.add(btn4);
//        pan1.add(area1);//공간1 넣기
        pan1.add(scroll);
        pan1.add(scroll2);
        pan1.add(txt1);//필드1 넣기
        pan1.add(txt2);

        btn1.addActionListener(this);   //이벤트
        btn2.addActionListener(this);   //이벤트
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        txt1.addKeyListener(this);      //이벤트
        txt2.addKeyListener(this);      //이벤트
        area1.setEditable(false);         //변경불가
        area2.setEditable(false);         //변경불가

        add(pan1);  //패널을 프레임에 넣기

        pan1.setLayout(null);
        setBounds(100, 100, 550, 500);    //화면크기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //메모리에서 지우는것
        setResizable(false);                                    //사이즈 조절불가
        setVisible(true);                                       //눈에 보이게함
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
        //스레드 시작
            C03Task1 worker1 = new C03Task1(this); //this 의 의미는 만들어지는 C01GUI객체주소

            th1 = new Thread(worker1);
            th1.start();
        }
        if (e.getSource() == btn2) {
        //스레드 중지
            try {
                th1.interrupt();    //인터럽트를 걸때 만약 슬립이 없을경우 불완전한 중지가 되기떄문에 인터럽트를 넣을경우 슬립이 필수적으로 들어감.

            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
        if (e.getSource() == btn3) {
        //스레드2 시작
            C03Task2 worker2 = new C03Task2(this);
            th2 = new Thread(worker2);
            th2.start();
        }
        if (e.getSource() == btn4) {
        //스레드2 종료
            try {
                th2.interrupt();

            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {        //키보드 클릭 이벤트
        System.out.println(e.getKeyChar());     //만약 키가 눌러 졌으면 그값을 캐릭터형으로 변환
        System.out.println(e.getKeyCode());     //만약 키가 눌러 졌으면 그 값을 아스키코드값으로 변환
        if (e.getKeyCode() == 10) // 엔터키입력
        {
            String tmp = txt1.getText();        //tmp라는 변수에 필드에 넣은 값을 저장함
            area1.append(tmp + "\n");           //공간1에 tmp필드 출력
            txt1.setText(" ");                   //글자사이 공백을줌
            String tmp2 = txt2.getText();        //tmp라는 변수에 필드에 넣은 값을 저장함
            area2.append(tmp2 + "\n");           //공간1에 tmp필드 출력
            txt2.setText(" ");                   //글자사이 공백을줌
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

public class C03SwingThread {

    public static void main(String[] args) {
        new C01GUI();
    }

}
