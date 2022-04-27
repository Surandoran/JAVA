package Ch30;

import java.sql.*;

public class C06SAMYANG{

    public static void main(String[] args) {

        //연결관련 정보 저장용 변수
        String id = "root";
        String pw = "1234";
        String url = "jdbc:mysql://192.168.5.50:3306/samyang";

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
            pstmt = conn.prepareStatement("select * from samyang_ramen");

            //SQL 실행
            rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getString("name") + "\t" + rs.getString("produce_date") + "\t" + rs.getString("amount"));
            }
            //SQL 전송
//            int result = pstmt.executeUpdate(); //Insert,Update,Delete SQL사용시 실행하는 함수
//            if (result != 0){
//                System.out.println("Delete 성공");
//            }else {
//                System.out.println("Delete 실패");
//            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try{pstmt.close();} catch (Exception e1) {e1.printStackTrace();}
            try{conn.close();}catch (Exception e1){e1.printStackTrace();}
        }
    }
}