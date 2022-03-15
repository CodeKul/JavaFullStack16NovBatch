package jdbc;

import javax.sql.RowSet;
import java.sql.*;
import java.util.Scanner;

/**
 * mysql> delimiter //
 * mysql> create procedure getEmpCount(OUT count INT)
 *     -> begin
 *     -> select count(*) into count from emp;
 *     -> end
 *     -> //
 * call getEmpCount(@count);
 * select @count;
 *
 * select * from person where mobileNo = ?
 */
public class MySqlCallableDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java16Nov";
        String username = "root";
        String password = "Codekul@123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            CallableStatement callableStatement = con.prepareCall("{call getEmpCount(?)}");
            callableStatement.registerOutParameter(1, Types.INTEGER);
            callableStatement.executeUpdate();
            System.out.println(callableStatement.getInt(1));
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
