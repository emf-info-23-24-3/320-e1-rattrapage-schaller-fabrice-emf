package models;

public class EspeceDetail extends Espece {
    private StatutDeMenace statutDeMenace;
    private CriteresIdentification criteresIdentification;
    private Caracteristiques caracteristiques;
    private Population population;
    private ImageSource imageSource;

    public EspeceDetail(String nomCommun, String nomScientifique, String description, StatutDeMenace statutDeMenace,
            CriteresIdentification criteresIdentification, Caracteristiques caracteristiques, Population population,
            ImageSource imageSource) {
        super(nomCommun, nomScientifique, description);
        this.statutDeMenace = statutDeMenace;
        this.criteresIdentification = criteresIdentification;
        this.caracteristiques = caracteristiques;
        this.population = population;
        this.imageSource = imageSource;
    }

    public StatutDeMenace getStatutDeMenace() {
        return statutDeMenace;
    }

    public CriteresIdentification getCriteresIdentification() {
        return criteresIdentification;
    }

    public Caracteristiques getCaracteristiques() {
        return caracteristiques;
    }

    public Population getPopulation() {
        return population;
    }

    public ImageSource getImageSource() {
        return imageSource;
    }

    public void setImageSource(ImageSource imageSource) {
        this.imageSource = imageSource;
    }

    @Override
    public String toString() {
        return getNomCommun() + ":" + getNomScientifique();
    }

    @Override
    public int compareTo(Espece autreEspece) {
        return getNomScientifique().compareTo(autreEspece.getNomScientifique());
    }

}
