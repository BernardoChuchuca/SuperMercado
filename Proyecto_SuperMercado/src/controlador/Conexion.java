package controlador;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author RICHARD
 */
public class Conexion {
    
       public static  Connection getConnection()
            {
                try
                    {
                        Class.forName("oracle.jdbc.OracleDriver");
               
                        String myDB="jdbc:oracle:thin:@localhost:1521:XE";
                        Connection cnx = DriverManager.getConnection(myDB,"ProyeSuper","proyesuper");
                        return cnx;
                        
                    }
                catch(SQLException e)
                        {
                            System.out.println(e.getMessage());
                            System.out.println("no hubo conexion");
                             
                        }
                catch (ClassNotFoundException ex) {
                     Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("tenemos erros");
                     }

                    return null;
                    
                    
                    
                    
                    
                    
           
                
                
            }
    
}
