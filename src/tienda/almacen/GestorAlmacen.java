package tienda.almacen;

import java.util.concurrent.locks.ReentrantLock;

public class GestorAlmacen extends Thread {
    Producto producto;
    int cantidad;
    static ReentrantLock cerrojo;
    
    public GestorAlmacen(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        cerrojo = new ReentrantLock();
    }

    public void run(){
        cerrojo.lock();
        producto.addCantidad(cantidad);
        cerrojo.unlock();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
