
package modelo;

/**
 *
 * @author aleja
 */
public class EntidadUsuario {
    /**Declaramos las variables de la tabla usuario de nuestra base de datos**/
    int id;
    String dni;
    String nombre;
    String apellido;
    int edad;
    int cedula;
    int celular;
    String direccion;
    String user;

    /**Insertamos un constructor vacio**/
    public EntidadUsuario() {
        
    }
    
    /**Insertamos un constructor donde inicie las variables planteadas**/
    public EntidadUsuario(int id, String dni, String nombre, String apellido, int edad, int cedula, int celular, String direccion, String user) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.user = user;
    }
    
    /**Declaramos los metodos getter and setter de nuestros datos**/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }


    
    
}
