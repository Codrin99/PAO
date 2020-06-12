package main;

import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Service service = Service.Service();

        DatabaseService databaseService = new DatabaseService();
        databaseService.createDatabase();

        //Companie
        Companie IKEA = new Companie("Bucuresti, Strada lamaitei nr. 4");

        //Curier
        Curier FanCurier = new Curier(1, "FanCurier", 1);
        Curier UrgentCargus = new Curier(2, "UrgentCargus", 1);

        service.addCurier(FanCurier);
        service.addCurier(UrgentCargus);

        //Angajat
        Angajat Marius = new Angajat(1,"Marius", "FanCurier");
        if (Marius.getFirma() == FanCurier.getNume()) {
            FanCurier.addAngajat();
        }


        //Colet
        Colet cutie1 = new Colet(1, "Brasov Strada cerbului nr.4", "Bucuresti, Strada raului nr. 6", "14:50", "Urziceni", 4, 549, 24, "Mihai", 7);
        Colet cutie2 = new Colet(2, "Focsani, Strada Decebal nr.3", "Bucuresti, Strada lamaitei nr. 4", "14:30", " Buzau", 5, 863, 1, "Marius", 5);

        if (cutie1.getNumeLivrator() == Marius.getNume()) {
            Marius.addNrLivrari();
            Marius.addkmParcrusi(279);
        }

        service.addColet(cutie1);
        service.addColet(cutie2);

        //Masina
        Masina Dacia = new Masina(1, "B 05 ADT", "Diesel", "Marius");
        Masina Renault = new Masina(2, "B 04 ADT", "Diesel", "Mihai");

        service.addMasina(Dacia);
        service.addMasina(Renault);

        //Foaie de parcrus
        FoaieDeParcurs foaie = new FoaieDeParcurs("Bucuresti", "Brasov", 5, 1);

        //Client
        Client George = new Client(1, "George", "Brasov, Strada Decebal nr.3", "20.04.2020", 549);
        Client Maria = new Client(2, "Maria", "Focsani, Strada Decebal nr.3", "10.08.2020", 863);

        service.addClient(George);
        service.addClient(Maria);

        service.changeClientDataSosire(George, "18.05.2020");
        service.changeCurierNrAngajati(FanCurier, 15);
        service.changeMasinaKm(Dacia, 5000);

        service.removeClient(George);
        service.removeCurier(UrgentCargus);
    }
}