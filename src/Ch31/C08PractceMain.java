package Ch31;

import sun.applet.Main;

import javax.swing.*;
import java.awt.*;

class MainGUI extends JFrame{


    MainGUI(){
        setTitle("Chatting Server");
        JPanel jp = new JPanel();
        JFrame jf = new JFrame();
        JButton jb = new JButton("파일로저장");
        JButton jb1 = new JButton("1:1요청");
        JButton jb2 = new JButton("대화기록보기");
        JButton jb3 = new JButton("입력");
        TextArea area = new TextArea();
        JScrollPane js = new JScrollPane(area);
        TextField tf = new TextField();

        jb.setBounds(100, 130, 30,30);
        jb1.setBounds(100,220,30,30);
        jb2.setBounds(100,310,30,30);
        jb3.setBounds(100, 400, 80, 30);
        tf.setBounds(1100, 650,50,50);
        js.setBounds(100,100,300,300);

        jp.add(jb);
        jp.add(jb1);
        jp.add(jb2);
        jp.add(jb3);
        jp.add(tf);
        jp.add(js);

        add(jp);
        setBounds(100,100,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}

public class C08PractceMain {

    public static void main(String[] args) {
        new MainGUI();
    }

}
