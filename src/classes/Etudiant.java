package classes;

public class Etudiant extends Personne {
    private String numEtudiant;

    public Etudiant(String prenom, String nom, String numEtudiant) {
        super(prenom, nom);
        this.numEtudiant = numEtudiant;
    }

    @Override
    public String toString() {
        return "Je suis " + nom + " " + prenom + " mon numéro est : "+ numEtudiant + '\n';
    }
}
