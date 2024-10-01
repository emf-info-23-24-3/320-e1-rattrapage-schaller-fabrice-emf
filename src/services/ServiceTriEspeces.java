package services;

import java.util.ArrayList;


import models.EspeceDetail;

public class ServiceTriEspeces {

    /**
     * Trie la listeDesEpspece par ordre alphabétiquer du nom commun, sans modifier
     * l'ordre de la liste passée en paramètre
     * 
     * @param lstEspeceDetails la liste des espèces à trier.
     * 
     * @return une nouvelle liste des espèces triées
     */
    public ArrayList<EspeceDetail> getEspecesTrieesParNomCommun(ArrayList<EspeceDetail> lstEspeceDetails) {
        //
        //               )        (                 ) (           (         (
        //            ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //      (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //      )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //     ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //     __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //     \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //      \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //       \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //
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
        //
        //               )        (                 ) (           (         (
        //            ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //      (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //      )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //     ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //     __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //     \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //      \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //       \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //
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
        //
        //               )        (                 ) (           (         (
        //            ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //      (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //      )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //     ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //     __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //     \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //      \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //       \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //
}
