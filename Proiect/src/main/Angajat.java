package main;

import java.lang.String;

public class Angajat  extends User{
    private int salariu;
    private int nrLivrari;
    private int kmParcursi;
    private String firma;

    public Angajat( String nume, String firma){
        super(nume);
        this.nrLivrari = 0;
        this.kmParcursi = 0;
        this.salariu = 1500;
        this.firma = firma;
    }

    public int getKmParcursi() {
        return kmParcursi;
    }

    public String getFirma() {
        return firma;
    }

    public void calculSariu(){
        this.salariu = 1500 + 10 / 100 * kmParcursi / nrLivrari * 3;
    }

    public int getNrLivrari() {
        return nrLivrari;
    }

    public void addNrLivrari() {
        this.nrLivrari +=1 ;
    }

    public void addkmParcrusi( int km) {
        this.kmParcursi += km ;
    }

    public int getSalariu() {
        return salariu;
    }

    public void printAngajat(){
        System.out.println("Angajatul cu numele: " + getNume());
        System.out.println("Are salariul de : " + getSalariu());
        System.out.println("A facut: " + getNrLivrari() + "livrari");
        System.out.println("Si a parcurs : " + getKmParcursi() + " km in total" );
        System.out.println();
        System.out.println();
    }
}
