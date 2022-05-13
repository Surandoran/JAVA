package Ch30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class C06DBCONN오라클 {

    public static void main(String[] args) {

        //연결관련 정보 저장용 변수
        String id = "BOOK_EX";
        String pw = "1234";
        String url = "jdbc:oracle:thin:@localhost:1521:XE";

        //DB연결관련 객체를 참조 변수
        Connection conn = null;             // DB 연결객체
        PreparedStatement pstmt = null;     // SQL 쿼리 전송 객체
        ResultSet rs = null;                // 쿼리결과(Select) 수신용 객체

        //연결
        try {
            //DB Driver 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("Driver Loading Success!");
            //DB연결객체 생성
            conn = DriverManager.getConnection(url, id, pw);
            System.out.println("DB Connected..");
            //SQL 전송객체 생성

            pstmt = conn.prepareStatement("select * from tmp_tbl");
            rs = pstmt.executeQuery();
            while ((rs.next())){
                System.out.print(rs.getInt("col1") + "\t");
                System.out.print(rs.getInt("col2") + "\t");
                System.out.print(rs.getInt("col3") + "\n");
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