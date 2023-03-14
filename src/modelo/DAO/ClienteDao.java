
package modelo.DAO;

import java.sql.Connection;
import conexion.Conexion;
import exceptions.loginexception;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.CRUD;
import modelo.Cliente;

/**
 *
 * @author aleja
 */
//creamos la clase ClienteDao donde implementamos los metodos CRUD definidos en la interfaz
public class ClienteDao implements CRUD{
    //sentenciamos aparte de dos metodos la conexion con nuestra base de datos
    Connection con;
    Conexion cn=new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Cliente listarID(String id){
        Cliente c=new Cliente();
        String sql = "select * from cliente where idcliente=?";
        try{
        con = cn.Conectar();
        ps=con.prepareStatement(sql);
        ps.setString(1, id);
        rs=ps.executeQuery();
        while(rs.next()){
            c.setId(rs.getInt(1));
            c.setNombre(rs.getString(2));
            c.setApellido(rs.getString(3));
            c.setEdad(rs.getInt(4));
            c.setCelular(rs.getInt(5));
            c.setCedula(rs.getInt(6));
            c.setDireccion(rs.getString(7));
        }
        }catch (loginexception | SQLException e){
        }finally
        {
            try {
                //cerramos conexcion con base de datos

                con=cn.Close_Connection();
            } catch (SQLException ex) {
                Logger.getLogger(BancoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return c;
    }

    //declararemos nuestros metodos ya sea listar, add, actualizar, eliminar
    @Override
    public List listar() {
        //listaremos nuestra clase cliente
        List<Cliente> lista =new ArrayList<>();
        //definimos nuestra sentencia cliente
        String sql="select * from cliente";
        //sentenciamos un try - catch
        try{
            //donde conectamos a la base y busquemos los datos con nuestra sentencia 
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            //declaramos un while donde en listaremos que datos hay en la tabla cliente
            while (rs.next()){
                Cliente c=new Cliente();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setEdad(rs.getInt(4));
                c.setCelular(rs.getInt(5));
                c.setCedula(rs.getInt(6));
                c.setDireccion(rs.getString(7));
                lista.add(c);
            }
        }catch(loginexception | SQLException e){
        }finally
        {
            try {
                //cerramos conexcion con base de datos

                con=cn.Close_Connection();
            } catch (SQLException ex) {
                Logger.getLogger(BancoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lista;
    }

    //declararemos nuestro metodo add
    @Override
    public int add(Object[] o) {
        //donde el resultado sera entero
        int r=0;
        //declararemos nuestra consulta sql para insertar datos en nuestra tabla cliente
        String sql="insert into cliente(idcliente,Nombre,Apellido,Edad,Celular,Cedula,Direccion)values(?,?,?,?,?,?,?)";
        //sentenciamos un try - catch
        try{
            //definiremos que la sentencia busque o ingrese los datos con nuestra sentencia sql 
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            r=ps.executeUpdate();
        }catch(loginexception | SQLException e){
        }finally
        {
            try {
                //cerramos conexcion con base de datos

                con=cn.Close_Connection();
            } catch (SQLException ex) {
                Logger.getLogger(BancoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }

    //declararemos nuestro metodo actualizar
    @Override
    public int actualizar(Object[] o) {
        int r=0;
        //sentenciamos nuestra sentencia sql para que actualize los datos dentro de nuestra tabla cliente
        String sql="update cliente set idcliente=?,Nombre=?,Apellido=?,Edad=?,Celular=?,Cedula=?,Direccion=? where idcliente=?";
        //sentenciamos un try - catch 
        try{
            //donde nos permite buscar los datos dentro de nuestra tabla
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[0]);
            r=ps.executeUpdate();
        }catch(loginexception | SQLException e){
        }finally
        {
            try {
                //cerramos conexcion con base de datos

                con=cn.Close_Connection();
            } catch (SQLException ex) {
                Logger.getLogger(BancoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return r;
    }

    //declaramos nuestro metodo eliminar 
    @Override
    public void eliminar(int id) {
        //declaramos la sentencia delete para eliminar el id con la informacion dentro de la tabla cliente
        String sql="delete from cliente where idcliente=?";
        //colocamos un try - catch
        try{
            //donde se conecte con nuestra base y busque la fila cuya cual se desea eliminar
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        }catch (loginexception | SQLException e){
        }finally
        {
            try {
                //cerramos conexcion con base de datos

                con=cn.Close_Connection();
            } catch (SQLException ex) {
                Logger.getLogger(BancoDao.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
