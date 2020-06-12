package main;

public class User {
    int id;
    private String nume;

    public User(int id, String nume){
        this.id = id;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public int getId() {
        return id;
    }
}
