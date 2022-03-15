package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MySqlBatchQuery {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java16Nov";
        String username = "root";
        String password = "Codekul@123";
        // String QUERY = "insert into emp values(5,'abc');";
        String QUERY1 = "update emp set name = 'aditya123' where id = 1;";
        String QUERY2 = "update emp set name = 'Vaibhav123' where id = 2;";
        //String QUERY3 = "Select * from emp";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stmt = con.createStatement();
            stmt.addBatch(QUERY1);
            stmt.addBatch(QUERY2);
           // stmt.addBatch(QUERY3);
            stmt.executeBatch();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
