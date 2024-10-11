package tn.tuniprob.employe;


public abstract class Employe {
    protected int identifiant;
    protected String nom;
    protected String adresse;
    protected int nbrHeures;

    public Employe(int id, String nom, String adresse, int nbrHeures) {
        this.identifiant = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbrHeures = nbrHeures;
    }

    public int getIdentifiant() {
        return identifiant;
    }
    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;

    }
    public String getNom() {
        return nom;

    }
    public void setNom(String nom) {
        this.nom = nom;

    }
    public String getAdresse() {
        return adresse;

    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;

    }
    public int getNbrHeures() {
        return nbrHeures;

    }
    public void setNbrHeures(int nbrHeures) {
        this.nbrHeures = nbrHeures;

    }

    public abstract double calculerSalaire();

    public String toString() {
        return "ID: " + identifiant + ", Nom: " + nom + ", Adresse: " + adresse + ", Nbr Heures: " + nbrHeures;
    }
}
