package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;

public class ReaderCSV {
    public static List readCurierCSV(String fileName) throws DocumentException {
        List<Curier> curieri = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);

            String line = br.readLine();
            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                String nume = fields[0];
                int nrAngajati = Integer.parseInt(fields[1]);

                Curier curier = new Curier(nume , nrAngajati);
                curieri.add(curier);
            }
            br.close();
            return curieri;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static List readColetCSV(String fileName) throws DocumentException {
        List<Colet> colete = new ArrayList<>();
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

                Colet colet = new Colet(adresaPredare, adresaRidicare, ora, locatie, durata, pret, nrComanda, numeLivrator, greutate);
                colete.add(colet);
            }
            br.close();
            return colete;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static List readClientCSV(String fileName) throws DocumentException {
        List<Client> clienti = new ArrayList<>();
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

                Client client = new Client(nume , adresa, dataSosire, suma);
                clienti.add(client);
            }
            br.close();
            return clienti;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }
    public static List readMasinaCSV(String fileName) throws DocumentException {
        List<Masina> masini = new ArrayList<>();
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8);

            String line = br.readLine();

            while ((line = br.readLine()) != null && !line.isEmpty()) {
                String[] fields = line.split(",");
                String nrInmatriculare = fields[0];
                String carburant = fields[1];
                String sofer = fields[2];


                Masina masina = new Masina(nrInmatriculare, carburant, sofer);
                masini.add(masina);
            }
            br.close();
            return masini;
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul " + fileName + " nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }
}

