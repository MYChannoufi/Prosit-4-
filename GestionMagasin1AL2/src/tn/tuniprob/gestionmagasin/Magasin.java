package tn.tuniprob.gestionmagasin;

import tn.tuniprob.employe.*;



public class Magasin {

    private int identifiant;
    private String adresse;

    public final int CAPCITE = 50;

    private Produit[] tabprod = new Produit[CAPCITE];
    private int comp = 0;

    private static final int CAPACITE_EMPLOYES = 20;
    private Employe[] employes = new Employe[CAPACITE_EMPLOYES];
    private int nbEmployes = 0;

    public Magasin() {}

    public Magasin(int id, String ad) {
        identifiant = id;
        adresse = ad;
    }

    // Adding an employee to the magasin
    public void ajouterEmploye(Employe e) {
        if (nbEmployes < CAPACITE_EMPLOYES) {
            employes[nbEmployes] = e;
            nbEmployes++;
            System.out.println("Employé ajouté avec succès.");
        } else {
            System.out.println("Le magasin a atteint sa capacité maximale d'employés.");
        }
    }

    // Display the details of all employees
    public void afficherEmployes() {
        for (int i = 0; i < nbEmployes; i++) {
            System.out.println(employes[i]);
        }
    }

    // Calculate and display salaries for all employees
    public void afficherSalaires() {
        for (int i = 0; i < nbEmployes; i++) {
            System.out.println("Salaire de " + employes[i].getNom() + ": " + employes[i].calculerSalaire() + " DT");
        }
    }

    // Example of displaying responsible primes
    public void afficherPrimesResponsables() {
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i] instanceof Responsable) {
                Responsable responsable = (Responsable) employes[i];
                System.out.println("Prime de " + responsable.getNom() + ": " + responsable.getPrime() + " DT");
            }
        }
    }

    @Override
    public String toString() {
        String str = "Magasin ID: " + identifiant + ", Adresse: " + adresse + "\nProduits:\n";
        for (int i = 0; i < comp; i++) {
            str += tabprod[i] + "\n";
        }
        str += "Employés:\n";
        for (int i = 0; i < nbEmployes; i++) {
            str += employes[i] + "\n";
        }
        return str;
    }

    public void ajouter(Produit p1) {
    }
}
