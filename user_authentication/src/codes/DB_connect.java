
package codes;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DB_connect {
        public static Connection connect(){
                Connection conn = null;
                
                    try {
                            Class.forName("com.mysql.jdbc.Driver");
                            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/auth_java_login_signup", "root", "");
                    } catch (Exception e) {
                            JOptionPane.showMessageDialog(null, e);
                    }
                    
                return conn; 
        }
}
