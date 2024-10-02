package services;

import java.time.LocalDate;
import java.util.Locale;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

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
        Locale locale = new Locale.Builder().setLanguage("fr").setRegion("CH").build();
        return DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale).format(date);

    }
}
