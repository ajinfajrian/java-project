package uts.java.e1;
import java.sql.Connection;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Koneksi {
  Connection con;
  Statement state;
    
    public void config() {
    try{
       Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost/db_uts_java_e1", "kali", "password");
        state = con.createStatement();
//        System.out.println("Berhasil Koneksi");
      
    } catch (Exception e){
      JOptionPane.showMessageDialog(null,"Koneksi gagal " + e.getMessage());
    }
   }
   
}
















