package tienda;

import tienda.almacen.GestorAlmacen;

public class Tienda {
    
    // atributos

    private String nombre;
    private GestorAlmacen[] almacenes;
    private int numAlmacenes;
    private final int MAX_ALM;
    private Vendedor[] vendedores;
    private final int MAX_VEND;

    // constructor se pasa por parametros max_alm, max_vend y nombre

    public Tienda(String nombre, int mAX_ALM, int mAX_VEND) {
        this.nombre = nombre;
        MAX_ALM = mAX_ALM;
        MAX_VEND = mAX_VEND;
    }

    // getter y setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public GestorAlmacen[] getAlmacenes() {
        return almacenes;
    }

    public void setAlmacenes(GestorAlmacen[] almacenes) {
        this.almacenes = almacenes;
    }

    public int getNumAlmacenes() {
        return numAlmacenes;
    }

    public void setNumAlmacenes(int numAlmacenes) {
        this.numAlmacenes = numAlmacenes;
    }

    public Vendedor[] getVendedores() {
        return vendedores;
    }

    public void setVendedores(Vendedor[] vendedores) {
        this.vendedores = vendedores;
    }

    
    
    
    
}
