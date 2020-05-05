package main;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;

public class Audit {
    public static void writeAuditCSV(String actionName) throws DocumentException {
        Path pathToFile = Paths.get("Logs.csv");

        try {
            BufferedWriter br = Files.newBufferedWriter(pathToFile, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
            br.write("\n" + actionName + "," + new Date());
            br.close();
        } catch (FileNotFoundException e) {
            throw new DocumentException("Fisierul Logs.csv nu a fost gasit!");
        } catch (IOException e) {
            throw new DocumentException("Eroare la citirea fisierului!", e);
        }
    }
}
