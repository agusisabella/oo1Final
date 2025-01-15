package ar.edu.unlp.oo1.ejercicio2;

public class Producto {
    private double peso;
    private double precioPorKilo;
    private String descripcion; 

    public double getPeso() {
       return this.peso;
    }

    public double getPrecio() {
        return this.precioPorKilo*this.peso; 
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setPeso(double peso) {
      this.peso = peso;
    }

    public void setPrecioPorKilo(int preciokg) {
       this.precioPorKilo=preciokg;
    }

    public void setDescripcion(String descripcion) { 
        this.descripcion=descripcion;
    }

    public double getPrecioPorKilo() {
        return this.precioPorKilo;
    }

}
