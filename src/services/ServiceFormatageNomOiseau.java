package services;

public class ServiceFormatageNomOiseau {

    /**
     * Cette méthode formatte le nom du oiseau donné en paramétre en remplacant
     * l'espace avec un '_' (underscore) et en transformant le String en minuscule.
     * Ce travail est fait si le nom du oiseau n'est pas vide ou null et il
     * contient bien deux mots, séparé par un espace. Sinon la méthode retournera
     * "entrée incorrecte".
     * Exemple: "Mésange bleue" -> Deux mots, séparé par un espace, alors le string
     * est formatté.
     * 
     * @param nomOiseau
     * @return le string formatté ou "entrée incorrecte"
     */

    public String formatterNomOiseau(String nomOiseau) {
        String result = "entrée incorrecte";
        if (nomOiseau != null) {
            if (!nomOiseau.isEmpty() && nomOiseau.contains(" ")) {
                result = nomOiseau = nomOiseau.toLowerCase();
                result = nomOiseau.replace(' ', '_');
            }
        }

        return result;
    }

}
