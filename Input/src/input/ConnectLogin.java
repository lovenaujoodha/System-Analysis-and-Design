/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package input;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ConnectLogin {

    public static Connection ConnectDB(){
        try{
          Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
          Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/schoolmanagement", "app", "app");
          return conn;
        }catch(Exception korona){
            JOptionPane.showMessageDialog(null, "Connection Error!!\n\nplease check: "+korona);
            return null;
        }
    }
}
