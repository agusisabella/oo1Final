package ar.edu.unlp.oo1.ejercicio4;

public class Circulo extends Cuerpo2D {

    private double diametro; 

    public double getDiametro(){
        return this.diametro;
    }
    public void setDiametro(double valor){
        this.diametro=valor;
    }
    public double getRadio(){
        return this.diametro/2;
    }

    public void setRadio(double valor){
        setDiametro(valor*2);
    }

    public double getPerimetro(){
        return Math.PI*this.getDiametro();
    }
    public double getArea(){
        return Math.PI*(this.getRadio())*this.getRadio();
    }

}
