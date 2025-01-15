package ar.edu.unlp.oo1.ejercicio3bis;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
    /*
     * NO LO TERMINÉ, PODRÍA SACAR TODOS LOS ATTR Y SOLO DEJAR LOS PRODUCTOS Y LA FECHA. HACER
     */
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;
    private List<Producto> productos;
    
    /*
     * Constructor
     */

     public Ticket() {
        this.fecha = LocalDate.now(); // LLAMAR A LOS SETTERS
        this.ponerEnCero();
    }
    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal, List<Producto> productos) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
      this.productos=productos;
		this.fecha = LocalDate.now();
	}

    /**
     * Setters and getters
     */
    public List<Producto> getProductos(){
      return this.productos;
    }
     public double getPrecioTotal() {
        return this.precioTotal;
     }
     
     public LocalDate getFecha() {
		return fecha;
	}


    public void setFecha(java.time.LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}
	
	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}
	
	public double getPesoTotal() {
		return pesoTotal;
	}
	
	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	

	

     private void ponerEnCero(){
        this.cantidadDeProductos = 0;
        this.pesoTotal=0;
        this.precioTotal=0;
     }

     
     public double impuesto(){
        return 21*this.getPrecioTotal()/100;
     }
}
