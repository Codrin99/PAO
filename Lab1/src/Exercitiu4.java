import java.util.Scanner;

public class Exercitiu4 {
    static void factorial( int n){
        int fact = 1;
        for(int i=2; i<=n; i++)
            fact *= i;
        System.out.println("Factorialul numarului " + n + " este: " + fact);
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("n = ");
        String read = myInput.nextLine();
        int n = Integer.parseInt(read);
    factorial(n);
    }
}
