package services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Collections;
import java.util.Comparator;

import models.Observation;

public class ServiceIndexationObservations {

    private HashMap<String, ArrayList<Observation>> observationsParNomCommun;
    private HashMap<LocalDate, ArrayList<Observation>> observationsParDate;
    private HashMap<String, HashMap<LocalDate, ArrayList<Observation>>> observationsParNomCommunEtDate;

    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceIndexationObservations() {
        observationsParNomCommun = new HashMap<>();
        observationsParDate = new HashMap<>();
        observationsParNomCommunEtDate = new HashMap<>();
    }

    /**
     * Indexe la liste des observations afin que les observations puissent être
     * retrouvées très rapidement, ceci par nom commun, par date, et par nom commun
     * et date.
     * 
     * Cette méthode appelle la méthode indexerObservation pour toutes les
     * observations de la liste passée en paramètre.
     * 
     * @param listObservations la liste des observations à indexer
     */
    public void indexerObservations(ArrayList<Observation> listObservations) {
        for (Observation observation : listObservations) {
            indexerObservation(observation);
        }
    }

    /**
     * Indexe l'observation fournie afin que cette observation puisse être retrouvée
     * très rapidement, ceci par nom commun, par date, et par nom commun et date.
     * 
     * @param observation l'observation à indexer
     */
    public void indexerObservation(Observation observation) {
        // Pour l'indexation des observations par nom
        if (!observationsParNomCommun.containsKey(observation.getNomCommun())) {
            observationsParNomCommun.put(observation.getNomCommun(), new ArrayList<>());
        }
        observationsParNomCommun.get(observation.getNomCommun()).add(observation);

        // Le mis en ordre des observations par nom, triée par date inverse
        Collections.sort(observationsParNomCommun.get(observation.getNomCommun()), new Comparator<Observation>() {
            @Override
            public int compare(Observation ob1, Observation ob2) {
                return (ob1.getDate().compareTo(ob2.getDate()) * -1);
            }
        });

        // Pour l'indexation des observations par date
        if (!observationsParDate.containsKey(observation.getDate())) {
            observationsParDate.put(observation.getDate(), new ArrayList<>());
        }
        observationsParDate.get(observation.getDate()).add(observation);

        // Pour l'indexation des observations par nom commun et date
        if (!observationsParNomCommunEtDate.containsKey(observation.getNomCommun())) {
            observationsParNomCommunEtDate.put(observation.getNomCommun(), new HashMap<>());
        }

        if (!observationsParNomCommunEtDate.get(observation.getNomCommun()).containsKey(observation.getDate())) {
            observationsParNomCommunEtDate.get(observation.getNomCommun()).put(observation.getDate(),
                    new ArrayList<>());
        }

        observationsParNomCommunEtDate.get(observation.getNomCommun()).get(observation.getDate()).add(observation);

    }

    /**
     * Retourne très rapidement les observations en lien avec le nom commun fourni,
     * triées par ordre chronologique inverse de la date d'observation.
     * (la date la plus récente est au début de la liste)
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommun(String nomCommun) {
        return new ArrayList<>(observationsParNomCommun.get(nomCommun));
    }

    /**
     * Retourne très rapidement les observations de la date passée en paramètre.
     * 
     * @param date la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParDate(LocalDate date) {
        return new ArrayList<>(observationsParDate.get(date));
    }

    /**
     * Retourne très rapidement les observations du nom et de la date passés en
     * paramètre,
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @param date      la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommunEtDate(String nomCommun, LocalDate date) {
        return new ArrayList<>(observationsParNomCommunEtDate.get(nomCommun).get(date));
    }

}
