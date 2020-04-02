package main;

import java.lang.String;

public class foaieDeParcurs extends masina {
    private int km;
    private String orasPlecare;
    private String destinatie;
    private int durata;
    private int nrFoaie;

    public foaieDeParcurs(String orasP, String destinatie, int durata, int nrFoaie,String nrIn, String carburant, String sofer ){
        super(nrIn, carburant, sofer);
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
        System.out.println("Comanda realizata de: " + getSofer());
        System.out.println("Cu masina cu nr. de inamtriculare: " + getNrInamtriculare());
        System.out.println();
        System.out.println();
    }


}
