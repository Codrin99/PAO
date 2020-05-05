package main;

import java.lang.String;

public class Client extends User{
    private String adresa;
    private String dataSosireColet;
    private int sumaDeAchitat;

    public Client(String nume, String adresa, String dataSosire, int suma){
        super(nume);
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
