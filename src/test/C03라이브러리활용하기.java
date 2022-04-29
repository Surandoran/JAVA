package test;

import java.sql.*;

/*
[Database]
CREATE TEMPDB;
CREATE TABLE 'tempdb','student_tbl' ('id' VARCHAR(20) NOT NULL,'name'
VARCHAR(45) NULL, `age` INT NULL, `addr` VARCHAR(45) NULL, PRIMARY KEY(`id`));
INSERT INTO 'tempdb','student_tbl'('id','name','age','addr') VALUES('aaa','홍길동','40','대구');
INSERT INTO 'tempdb','student_tbl'('id','name','age','addr') VALUES('bbb','남길동','30','울산');
INSERT INTO 'tempdb','student_tbl'('id','name','age','addr') VALUES('ccc','김철수','35','서울');
INSERT INTO 'tempdb','student_tbl'('id','name','age','addr') VALUES('ddd','서영희','34','김해');
 */

public class C03라이브러리활용하기 {

    public static void main(String[] args) {

        //연결관련 정보
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/TEMPDB";
        String user = "root";
        String pwd = "1234";

        String sql;
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driver);
            System.out.println("Driver Loading Success");

            conn = DriverManager.getConnection(url, user, pwd);
            System.out.println("DB Connected..");

            pstmt =conn.prepareStatement("select * from student_tbl");
            rs = pstmt.executeQuery();

            while(rs.next()) {
                System.out.print(rs.getString("id") + " ");
                System.out.print(rs.getString("name") + " ");
                System.out.print(rs.getInt("age") + " ");
                System.out.println(rs.getString("addr") + " ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}