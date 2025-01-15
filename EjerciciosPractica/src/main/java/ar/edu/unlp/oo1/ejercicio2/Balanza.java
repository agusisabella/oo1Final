package ar.edu.unlp.oo1.ejercicio2;

public class Balanza {

    /*Atributos */
    private int cantidadDeProductos;
    private double precioTotal; 
    private double pesoTotal; 
    /*Constructores */
    public Balanza() {
        
        this.ponerEnCero();
    }

    /*Setters y getters */
    public int getCantidadDeProductos(){
        return this.cantidadDeProductos;

    }
    public double getPesoTotal(){
        return this.pesoTotal;
    }
    public double getPrecioTotal(){
        return this.precioTotal;
    }
    /*Metodos de clase */


    /*Metodos de instancia */
    public void ponerEnCero(){
        this.precioTotal = 0;
        this.pesoTotal= 0;
        this.cantidadDeProductos = 0;
    }

    public void agregarProducto(Producto prod){
        this.pesoTotal+=prod.getPeso();
        this.precioTotal+=prod.getPrecio();
        this.cantidadDeProductos++;


    }
    public Ticket emitirTicket(){
        Ticket ticket = new Ticket(this.getCantidadDeProductos(),this.getPesoTotal(),this.getPrecioTotal());
		return ticket;
    }

}
