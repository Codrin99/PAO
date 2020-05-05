package main;

import java.lang.String;
import java.util.*;

public class Curier {
    private int nrAngajati;
    private int costTransport;
    String nume;

    public Curier(String nume, int nrAngajati){
        this.costTransport = 10;
        this.nrAngajati = nrAngajati;
        this.nume = nume;
    }

    public int getNrAngajati() {
        return nrAngajati;
    }

    public void addAngajat(){
        this.nrAngajati += 1;
    }

    public String getNume() {
        return nume;
    }

    public void setCostTransport(int cost) {
        this.costTransport = cost;
    }

}
