package main;

import main.Curier;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriterCSV {
    public static void writeCurierCSV(String fileName, Curier curier) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedWriter bw = Files.newBufferedWriter(pathToFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            String stringToWrite = String.format("\n%s,%d",
                    curier.getNume(),
                    curier.getNrAngajati());

            bw.write(stringToWrite);
            bw.close();
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static void writeColetCSV(String fileName, Colet colet) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedWriter bw = Files.newBufferedWriter(pathToFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            String stringToWrite = String.format("\n%s,%s,%s,%s,%d,%d,%d,%s,%d",
                    colet.getAdresaPredare(),
                    colet.getAdresaRidicare(),
                    colet.getOraLivrare(),
                    colet.getLocatieCurenta(),
                    colet.getDurataLivrare(),
                    colet.getPret(),
                    colet.getNrComanda(),
                    colet.getNumeLivrator(),
                    colet.getGreutate());

            bw.write(stringToWrite);
            bw.close();
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static void writeClientCSV(String fileName, Client client) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedWriter bw = Files.newBufferedWriter(pathToFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            String stringToWrite = String.format("\n%s,%s,%s,%d",
                    client.getNume(),
                    client.getAdresa(),
                    client.getDataSosireColet(),
                    client.getSumaDeAchitat());

            bw.write(stringToWrite);
            bw.close();
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

    public static void writeMasinaCSV(String fileName, Masina masina) throws DocumentException {
        Path pathToFile = Paths.get(fileName);

        try {
            BufferedWriter bw = Files.newBufferedWriter(pathToFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            String stringToWrite = String.format("\n%s,%s,%s",
                    masina.getNrInamtriculare(),
                    masina.getCarburant(),
                    masina.getSofer());

            bw.write(stringToWrite);
            bw.close();
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }

}
