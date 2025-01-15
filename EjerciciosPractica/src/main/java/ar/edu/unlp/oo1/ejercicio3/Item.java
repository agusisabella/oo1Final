package ar.edu.unlp.oo1.ejercicio3;

public class Item {

    //ATRIBUTOS
    private String detalle;
    private int cantidad;
    private double costoUnitario;

    //CONSTRUCTORES
    public Item(String detalle, int cantidad, double costoUnitario){
        this.detalle = detalle;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;

    }


    //SETTERS


    //GETTERS
    public double getCostoUnitario(){
        return this.costoUnitario;
    }

    //METODOS ESTATICOS

    //METODOS DE INSTANCIA
    public double costo(){
        
       //TERMINARRRRRRRRRRRRRRRRRRR
        return this.cantidad * this.costoUnitario ;
    }
    

}
