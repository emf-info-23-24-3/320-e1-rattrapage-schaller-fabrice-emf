package models;

import java.time.LocalDate;

public class Observation extends ObservationBase {
    private String nomCommun;
    private String lieu;

    public Observation(LocalDate date, String auteur, String notes, String nomCommun, String lieu) {
        super(date, auteur, notes);
        this.nomCommun = nomCommun;
        this.lieu = lieu;
    }

    public String getNomCommun() {
        return nomCommun;
    }

    public void setNomCommun(String nomCommun) {
        this.nomCommun = nomCommun;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @Override
    public String toString() {
        return getDate() + "/" + getNomCommun();
    }

}
