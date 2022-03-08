package jdbc;


import java.lang.reflect.InvocationTargetException;
import java.sql.*;

/**
 * 1. import - java.sql
 * 2. Load & Register the Driver - mysql
 * 3. Get Connection - Connection Interface
 * 4. Create Statement - Statement Interface
 * 5. Execute Query - Result Set
 * 6. Get Result
 * 7. Close the connection
 */
public class MySqlDbConnection {
    public static void main(String[] args) throws SQLException {
        //MyClass myClass = new MyClass();
        //Class.forName("jdbc.MyClass").getDeclaredConstructor().newInstance();
        // register mysql driver
        String url = "jdbc:mysql://localhost:3306/Java16Nov";
        String username = "root";
        String password = "Codekul@123";
        Connection con = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username,password);
            st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp");
            while (rs.next()){
                Integer id = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println("ID: " + id + " Emp Name: "+name);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
       finally {
            st.close();
            con.close();
        }
    }
}

class MyClass{
    static {
        System.out.println("in static clock");
    }
    {
        System.out.println("in instance block");
    }
}