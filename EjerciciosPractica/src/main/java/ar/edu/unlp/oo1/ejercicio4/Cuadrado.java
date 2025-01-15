package ar.edu.unlp.oo1.ejercicio4;

public class Cuadrado extends Cuerpo2D {
    private double lado;

    public void setLado(double l ){
        this.lado = l;
    }

    public double getLado(){
        return lado;
    }

    public double getPerimetro(){
        return 4*this.getLado();
    }
    public double getArea(){
        return this.getLado()* this.getLado();
    }

}
