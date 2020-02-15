package classes;

public class Personne {
    protected int id;
    protected String prenom;
    protected String nom;
    static int compteur = 1;

    public Personne(String prenom, String nom) {
        id = compteur++;
        this.prenom = prenom;
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Je suis " + nom + " " + prenom + " et mon ID est "+ id + '\n';
    }
}