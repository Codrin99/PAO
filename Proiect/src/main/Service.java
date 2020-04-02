package main;

import java.lang.String;
import java.util.*;

public class Service {
    Set<colet> colete;
    List<angajat> angajati;

    public Service() {
        System.out.println("Service started!");
        colete = new HashSet<>();
        angajati = new ArrayList<>();
    }

    public void addColet(colet c) {
        colete.add(c);
    }

    public void removeColet(colet c) {
        colete.remove(c);
    }

    public void printColet(colet c) {
        c.printColet();
    }

    public void printColete() {
        int exista = 0;
        for(colet c: this.colete) {
            c.printColet();
            exista = 1;
        }
        if( exista == 0){
            System.out.println("Nu exista colete");
        }
    }

    public void addAngajat(angajat a) {
        this.angajati.add(a);
    }

    public void removeAngajat (angajat c) {
        this.angajati.remove(c);
    }

    public void printAngajat(angajat a) {
        a.printAngajat();
    }

    public void printAngajati() {
        for(angajat a: this.angajati) {
            a.printAngajat();
        }
    }

}
