
package modelo;

/**
 *
 * @author aleja
 */
public class Mercaderia {
    int id;
    int valor;
    String fecha_ingreso;
    String razon_social;
    int cantidad;
    String categoria;
    String detalle;

    public Mercaderia() {
    }

    public Mercaderia(int id, int valor, String fecha_ingreso, String razon_social, int cantidad, String categoria, String detalle) {
        this.id = id;
        this.valor = valor;
        this.fecha_ingreso = fecha_ingreso;
        this.razon_social = razon_social;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.detalle = detalle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    
    
}
