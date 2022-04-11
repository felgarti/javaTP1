package exercice3;

import java.util.Date;

public class personne {
    String nom  ;
    String prenom ;
    String dateDeNaissance ;

    public personne(String nom, String prenom, String dateDeNaissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }
    public String toString(int n ) {
        return "\nNom n°" + n + " : "+nom+
                "\nprenom : " + prenom +
                "\ndateDeNaissace : " + dateDeNaissance
                ;
    }
}
