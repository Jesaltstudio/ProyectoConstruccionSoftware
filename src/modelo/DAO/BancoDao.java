
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
import modelo.Banco;
import modelo.CRUD;
/**
 *
 * @author aleja
 */
public class BancoDao implements CRUD{
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    //Metodo para enlistar todos los bancos registrados en la base de datos
    
    @Override
    public List listar() {
        List<Banco>lista = new ArrayList<>();
        String sql = "select * from entidad_bancaria";
        try{
            //abrimos conexion con la base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Banco ban = new Banco();
                ban.setId(rs.getInt(1));
                ban.setNombre(rs.getString(2));
                ban.setRazon_social(rs.getString(3));
                ban.setCuenta(rs.getInt(4));
                ban.setFecha_ingreso(rs.getString(5));
                ban.setRuc(rs.getInt(6));
                lista.add(ban);
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

    
    //metodo para agregar banco a nuestra base de datos
    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "insert into entidad_bancaria(identidad_bancaria,Nombre,Razon_Social,Cuenta,Fecha_Ingreso,RUC)values(?,?,?,?,?,?)";
        try
        {
            //abrimos conexion a nuestra base de datos
            
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r = ps.executeUpdate();
        }catch(loginexception | SQLException e)
        {
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

    
    //metodo para actualizar datos de entidad bancaria con el objeto traido de ingresarbanco
    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        
        //sentencia de modificacion de datos de nuestra base de datos
        String sql = "update entidad_bancaria set identidad_bancaria=?, Nombre=?,Razon_Social=?,Cuenta=?,Fecha_Ingreso=?,RUC=? where identidad_bancaria=?";
        try{
            //abrimos conexion con base de datos
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);  
            ps.setObject(7, o[0]);
            r = ps.executeUpdate();
        }catch(loginexception | SQLException e)
        {
            
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
    public void eliminar(int id) 
    {
        String sql = "delete from entidad_bancaria where identidad_bancaria=?";
        try{
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        }catch(loginexception | SQLException e)
        {
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
