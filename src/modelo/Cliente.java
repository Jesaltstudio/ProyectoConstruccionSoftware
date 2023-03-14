package modelo;

/**
 *
 * @author aleja
 */
public class Cliente {
    /**Declaramos las variables de la tabla cliente de nuestra base de datos**/
    int id;
    String nombre;
    String apellido;
    int edad;
    int celular;
    int cedula;
    String direccion;

    /**Insertamos un constructor vacio**/
    public Cliente() {
    }

     /**Insertamos un constructor donde inicie las variables planteadas**/
    public Cliente(int id, String nombre, String apellido, int edad, int celular, int cedula, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.celular = celular;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    /**Insertamos un constructor donde inicie las variables planteadas**/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
