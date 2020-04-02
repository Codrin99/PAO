package main;

import java.lang.String;
import java.util.*;

public class curier {
    private int nrAngajati;
    private int costTransport;
    private String nume;

    public curier(String nume){
        this.costTransport = 10;
        this.nrAngajati = 0;
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
