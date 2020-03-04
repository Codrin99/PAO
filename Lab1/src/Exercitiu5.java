import java.util.Scanner;

public class Exercitiu5 {
    static void prim( int n){
        for(int i=2; i*i<=n; i++){
            if( n%i == 0 ){
                System.out.println("Numarul " + n + " NU este numar prim!");
                return;
            }
        }
        System.out.println("Numarul " + n + " este numar prim!");
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("n = ");
        String read = myInput.nextLine();
        int n = Integer.parseInt(read);
        prim(n);
    }
}
