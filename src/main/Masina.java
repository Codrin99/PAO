package main;

import java.lang.String;

public class Masina{
    int id;
    private String nrInamtriculare;
    private int km;
    private String carburant;
    private String sofer;

    public Masina(int id, String nrIn , String carburant, String sofer){
        this.id = id;
        this.carburant = carburant;
        this.km = 0;
        this.nrInamtriculare = nrIn;
        this.sofer = sofer;
    }

    public int getKm() {
        return km;
    }

    public int getId() {
        return id;
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
