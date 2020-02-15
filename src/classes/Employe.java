package classes;

public class Employe extends Personne {
    protected double salaire;

    public Employe(String prenom, String nom, double salaire) {
        super(prenom, nom);
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Je suis " + nom + " " + prenom + " mon salaire est de : "+ salaire + " €" + '\n';
    }
}
