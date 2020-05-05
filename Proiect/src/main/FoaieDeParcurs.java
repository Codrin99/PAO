package main;

import java.lang.String;

public class FoaieDeParcurs {
    private int km;
    private String orasPlecare;
    private String destinatie;
    private int durata;
    private int nrFoaie;

    public FoaieDeParcurs(String orasP, String destinatie, int durata, int nrFoaie ){
        this.km = 0;
        this.orasPlecare = orasP;
        this.nrFoaie = nrFoaie;
        this.destinatie = destinatie;
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public String getOrasPlecare() {
        return orasPlecare;
    }

    public int getKm() {
        return km;
    }

    public int getNrFoaie() {
        return nrFoaie;
    }

    public void addKm(int km) {
        this.km += km;
    }

    public void printFoaie(){
        System.out.println("Foaia de parcurs cu numarul: " + getNrFoaie());
        System.out.println("Orasul de plecare este: " + getOrasPlecare());
        System.out.println("Destinatia: " + getDestinatie());
        System.out.println("Durata: " + getDurata());
        System.out.println("Numarul de km: " + getKm());
        System.out.println();
        System.out.println();
    }


}
