package test;

import classes.Employe;
import classes.Etudiant;
import classes.Personne;
import classes.Professeur;

public class Main {
    public static void main(String[] args) {

        Employe pascale = new Employe("Pascale", "MOTTET", 2500.0);
        Employe jos = new Employe("Jos", "DABUIL", 1200.0);

        Etudiant julie = new Etudiant("Julie", "DUPONT", "17-2344");
        Etudiant alex = new Etudiant("Alexandre", "LA BUINDA", "16-1280");

        Professeur rudy = new Professeur("Rudy", "RENARD", 5800.0, "ES6");
        Professeur pierre = new Professeur("Pierre", "CORNIL", 6500.0, "Statistiques/Mathématiques");

        System.out.println("Liste des employés :");
        System.out.print(pascale);
        System.out.println(jos);
        System.out.println("Liste des étudiants :");
        System.out.print(julie);
        System.out.println(alex);
        System.out.println("Liste des professeurs :");
        System.out.print(rudy);
        System.out.println(pierre);

    }
}