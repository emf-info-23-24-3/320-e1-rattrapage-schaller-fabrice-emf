package services;

import java.time.LocalDate;
import java.util.ArrayList;

import models.Observation;

public class ServiceIndexationObservations {



    /**
     * Constructeur, initialise les attributs de la classe.
     */
    public ServiceIndexationObservations() {
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
     * Retourne très rapidement les observations en lien avec le nom commun fourni,
     * triées par ordre chronologique inverse de la date d'observation.
     * (la date la plus récente est au début de la liste)
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommun(String nomCommun) {
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
     * Retourne très rapidement les observations de la date passée en paramètre.
     * 
     * @param date la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParDate(LocalDate date) {
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
     * Retourne très rapidement les observations du nom et de la date passés en
     * paramètre,
     * 
     * @param nomCommun le nom correspondant aux observations à retourner
     * @param date      la date correspondant aux observations à retourner
     * @return la liste des observations
     */
    public ArrayList<Observation> getObservationsParNomCommunEtDate(String nomCommun, LocalDate date) {
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

}
