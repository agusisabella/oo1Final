package ar.edu.unlp.oo1.ejercicio3bis;

import java.util.ArrayList;
import java.util.List;

public class Balanza {

    /* Atributos */
    private List<Producto> productos;

    /* Constructores */
    public Balanza() {

        this.ponerEnCero();
    }

    /* Setters y getters */
    public int getCantidadDeProductos() {
        return (int) this.productos.stream().count();

    }

    public double getPesoTotal() {
        return this.productos.stream().mapToDouble(p -> p.getPeso()).sum();
    }

    public double getPrecioTotal() {
        return this.productos.stream().mapToDouble(p -> p.getPrecio()).sum();
    }
    /* Metodos de clase */

    /* Metodos de instancia */
    public void ponerEnCero() {

        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto prod) {
        this.productos.add(prod);

    }

    public Ticket emitirTicket() {
        Ticket ticket = new Ticket(this.getCantidadDeProductos(), this.getPesoTotal(), this.getPrecioTotal(), this.productos);
        return ticket;
    }

    public List<Producto> getProductos() {
        return this.productos;
    }

}
