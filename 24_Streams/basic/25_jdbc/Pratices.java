package jdbc;
import java.sql.*;
import java.util.*;
import static java.lang.Class.forName;

public class Pratices {
   public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mystore","root","psv01/12/2003");
            Statement stm = con.createStatement();
            ResultSet rs = stm.executeQuery("select * from employees");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  " +rs.getString(2));
            con.close();
        } catch (Exception e) {
            System.out.println("The Error is : " +e );;
        }
    }
}