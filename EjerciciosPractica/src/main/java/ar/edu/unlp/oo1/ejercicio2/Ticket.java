package ar.edu.unlp.oo1.ejercicio2;

import java.time.LocalDate;

public class Ticket {
    /*
     * Attr
     */
    private LocalDate fecha;
    private int cantidadDeProductos;
    private double pesoTotal;
    private double precioTotal;
    
    /*
     * Constructor
     */

     public Ticket() {
        this.fecha = LocalDate.now();
        this.ponerEnCero();
    }
    public Ticket(int cantidadDeProductos, double pesoTotal, double precioTotal) {
		this.cantidadDeProductos = cantidadDeProductos;
		this.pesoTotal = pesoTotal;
		this.precioTotal = precioTotal;
		this.fecha = LocalDate.now();
	}

    /**
     * Setters and getters
     */

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
