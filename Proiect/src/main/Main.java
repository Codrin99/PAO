package main;

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        //Companie
        companie IKEA = new companie("Bucuresti, Strada lamaitei nr. 4");

        //Curier
        curier FanCurier = new curier("FanCurier");

        //Angajat
        angajat Marius = new angajat("Marius", "FanCurier");
        if (Marius.getFirma() == FanCurier.getNume()) {
            FanCurier.addAngajat();
        }

        //ADD angajat in service
        service.addAngajat(Marius);

        //Colet
        colet cutie = new colet("Brassov, Strada Decebal nr.3", "Bucuresti, Strada lamaitei nr. 4", "14:30", " Urziceni", 5, 863, 1, "Marius");
        if (cutie.getNumeLivrator() == Marius.getNume()) {
            Marius.addNrLivrari();
            Marius.addkmParcrusi(279);
        }

        //Adaug coletul in service
        service.addColet(cutie);

        //Masina
        masina Dacia = new masina("B 05 ADT", "Diesel", "Marius");

        //Foaie de parcrus
        foaieDeParcurs foaie = new foaieDeParcurs("Bucuresti", "Brasov", 5, 1, "B 05 ADT", "Diesel", "Marius");

        //Client
        client George = new client("Brasob, Strada Decebal nr.3", "20.04.2020", 863);

        //Printing
        foaie.printFoaie();

        //Printing from service and then remove colet
        service.printAngajat(Marius);
        service.printColete();
        service.removeColet(cutie);
        service.printColete();
    }
}