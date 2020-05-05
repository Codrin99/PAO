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
    }

    public static Service Service() {
        if (instance == null) {
            instance = new Service();
        }
        return instance;
    }

    public static boolean verifyCurierCSV(String fileName, Curier c) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);

            String line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                String nume = fields[0];
                int nrAngajati = Integer.parseInt(fields[1]);

                if (c.getNume().equals(nume) && c.getNrAngajati() == nrAngajati)
                    return false;
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static boolean verifyColetCSV(String fileName, Colet c) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);

            String line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                String adresaPredare = fields[0];
                String adresaRidicare = fields[1];
                String ora = fields[2];
                String locatie = fields[3];
                int durata = Integer.parseInt(fields[4]);
                int pret = Integer.parseInt(fields[5]);
                int nrComanda = Integer.parseInt(fields[6]);
                String numeLivrator = fields[7];
                int greutate = Integer.parseInt(fields[8]);

                if (c.getAdresaPredare().equals(adresaPredare) && c.getAdresaRidicare().equals(adresaRidicare) && c.getOraLivrare().equals(ora) && c.getLocatieCurenta().equals(locatie) && c.getDurataLivrare() == durata && c.getPret() == pret && c.getNrComanda() == nrComanda && c.getNumeLivrator().equals(numeLivrator) && c.getGreutate() == greutate)
                    return false;
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }


    public static boolean verifyClientCSV(String fileName, Client c) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);

            String line = br.readLine();

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                String nume = fields[0];
                String adresa = fields[1];
                String dataSosire = fields[2];
                int suma = Integer.parseInt(fields[3]);

                if (c.getNume().equals(nume) && c.getAdresa().equals(adresa) && c.getDataSosireColet().equals(dataSosire) && c.getSumaDeAchitat() == suma)
                    return false;
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static boolean verifyMasinaCSV(String fileName, Masina m) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);

            String line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                String nrInmatriculare = fields[0];
                String carburant = fields[1];
                String sofer = fields[2];


                if (m.getNrInamtriculare().equals(nrInmatriculare) && m.getCarburant().equals(carburant) && m.getSofer().equals(sofer))
                    return false;
            }
            br.close();
            return true;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }



    public void removeColet(Colet c) {
        colete.remove(c);
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
        try {
            curieri = ReaderCSV.readCurierCSV("Curier.csv");
            Audit.writeAuditCSV("Read Curier from CSV read file");
        } catch (DocumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void addCurier(Curier c) throws DocumentException {
        curieri.add(c);
        if (verifyCurierCSV("Curier.csv", c)) {
            try {
                WriterCSV.writeCurierCSV("Curier.csv", c);
                Audit.writeAuditCSV("Write Curier to CSV");
            } catch (DocumentException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
    public void readColet(){
        try {
            colete = ReaderCSV.readColetCSV("Colet.csv");
            Audit.writeAuditCSV("Read Colet from CSV read file");
        } catch (DocumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public void addColet(Colet c) throws DocumentException {
        colete.add(c);
        if (verifyColetCSV("Colet.csv", c)) {
            try {
                WriterCSV.writeColetCSV("Colet.csv", c);
                Audit.writeAuditCSV("Write Colet to CSV");
            } catch (DocumentException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
    public void readClient(){
        try {
            clienti = ReaderCSV.readClientCSV("Client.csv");
            Audit.writeAuditCSV("Read Client from CSV read file");
        } catch (DocumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public void addClient(Client c) throws DocumentException {
        clienti.add(c);
        if (verifyClientCSV("Client.csv", c)) {
            try {
                WriterCSV.writeClientCSV("Client.csv", c);
                Audit.writeAuditCSV("Write Client to CSV");
            } catch (DocumentException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
    public void readMasina(){
        try {
            masini = ReaderCSV.readMasinaCSV("Masina.csv");
            Audit.writeAuditCSV("Read Masina from CSV read file");
        } catch (DocumentException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
    public void addMasina(Masina m) throws DocumentException {
        masini.add(m);
        if (verifyMasinaCSV("Masina.csv", m)) {
            try {
                WriterCSV.writeMasinaCSV("Masina.csv", m);
                Audit.writeAuditCSV("Write Masina to CSV");
            } catch (DocumentException e) {
                e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
    }
}
