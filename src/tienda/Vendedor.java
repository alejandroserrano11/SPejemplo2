package tienda;

import tienda.almacen.Producto;

public class Vendedor {

    // atributos

    private String nombre;

    // constructor parametro de entrada nombre
    public Vendedor(String nombre) {
        this.nombre = nombre;
    }

    // getters y setters 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean venderProducto(Producto producto, int cantidad){
        return true;
    }
}
