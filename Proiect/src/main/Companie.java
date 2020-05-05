package main;

import java.lang.String;

public class Companie {
    private int numarColete;
    private String adresa;

    public Companie( String adresa){
        this.adresa = adresa;
        this.numarColete = 0;
    }

    public void addColet(){
        this.numarColete += 1;
    }

    public int getNumarColete() {
        return numarColete;
    }

    public String getAdresa() {
        return adresa;
    }

}
