package main;

import java.lang.String;

public class client {
    private String adresa;
    private String dataSosireColet;
    private int sumaDeAchitat;

    public client( String adresa, String dataSosire, int suma){
        this.sumaDeAchitat = suma;
        this.dataSosireColet = dataSosire;
        this.adresa = adresa;
    }

    public int getSumaDeAchitat() {
        return sumaDeAchitat;
    }

    public String getAdresa() {
        return adresa;
    }

    public String getDataSosireColet() {
        return dataSosireColet;
    }

}
