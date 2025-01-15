package ar.edu.unlp.oo1.ejercicio5;

import java.time.LocalDate;

public class Mamifero {

    private String id;
    private String especie;
    private LocalDate fecha_nacimiento;
    private Mamifero padre;
    private Mamifero madre;
    private String nombre;

    public Mamifero(String nombre) {

        this.nombre = nombre;
    }

    public Mamifero() {

    }

    public String getIdentificador() {
        return this.id;
    }

    public void setIdentificador(String id) {
        this.id = id;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setFechaDeNacimiento(LocalDate fechanac) {
        this.fecha_nacimiento = fechanac;
    }

    public LocalDate getFechaDeNacimiento() {
        return this.fecha_nacimiento;
    }

    public Mamifero getPadre() {
        return this.padre;
    }

    public void setPadre(Mamifero padre) {
        this.padre = padre;
    }

    public void setMadre(Mamifero madre) {
        this.madre = madre;
    }

    public Mamifero getMadre() {
        return this.madre;
    }

    public Mamifero getAbueloMaterno() {
        // HACER LA COMPROBACION XQE SINO NULL.GETPADRE = ERROR
        if (this.getMadre() != null && this.getMadre().getPadre() != null) {
            return this.getMadre().getPadre();
        }
        return null;

    }

    public Mamifero getAbuelaMaterna() {
        if (this.getMadre() != null && this.getMadre().getMadre() != null) {
            return this.getMadre().getMadre();
        }
        return null;
    }

    public Mamifero getAbueloPaterno() {
        if (this.getPadre() != null && this.getPadre().getPadre() != null) {
            return this.getPadre().getPadre();
        }
        return null;
    }

    public Mamifero getAbuelaPaterna() {
        if (this.getPadre() != null && this.getPadre().getMadre() != null) {
            return this.getPadre().getMadre();
        }
        return null;
    }

    public boolean tieneComoAncestroA(Mamifero alguien) {
        if (this.esAncestro(alguien)) {
            return true;
        } else {
            boolean rta = false;
            if (this.getMadre() != null) {
                rta = this.getMadre().tieneComoAncestroA(alguien);
            }
            if (rta == false && this.getPadre() != null) {
                rta = this.getPadre().tieneComoAncestroA(alguien);
            }
            return rta;

        }

    }

    public boolean esAncestro(Mamifero m2) {
        if (m2 != null && m2.getIdentificador()!=null) {
            return this.getIdentificador().equals(m2.getIdentificador());
        }
        return false;

    }

}
