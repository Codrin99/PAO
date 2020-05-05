package main;

import java.lang.String;

public class Main {

    public static void main(String[] args)throws DocumentException {
        Service service = Service.Service();

        service.readClient();
        service.readColet();
        service.readCurier();
        service.readMasina();

        //Companie
        Companie IKEA = new Companie("Bucuresti, Strada lamaitei nr. 4");

        //Curier
        Curier FanCurier = new Curier("FanCurier", 2);
        service.addCurier(FanCurier);

        //Angajat
        Angajat Marius = new Angajat("Marius", "FanCurier");
        if (Marius.getFirma() == FanCurier.getNume()) {
            FanCurier.addAngajat();
        }

        //ADD angajat in service
        service.addAngajat(Marius);

        //Colet
        Colet cutie = new Colet("Brassov, Strada Decebal nr.3", "Bucuresti, Strada lamaitei nr. 4", "14:30", " Urziceni", 5, 863, 1, "Marius", 5);
        if (cutie.getNumeLivrator() == Marius.getNume()) {
            Marius.addNrLivrari();
            Marius.addkmParcrusi(279);
        }

        //Adaug coletul in service
        service.addColet(cutie);

        //Masina
        Masina Dacia = new Masina("B 05 ADT", "Diesel", "Marius");
        service.addMasina(Dacia);

        //Foaie de parcrus
        FoaieDeParcurs foaie = new FoaieDeParcurs("Bucuresti", "Brasov", 5, 1);

        //Client
        Client George = new Client( "George","Brasov, Strada Decebal nr.3", "20.04.2020", 863 );
        service.addClient(George);
        //Printing
        //foaie.printFoaie();

        //Printing from service and then remove colet
        service.printAngajat(Marius);
        service.printColete();
        service.removeColet(cutie);
        service.printColete();
    }
}