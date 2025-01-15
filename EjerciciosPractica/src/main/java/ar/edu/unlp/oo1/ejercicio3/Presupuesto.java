package ar.edu.unlp.oo1.ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Presupuesto {
    //ATRIBUTOS
    private LocalDate fecha;
    private String cliente; 
    private List<Item> items;

    //CONSTRUCTORES 

    public Presupuesto(String cliente) {
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.items = new ArrayList<Item>();
    }
    //SETTERS GETTERS
    public LocalDate getFecha() {
        return this.fecha;
    }
    public String getCliente(){
        return this.cliente;
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }
    public double calcularTotal(){
        double cantidad = items.stream()
                    .mapToDouble(i->i.costo())
                    .sum();
        return cantidad;
    }
}
