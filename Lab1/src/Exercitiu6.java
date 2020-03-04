import java.util.Scanner;

public class Exercitiu6 {
    static int fibonacci( int n){
        int fibo[] = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;
        for( int i = 2; i < n; i++){
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo[n - 1];
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("n = ");
        String read = myInput.nextLine();
        int n = Integer.parseInt(read);

        System.out.println("Elementul " + n + " al secventei Fibonacci este: " + fibonacci(n));
    }
}
