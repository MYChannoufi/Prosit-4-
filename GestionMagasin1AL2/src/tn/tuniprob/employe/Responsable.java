package tn.tuniprob.employe;


public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbrHeures, double prime) {
        super(id, nom, adresse, nbrHeures);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 10;
        if (nbrHeures > 160) {
            salaire += (nbrHeures - 160) * 10 * 0.20;
        }
        return salaire + prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime + ", Salaire: " + calculerSalaire();
    }
}
