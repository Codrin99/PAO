import pachet.Person;
import pachet.Room;
import pachet.Subject;


public class Pb4 {
    public static void main(String[] args) {
        Person P1 = new Person("John", "Doe", "24", 1123444L, "teacher");
        Person P2 = new Person("Jane", "Roe", "56", 2233444L, "teacher");

        Room R1 = new Room("12A", "normal", 3);
        Room R2 = new Room("12B", "tech", 7);

        Subject ob1 = new Subject(R1, P1, 22);
        Subject ob2 = new Subject(R2, P2, 33);

        ob1.print();
        ob2.print();
    }
}
