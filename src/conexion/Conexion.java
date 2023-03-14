
package conexion;

import exceptions.loginexception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author aleja
 */
public class Conexion {
    //establecemos los parametros de conexion con nuestra base de datos en mysql
    Connection con;
    String url="jdbc:mysql://localhost:3306/puntoventabd";
    String user="root";
    String pass="";
    
    //declaramos una clase conexion donde nos permitira conectar con nuestra base
    public Connection Conectar() throws loginexception
    {
        //definimos un try - catch
        try{
            //donde el usuario y dni registrado en nuestra tabla usuario nos permita entrar al sistema.
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, pass);
        }catch(Exception e){
            throw new loginexception("Error de conexion con base de datos");
        }
        return con;
    }
    
    
    //metodo para cerrar la conexion con la base de datos mientras no este en uso para el ahorro de recursos
    public Connection Close_Connection  () throws SQLException
    {
        //verificamos si la conexion esta cerrada, en caso de no estarlo se ejecuta la condicional
        //en la que se procede a cerrar la conexion
            if(!(con.isClosed()))
            {
                con.close();
                return con;
            }
                 
        return con;
    }
}
