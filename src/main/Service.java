package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Service {
    private static List<Colet> colete;
    private static List<Angajat> angajati;
    private static List<Curier> curieri;
    private static List<Client> clienti;
    private static List<Masina> masini;
    private static Service instance = null;

    private Service() {
        System.out.println("Service started!");
        colete = new ArrayList<>();
        angajati = new ArrayList<>();
        curieri = new ArrayList<>();
        clienti = new ArrayList<>();
        masini = new ArrayList<>();

        DatabaseService databaseService = new DatabaseService();
        databaseService.createDatabase();
        this.readCurier();
        this.readColet();
        this.readClient();
        this.readMasina();
    }

    public static Service Service() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }


    public void printColet(Colet c) {
        c.printColet();
    }

    public void printColete() {
        int exista = 0;
        for(Colet c: this.colete) {
            c.printColet();
            exista = 1;
        }
        if( exista == 0){
            System.out.println("Nu exista colete");
        }
    }

    public void addAngajat(Angajat a) {
        this.angajati.add(a);
    }



    public void removeAngajat (Angajat c) {
        this.angajati.remove(c);
    }

    public void printAngajat(Angajat a) {
        a.printAngajat();
    }

    public void printAngajati() {
        for(Angajat a: this.angajati) {
            a.printAngajat();
        }
    }

    public void readCurier(){
        Service.curieri = DatabaseService.displayCurier();
    }

    public void addCurier(Curier c) {
        Service.curieri.add(c);
        DatabaseService databaseService = new DatabaseService();
        databaseService.addCurier(c);
    }
    public void readColet(){
        Service.colete = DatabaseService.displayColet();
    }
    public void addColet(Colet c) {
        Service.colete.add(c);
        DatabaseService databaseService = new DatabaseService();
        databaseService.addColet(c);
    }
    public void readClient(){
        Service.clienti = DatabaseService.displayClient();
    }
    public void addClient(Client c) {
        Service.clienti.add(c);
        DatabaseService databaseService = new DatabaseService();
        databaseService.addClient(c);
    }
    public void readMasina(){
        Service.masini = DatabaseService.displayMasina();
    }
    public void addMasina(Masina m) {
        Service.masini.add(m);
        DatabaseService databaseService = new DatabaseService();
        databaseService.addMasina(m);
    }

    public void removeCurier(Curier c) {
        DatabaseService databaseService = new DatabaseService();
        databaseService.deleteCurier(c);
    }

    public void removeColet(Colet c) {
        DatabaseService databaseService = new DatabaseService();
        databaseService.deleteColet(c);
    }

    public void removeClient(Client c) {
        DatabaseService databaseService = new DatabaseService();
        databaseService.deleteClient(c);
    }

    public void removeMasina(Masina m) {
        DatabaseService databaseService = new DatabaseService();
        databaseService.deleteMasina(m);
    }

    public void changeCurierNrAngajati(Curier c, int angajati){
        DatabaseService databaseService = new DatabaseService();
        databaseService.updateCurierAngajati(c, angajati);

    }

    public void changeClientDataSosire(Client c, String data ){
        DatabaseService databaseService = new DatabaseService();
        databaseService.updateClientDataSosire(c, data);

    }


    public void changeMasinaKm(Masina m, int km){
        DatabaseService databaseService = new DatabaseService();
        databaseService.updateMasinaKm(m, km);

    }

}
