package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import models.EspeceDetail;

public class ServiceTriEspeces {

    /**
     * Trie la listeDesEspece par ordre alphabétiquer du nom commun, sans modifier
     * l'ordre de la liste passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParNomCommun(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> newList = new ArrayList<>(lstEspeceDetails);

        Collections.sort(newList, new Comparator<EspeceDetail>() {
            @Override
            public int compare(EspeceDetail especeDetail1, EspeceDetail especeDetail2) {
                return especeDetail1.getNomCommun().compareTo(especeDetail2.getNomCommun());
            }
        });
        return newList;
    }

    /**
     * Trie la listeDesEpspece par ordre alphabétiquer du nom scientifique, sans
     * modifier l'ordre de la liste
     * passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParNomScientifique(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> newList = new ArrayList<>(lstEspeceDetails);

        Collections.sort(newList, new Comparator<EspeceDetail>() {
            @Override
            public int compare(EspeceDetail especeDetail1, EspeceDetail especeDetail2) {
                return especeDetail1.getNomScientifique().compareTo(especeDetail2.getNomScientifique());
            }
        });
        return newList;
    }

    /**
     * Trie la listeDesEpspece par le nombre de ponte. Si le nombre de ponte est
     * égale entre deux espèces, trie alors par la durée de séjour au nid.
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParPonte(ArrayList<EspeceDetail> lstEspeceDetails) {
        ArrayList<EspeceDetail> newList = new ArrayList<>(lstEspeceDetails);

        Collections.sort(newList, new Comparator<EspeceDetail>() {
            @Override
            public int compare(EspeceDetail especeDetail1, EspeceDetail especeDetail2) {
                int result = especeDetail1.getCaracteristiques().getNombreDePontes()
                        .compareTo(especeDetail2.getCaracteristiques().getNombreDePontes());

                if (result == 0) {
                    result = especeDetail1.getCaracteristiques().getDureeSejourNidJours()
                            .compareTo(especeDetail2.getCaracteristiques().getDureeSejourNidJours());
                }

                return result;
            }
        });
        return newList;
    }
}
