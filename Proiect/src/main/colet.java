package main;

import java.lang.String;

public class colet {
    private int greutate;
    private String adresaRidicare;
    private String adresaPredare;
    private String oraLivrare;
    private String locatieCurenta;
    private int durataLivrare;
    private int pret;
    private int nrComanda;
    private String numeLivrator;

    public colet(String adresaP, String adresaR, String ora, String locatie, int durata, int pret, int nrComanda, String numeLivrator){
        this.adresaPredare = adresaP;
        this.adresaRidicare = adresaR;
        this.oraLivrare = ora;
        this.locatieCurenta = locatie;
        this.durataLivrare = durata;
        this.pret = pret;
        this.nrComanda = nrComanda;
        this.numeLivrator = numeLivrator;
    }

    public int getPret() {
        return pret;
    }

    public int getNrComanda() {
        return nrComanda;
    }

    public String getAdresaRidicare() {
        return adresaRidicare;
    }

    public int getGreutate() {
        return greutate;
    }

    public String getNumeLivrator() {
        return numeLivrator;
    }

    public String getLocatieCurenta() {
        return locatieCurenta;
    }

    public String getOraLivrare() {
        return oraLivrare;
    }

    public String getAdresaPredare() {
        return adresaPredare;
    }

    public int getDurataLivrare() {
        return durataLivrare;
    }

    public void printColet(){
        System.out.println("Coletul cu numarul de comanda: " + getNrComanda());
        System.out.println("Livrat de: " + getNumeLivrator());
        System.out.println("Ridicat de la adresa: " + getAdresaRidicare());
        System.out.println("Va fi predat la adresa: " + getAdresaPredare());
        System.out.println("La ora: " + getOraLivrare());
        System.out.println("Are pretul de: " + getPret());
        System.out.println("Si greutatea de: " + getGreutate());
        System.out.println("Se afla acum in localitatea : " + getLocatieCurenta());
        System.out.println();
        System.out.println();
    }

}
