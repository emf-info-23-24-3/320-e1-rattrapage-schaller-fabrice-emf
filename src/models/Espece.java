package models;

public abstract class Espece implements IEspeceInfo, Comparable<Espece> {
    private String nomCommun;
    private String nomScientifique;
    private String description;

    public Espece(String nomCommun, String nomScientifique, String description) {
        this.nomCommun = nomCommun;
        this.nomScientifique = nomScientifique;
        this.description = description;
    }

    public String getNomCommun() {
        return nomCommun;
    }

    public String getNomScientifique() {
        return nomScientifique;
    }

    public String getDescription() {
        return description;
    }

}
