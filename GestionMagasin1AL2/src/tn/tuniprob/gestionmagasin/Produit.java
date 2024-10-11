package tn.tuniprob.gestionmagasin;

public class Produit {

    private   int identifiant;
    private    String marque,libelle;
    private   float prix;
    static int cmp ;

    public void setPrix(float prix)
    {
        if(prix>0)
            this.prix=prix;
        else System.out.println("le prix doit être positif");
    }

    public float getPrix()
    {
        return prix;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Produit(int id, String m, String libelle)
    {

        this.identifiant=id;
        this.marque=m;
        this.libelle=libelle;
        cmp++;
    }
    public Produit(int id,String m,String l,float p)
    {
        cmp++;
        this.identifiant=id;
        this.marque=m;
        this.libelle=l;
        this.prix=p;
    }

    public Produit(String libelle,String mar,int id)
    {
        cmp++;
        this.identifiant=id;
        this.marque=mar;
        this.libelle=libelle;
    }
    public Produit(){cmp++;}

    public void afficher(){

        System.out.println("L'identifiant :"+identifiant+" marque :"+marque+
                " libelle :"+libelle+" prix :"+prix);

    }

    public String toString(){
        return "L'identifiant :"+identifiant+" marque :"+marque+
                " libelle :"+libelle+" prix :"+prix;
    }

    public boolean compare(Produit pr) {
        boolean b;
        if ((this.identifiant == pr.identifiant) && (this.libelle==pr.libelle) && (this.prix==pr.prix))
            b=true;
        else b=false;

        return b;
    }

    public boolean compare_2(Produit pr1, Produit pr2) {
        boolean b;
        if ((pr2.identifiant == pr1.identifiant) && (pr2.libelle==pr1.libelle) && (pr2.prix==pr1.prix))
            b=true;
        else b=false;

        return b;
    }

}