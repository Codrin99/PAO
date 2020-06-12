package main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class DatabaseService {

    public void createDatabase() {
        String createCurierTable = "CREATE TABLE IF NOT EXISTS curier" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, name varchar(50), numar_angajati INTEGER," +
                "cost_transport INTEGER)";

        String createColetTable = "CREATE TABLE IF NOT EXISTS colete" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, greutate INTEGER, adresa_ridicare varchar(50) ," +
                "adresa_predare varchar(80), ora_livrare varchar(50), locatia_curenta varchar(50)," +
                "durata_livrare INTEGER, pret INTEGER, nr_comanda INTEGER, nume_livrator varchar(50))";

        String createClientTable = "CREATE TABLE IF NOT EXISTS client" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, name varchar(50), adresa varchar(50)," +
                " data_sosire varchar(50), suma_de_achitat INTEGER)";

        String createMasinaTable = "CREATE TABLE IF NOT EXISTS masina" +
                "(id INTEGER PRIMARY KEY AUTOINCREMENT, nr_inmatriculare varchar(50), km INTEGER," +
                " carburant varchar(50), sofer varchar(50))";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, createCurierTable);
            databaseHelper.executeSql(databaseConnection, createColetTable);
            databaseHelper.executeSql(databaseConnection, createClientTable);
            databaseHelper.executeSql(databaseConnection, createMasinaTable);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addCurier(Curier curier) {
        String insertCurierSql = String.format("INSERT INTO curier(name, numar_angajati, cost_transport) VALUES('%s', '%d', '%d' )",
                curier.getNume(), curier.getNrAngajati(), curier.getCostTransport());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, insertCurierSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addColet(Colet colet) {
        String insertCurierSql = String.format("INSERT INTO colete(greutate, adresa_ridicare, adresa_predare, ora_livrare, locatia_curenta, durata_livrare, pret, nr_comanda, nume_livrator) VALUES('%d', '%s', '%s', '%s', '%s', '%d', '%d', '%d', '%s' )",
                colet.getGreutate(), colet.getAdresaRidicare(), colet.getAdresaPredare(), colet.getOraLivrare(), colet.getLocatieCurenta(), colet.getDurataLivrare(), colet.getDurataLivrare(), colet.getPret(), colet.getNrComanda(), colet.getNumeLivrator());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, insertCurierSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addClient(Client client) {
        String insertCurierSql = String.format("INSERT INTO client(name, adresa, data_sosire, suma_de_achitat) VALUES('%s', '%s','%s', '%d' )",
                client.getNume(), client.getAdresa(), client.getDataSosireColet(), client.getSumaDeAchitat());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, insertCurierSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addMasina(Masina masina) {
        String insertCurierSql = String.format("INSERT INTO masina(nr_inmatriculare, km, carburant, sofer) VALUES('%s', '%d','%s', '%s' )",
                masina.getNrInamtriculare(), masina.getKm(), masina.getCarburant(), masina.getSofer());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, insertCurierSql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private static Curier mapToCurier(ResultSet resultSet) throws SQLException {
        return new Curier(resultSet.getInt(1), resultSet.getString(2), resultSet.getInt(3));
    }

    private static Colet mapToColet(ResultSet resultSet) throws SQLException {
        return new Colet(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6), resultSet.getInt(7), resultSet.getInt(8),  resultSet.getString(9), resultSet.getInt(10));
    }

    private static Client mapToClient(ResultSet resultSet) throws SQLException {
        return new Client(resultSet.getInt(1), resultSet.getString(2),  resultSet.getString(3),  resultSet.getString(4), resultSet.getInt(5));
    }

    private static Masina mapToMasina(ResultSet resultSet) throws SQLException {
        return new Masina(resultSet.getInt(1), resultSet.getString(2),  resultSet.getString(3),  resultSet.getString(4));
    }

    public static List<Curier> displayCurier() {
        String selectSql = "SELECT * FROM curier";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();
        List<Curier> curier = new ArrayList<>(0);
        try {
            ResultSet resultSet = databaseHelper.executeQuerySql(databaseConnection, selectSql);
            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString(1));
                System.out.println("Name:" + resultSet.getString(2));
                System.out.println("Numar angajati:" + resultSet.getInt(3));
                System.out.println("Cost transport:" + resultSet.getInt(4));
                curier.add(mapToCurier(resultSet));
            }
            return curier;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Colet> displayColet() {
        String selectSql = "SELECT * FROM colete";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();
        List<Colet> colet = new ArrayList<>(0);
        try {
            ResultSet resultSet = databaseHelper.executeQuerySql(databaseConnection, selectSql);
            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString(1));
                System.out.println("Greutate:" + resultSet.getString(2));
                System.out.println("Adresa ridicare:" + resultSet.getInt(3));
                System.out.println("Adresa predare :" + resultSet.getInt(4));
                System.out.println("Ora livrare:" + resultSet.getInt(5));
                System.out.println("Locatia curenta:" + resultSet.getInt(6));
                System.out.println("Durata livrare:" + resultSet.getInt(7));
                System.out.println("Pret:" + resultSet.getInt(8));
                System.out.println("Nr comanda :" + resultSet.getInt(9));
                System.out.println("Nume Livrator:" + resultSet.getInt(10));
                colet.add(mapToColet(resultSet));
            }
            return colet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Client> displayClient() {
        String selectSql = "SELECT * FROM client";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();
        List<Client> client = new ArrayList<>(0);
        try {
            ResultSet resultSet = databaseHelper.executeQuerySql(databaseConnection, selectSql);
            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString(1));
                System.out.println("Adresa:" + resultSet.getString(2));
                System.out.println("Data sosire:" + resultSet.getInt(3));
                System.out.println("Suma de achitat :" + resultSet.getInt(4) + " lei");
                client.add(mapToClient(resultSet));
            }
            return client;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static List<Masina> displayMasina() {
        String selectSql = "SELECT * FROM masina";

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();
        List<Masina> masina = new ArrayList<>(0);
        try {
            ResultSet resultSet = databaseHelper.executeQuerySql(databaseConnection, selectSql);
            while (resultSet.next()) {
                System.out.println("Id:" + resultSet.getString(1));
                System.out.println("Nr. de inmatriculare:" + resultSet.getString(2));
                System.out.println("Km:" + resultSet.getInt(3));
                System.out.println("Carburant:" + resultSet.getInt(4));
                System.out.println("Sofer:" + resultSet.getInt(5));
                masina.add(mapToMasina(resultSet));
            }
            return masina;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void deleteCurier(Curier c) {
        String deleteSql = "DELETE FROM curier WHERE id=" + c.getId();

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, deleteSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteColet(Colet c) {
        String deleteSql = "DELETE FROM colet WHERE id=" + c.getId();

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, deleteSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteClient(Client c) {
        String deleteSql = "DELETE FROM client WHERE id=" + c.getId();

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, deleteSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void deleteMasina(Masina m) {
        String deleteSql = "DELETE FROM masina WHERE id=" + m.getId();

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, deleteSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateCurierAngajati(Curier curier, int nr_angajati) {
        String updateSql = String.format("UPDATE curier SET numar_angajati = '%d' WHERE id=%d", nr_angajati, curier.getId());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, updateSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateClientDataSosire(Client client, String data) {
        String updateSql = String.format("UPDATE client SET data_sosire = '%s' WHERE id=%d", data, client.getId());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, updateSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void updateMasinaKm(Masina masina, int km) {
        String updateSql = String.format("UPDATE masina SET km = '%d' WHERE id=%d", km, masina.getId());

        Connection databaseConnection = DatabaseConfiguration.getDatabaseConnection();
        DatabaseHelper databaseHelper = DatabaseHelper.getDatabaseHelper();

        try {
            databaseHelper.executeSql(databaseConnection, updateSql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}