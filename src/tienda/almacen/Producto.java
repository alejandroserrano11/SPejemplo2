package tienda.almacen;

import java.util.concurrent.locks.ReentrantLock;

public class Producto {
    // atributos

    private String nombre;
    private int cantidad;
    ReentrantLock cerrojo;

    // constructor con los dos parametros

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean addCantidad(int nuevaCantidad) {
        this.cantidad = cantidad + nuevaCantidad;
        return true;
    }

    public boolean retirarCantidad() {
        
    }

}
