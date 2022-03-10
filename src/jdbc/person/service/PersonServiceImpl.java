package jdbc.person.service;

import jdbc.person.entity.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements PersonService {
    String url = "jdbc:mysql://localhost:3306/Java16Nov";
    String username = "root";
    String password = "Codekul@123";

    @Override
    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
        return con;
    }

    @Override
    public void insert(Person person) {
        try {
            String QUERY = "insert into person values(?,?,?,?,?);";
            PreparedStatement ps = getConnection().prepareStatement(QUERY);
            ps.setInt(1, person.getId());
            ps.setString(2, person.getFirstName());
            ps.setString(3, person.getLastName());
            ps.setString(4, person.getEmail());
            ps.setString(5, person.getMobile());
            int rows = ps.executeUpdate();
            System.out.println(rows + " row/s are affected");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public List<Person> display() {
        List<Person> personList = new ArrayList<>();
        try {
            Statement st = getConnection().createStatement();
            ResultSet rs = st.executeQuery("select * from person");
             while (rs.next()) {
                Person person = new Person();
                person.setId(rs.getInt(1));
                person.setFirstName(rs.getString(2));
                person.setLastName(rs.getString(3));
                person.setEmail(rs.getString(4));
                person.setMobile(rs.getString(5));
                personList.add(person);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return personList;
    }
}
