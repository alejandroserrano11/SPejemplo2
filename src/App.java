import tienda.Tienda;
import tienda.Vendedor;
import tienda.almacen.GestorAlmacen;
import tienda.almacen.Producto;

public class App {
    public static void main(String[] args) throws Exception {
        // crear 10 productos con 10 uds cada uno
        // crear 2 almacenes con los mismos productos en ambos
        // crear una tienda con esos dos almacenes
        // crear 5 vendedores en esa tienda
        // los vendedores deben vender aleatoriamente productos...
        
        Producto manzana = new Producto("manzana", 0);

        GestorAlmacen primero = new GestorAlmacen(manzana, 10);
        GestorAlmacen segundo = new GestorAlmacen(manzana, 20);
        GestorAlmacen tercero = new GestorAlmacen(manzana, 30);

        primero.start();
        segundo.start();
        tercero.start();

        primero.join();
        segundo.join();
        tercero.join();
        System.out.println("total manzanas: " + manzana.getCantidad());

    }
}
