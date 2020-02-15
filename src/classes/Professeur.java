package classes;

public class Professeur extends Employe {
    private String specialite;

    public Professeur(String prenom, String nom, double salaire, String specialite) {
        super(prenom, nom, salaire);
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return "Je suis " + nom + " " + prenom + " mon salaire est de : "+ salaire + " € ma spécialité : " + specialite + '\n';
    }
}
