import java.util.Scanner;

public class Exercitiu2 {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("First integer: ");
        String read = myInput.nextLine();
        int firstInt = Integer.parseInt(read);

        System.out.print("Second integer: ");
        read = myInput.nextLine();
        int secondInt = Integer.parseInt(read);

        if( firstInt == secondInt ){
            System.out.println(firstInt + " == " + secondInt);
            System.out.println(firstInt + " <= " + secondInt);
            System.out.println(firstInt + " => " + secondInt);
        }
        else{
            System.out.println(firstInt + " != " + secondInt);
            if (firstInt < secondInt){
                System.out.println(firstInt + " < " + secondInt);
                System.out.println(firstInt + " <= " + secondInt);
            }
            else{
                System.out.println(firstInt + " > " + secondInt);
                System.out.println(firstInt + " => " + secondInt);
            }
        }
    }
}
