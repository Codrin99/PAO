import pachet.Person;

public class Pb2 {
    public static void main(String [] args){
        Person P1 = new Person("John", "Doe", "24", 1123444L, "student");
        Person P2 = new Person("Jane", "Roe", "56", 2233444L, "teacher");
        P1.print();
        P2.print();
    }
}
