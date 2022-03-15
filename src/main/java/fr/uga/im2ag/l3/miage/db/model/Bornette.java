package fr.uga.im2ag.l3.miage.db.model;

public class Bornette {


    private int numeroBorn;
    private Etat etat;

    private velo Propose ;
    private boolean estPresent;

    public int getNumeroBorn() {
        return numeroBorn;
    }

    public void setNumeroBorn(int numeroBorn) {
        this.numeroBorn = numeroBorn;
    }

    public Etat getEtat() {
        return etat;
    }

    public void setEtat(Etat etat) {
        this.etat = etat;
    }

    public velo getPropose() {
        return Propose;
    }

    public void setPropose(velo propose) {
        Propose = propose;
    }
}
