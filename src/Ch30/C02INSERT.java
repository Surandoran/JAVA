package Ch30;

import java.sql.*;

public class C02INSERT {

    public static void main(String[] args) {

        //연결관련 정보 저장용 변수
        String id = "root";
        String pw = "1234";
        String url = "jdbc:mysql://192.168.5.50:3306/testdb";

        //DB연결관련 객체를 참조 변수
        Connection conn = null;             // DB 연결객체
        PreparedStatement pstmt = null;     // SQL 쿼리 전송 객체
        ResultSet rs = null;                // 쿼리결과(Select) 수신용 객체

        //연결
        try {
            //DB Driver 로드
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loading Success!");
            //DB연결객체 생성
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB Connected..");
            //SQL 전송객체 생성
            pstmt = conn.prepareStatement("insert into Students_Tbl values(?,?,?,?,?)");
            pstmt.setString(1, "손필욱");
            pstmt.setInt(2, 29);
            pstmt.setString(3, "대구");
            pstmt.setString(4, "붝권");
            pstmt.setString(5, "당첨");
            //SQL 전송
            int result = pstmt.executeUpdate(); //Insert,Update,Delete SQL사용시 실행하는 함수

            if (result != 0){
                System.out.println("INSERT 성공");
            }else {
                System.out.println("INSERT 실패");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                conn.close();
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }
}
