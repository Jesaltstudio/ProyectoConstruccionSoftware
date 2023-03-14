
package modelo.DAO;

import conexion.Conexion;
import exceptions.loginexception;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.CRUD;
import modelo.Registro;

/**
 *
 * @author aleja
 */
public class RegistroDao implements CRUD{
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    Connection con;
    Conexion cn=new Conexion();
    @Override
    public List listar() {
        
        List<Registro> lista =new ArrayList<>();
        String sql="select * from registrar";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                Registro reg=new Registro();
                reg.setId(rs.getInt(1));
                reg.setDni(rs.getString(2));
                reg.setNombre(rs.getString(3));
                reg.setApellido(rs.getString(4));
                reg.setEdad(rs.getInt(5));
                reg.setCedula(rs.getInt(6));
                reg.setCelular(rs.getInt(7));
                reg.setDireccion(rs.getString(8));
                reg.setUser(rs.getString(9));
                lista.add(reg);
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

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql="insert into registrar(idregistrar,Dni,Nombre,Apellido,Edad,Cedula,Celular,Direccion,User )values(?,?,?,?,?,?,?,?,?)";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
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

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update registrar set idUsuario=?,Dni=?,Nombre=?,Apellido=?,Edad=?,Cedula=?,Celular=?,Direccion=?,User=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            ps.setObject(8, o[7]);
            ps.setObject(9, o[8]);
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

    @Override
    public void eliminar(int id) {
        String sql="delete from registrar where idregistrar=?";
        try{
            con=cn.Conectar();
            ps=con.prepareStatement(sql);
            ps.setInt(1,id);
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
