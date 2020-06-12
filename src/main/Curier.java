package main;

import java.lang.String;
import java.util.*;

public class Curier {
    int id;
    private int nrAngajati;
    private int costTransport;
    String nume;

    public Curier(int id, String nume, int nrAngajati){
        this.id = id;
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

    public int getId() {
        return id;
    }

    public int getCostTransport() {
        return costTransport;
    }

    public String getNume() {
        return nume;
    }

    public void setCostTransport(int cost) {
        this.costTransport = cost;
    }

}
