package Ch09;

import java.io.*;
import java.util.StringTokenizer;

class Circle {
    private double x, y;
    private int radius;
    public Circle(double x, double y, int radius) {
        this.x = x;this.y = y;this.radius = radius; //x, y, radius 초기화
    }
    public void show() {
        System.out.println(x + " " + y + " " + radius);
    }
}
public class C15Test2 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Circle[] c = new Circle[3];

        StringTokenizer st;

        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            int radius = Integer.parseInt(st.nextToken());
            bw.write("("+ x + "," + y + ")" + radius + "\n");

        }
        br.close();
        bw.flush();
        bw.close();


    }

}
