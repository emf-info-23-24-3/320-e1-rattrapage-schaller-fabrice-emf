package services;

import java.time.LocalDate;
import java.util.Locale;

public class ServiceFormatageDate {

   /**
     * Formate une date selon avec le style FULL de la locale par défaut. 
     * Pour la Suisse romande, le résultat sera par exemple jeudi 5 septembre 2024 
     * 
     * @param date la date de type LocalDate
     * 
     * @return la date formatée
     */
    public String formaterDate(LocalDate date) {
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
