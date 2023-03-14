
package modelo;

import java.util.List;
/**
 *
 * @author aleja
 */
//declaramos las variables de nuestra interfaz 
public interface CRUD {
    public List listar();
    public int add(Object[] o);
    public int actualizar(Object[] o);
    public void eliminar(int id);
}
