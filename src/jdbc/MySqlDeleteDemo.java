package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class MySqlDeleteDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Java16Nov";
        String username = "root";
        String password = "Codekul@123";

        String QUERY = "delete from emp where id = ?;";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement ps = con.prepareStatement(QUERY);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id for deleting record");
            ps.setInt(1,sc.nextInt());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
