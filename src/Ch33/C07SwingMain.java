package Ch33;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Date;


class C01GUI extends JFrame  implements ActionListener, KeyListener {
    private Image screenImage;//전체화면에 이미지를담음
    private Graphics screenGraphic;
    JButton btn1; //버튼 객체생성
    JButton btn2;
    JButton btn3;
    JPanel pan1;        //패널 객체생성
    JTextField txt1;    //텍스트필드 객체생성
    JTextArea area1;    //텍스트공간 객체생성
    JScrollPane scroll; //스크롤 객체생성

    C01GUI() {
        setTitle("Listner적용하기");    //제목설정

        pan1 = new JPanel();
        btn1 = new JButton("입력");
        btn2 = new JButton("종료");
        btn3 = new JButton("저장");
        Color col = new Color(233, 155, 55);    //Red,Green,Blue(0-255,0-255,0255)
        pan1.setBackground(col);    //기본배경 화면 색 설정

        //컴포넌트 객체 생성
        area1 = new JTextArea();
        scroll = new JScrollPane(area1);
        txt1 = new JTextField();


        //컴포넌트 위치 지정(x좌표,y좌표,가로크기,세로크기)
        btn1.setBounds(20, 400, 80, 30);    //버튼1 위치
        btn2.setBounds(180, 400, 80, 30);   //버튼2 위치
        btn3.setBounds(100, 400, 80, 30);
        area1.setBounds(50, 50, 180, 280);     //공간1 위치
        scroll.setBounds(50, 50, 180, 280);    //스크롤위치
        txt1.setBounds(50, 350, 180, 30);      //필드1 위치

        pan1.add(btn1); //버튼1 넣기
        pan1.add(btn2); //버튼2 넣기
        pan1.add(btn3);
//        pan1.add(area1);//공간1 넣기
        pan1.add(scroll);
        pan1.add(txt1);//필드1 넣기

        btn1.addActionListener(this);   //이벤트
        btn2.addActionListener(this);   //이벤트
        txt1.addKeyListener(this);      //이벤트
        area1.setEditable(false);         //변경불가
        btn3.addActionListener(this);
        add(pan1);  //패널을 프레임에 넣기

        pan1.setLayout(null);
        setBounds(100, 100, 300, 500);    //화면크기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //메모리에서 지우는것
        setResizable(false);                                    //사이즈 조절불가
        setVisible(true);                                       //눈에 보이게함
    }

    @Override
    public void actionPerformed(ActionEvent e) {    //마우스 액션이벤트 클릭시 됨
        if (e.getSource() == btn1) {                  //만약 버튼1을 클릭했을때
//            System.out.println("노란색 버튼 클릭");
//            pan1.setBackground(Color.yellow);
            String tmp = txt1.getText();            //tmp라는 변수에 필드에 입력한 값을 저장한후
            area1.append(tmp + "\n");               //공간1에 되돌려줌
        }
        if (e.getSource() == btn2) {           //버튼2을 클릭했을 때
//            System.out.println("핑크색 버튼 클릭");
//            pan1.setBackground(Color.pink);
            System.exit(-1);                // 종료가됨
        }
        if (e.getSource() == btn3) {
            System.out.println("파일로 저장합니다.");
            try{
                Writer bw = new FileWriter("c:\\abcd\\Dialog.txt",true);
                Date date = new Date();
                bw.write("현재 : " + date + area1.getText());
                bw.write("\n");
                bw.flush();
                bw.close();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    String name = "손필욱";
    @Override
    public void keyPressed(KeyEvent e) {        //키보드 클릭 이벤트
//        System.out.println(e.getKeyChar());     //만약 키가 눌러 졌으면 그값을 캐릭터형으로 변환
//        System.out.println(e.getKeyCode());     //만약 키가 눌러 졌으면 그 값을 아스키코드값으로 변환
        System.out.print(name + " 님이 입력했습니다.\n");
        if (e.getKeyCode() == 10) // 엔터키입력
        {
            String tmp = txt1.getText();        //tmp라는 변수에 필드에 넣은 값을 저장함
            area1.append(tmp + "\n");           //공간1에 tmp필드 출력
            txt1.setText(" ");                   //글자사이 공백을줌
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

public class C07SwingMain {

    public static void main(String[] args) {

        new C01GUI();
    }

}