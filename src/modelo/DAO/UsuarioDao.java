
package modelo.DAO;

import conexion.Conexion;
import exceptions.loginexception;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import modelo.EntidadUsuario;
import modelo.EntidadUsuario;

/**
 *
 * @author aleja
 */
public class UsuarioDao {
    //sentenciamos dos metodos importantes
    PreparedStatement ps;
    ResultSet rs;
    
    //establecemos la conexion con nuestra clase conexion 
    //la cual esta conectada a nuestra base de datos
    Conexion cn = new Conexion();
    Connection con;
    
    //declaramos una clase para validar el usuario 
    public EntidadUsuario ValidarUsuario(String dni, String user) throws loginexception, SQLException{
        //llamaremos a nuestra clase Entidad Usuario donde estan nuestras variables
        EntidadUsuario us=new EntidadUsuario();
        
        //Abrimos conexion con la base de datos
        
        Conexion conexion = new Conexion();
        conexion.Conectar();
        
        
        //definimos nuestra sentencia sql donde debe buscar el dni y el user registrado
        String sql="select * from usuario where Dni=? and User=?";
        //sentenciamos un try - catch
        try{
            //damos conexion a nuestra base de datos
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs=ps.executeQuery();
            //sentenciamos un while donde bsuque los datos de la tabla dentro de nuestra base de datos
             while (rs.next()){
                us.setId(rs.getInt(1));
                us.setDni(rs.getString(2));
                us.setNombre(rs.getString(3));
                us.setApellido(rs.getString(4));
                us.setEdad(rs.getInt(5));
                us.setCedula(rs.getInt(6));
                us.setCelular(rs.getInt(7));
                us.setDireccion(rs.getString(8));
                us.setUser(rs.getString(9));
             }
        }catch (loginexception | SQLException e){
            
           
        }finally
        {
            try {
                //cerramos conexcion con base de datos

                con=cn.Close_Connection();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(BancoDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        
        //cerramos la conexion con la base de datos una vez terminada la consulta
        conexion.Close_Connection();
        
        return us;
    }
}
