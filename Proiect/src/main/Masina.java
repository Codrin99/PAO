package main;

import java.lang.String;

public class Masina{
    private String nrInamtriculare;
    private int km;
    private String carburant;
    private String sofer;

    public Masina( String nrIn , String carburant, String sofer){
        this.carburant = carburant;
        this.km = 0;
        this.nrInamtriculare = nrIn;
        this.sofer = sofer;
    }

    public int getKm() {
        return km;
    }

    public String getSofer() {
        return sofer;
    }

    public String getCarburant() {
        return carburant;
    }

    public String getNrInamtriculare() {
        return nrInamtriculare;
    }
}
