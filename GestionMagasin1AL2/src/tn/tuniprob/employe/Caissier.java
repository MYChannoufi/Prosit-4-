package tn.tuniprob.employe;


public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbrHeures, int numeroDeCaisse) {
        super(id, nom, adresse, nbrHeures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbrHeures * 5;
        if (nbrHeures > 180) {
            salaire += (nbrHeures - 180) * 5 * 0.15;
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numero de Caisse: " + numeroDeCaisse + ", Salaire: " + calculerSalaire();
    }
}
