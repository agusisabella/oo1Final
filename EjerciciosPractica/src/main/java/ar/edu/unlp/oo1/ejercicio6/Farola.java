package ar.edu.unlp.oo1.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Farola {

    // ATR
    private List<Farola> neighbors;
    private boolean on;

    public Farola(){
        this.setOn(false);
        this.neighbors = new ArrayList<Farola>();
    }
    
    /*
     * Crea la relación de vecinos entre las farolas.
     * La relación de vecinos entre las farolas es recíproca,
     * es decir el receptor del mensaje será vecino de otraFarola,
     * al igual que otraFarola también se convertirá en vecina del receptor del
     * mensaje
     */
    public void pairWithNeighbor(Farola otraFarola) {
        this.addNeighbor(otraFarola);
        otraFarola.addNeighbor(this);

    }

    protected void addNeighbor(Farola otraFarola) { // le puse protected porque no es necesario que se acceda desde una
                                                    // clase diferente que farola. VER
        this.getNeighbors().add(otraFarola);
    }

    /*
     * Retorna sus farolas vecinas
     */
    public List<Farola> getNeighbors() {
        return this.neighbors;
    }

    /*
     * Si la farola no está encendida, la enciende y propaga la acción.
     */
    public void turnOn() {
        if (!this.isOn()) {
            this.setOn(true);
            this.propagateTurnOn();
        }
  
    }

    /*
     * Si la farola no está apagada, la apaga y propaga la acción.
     */
    public void turnOff(){
        if(this.isOn()){
            this.setOn(false);
            this.propagateTurnOff();
        }
    
    }

    public boolean isOn() {
        return this.on;
    }

    private void setOn(boolean value) {
        on = value;
    }

    private void propagateTurnOn() {
        this.getNeighbors().forEach(neig -> neig.turnOn());

    }

    private void propagateTurnOff() {

        this.getNeighbors().forEach(neig -> neig.turnOff());
    }

}
