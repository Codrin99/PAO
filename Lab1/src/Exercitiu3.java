import java.util.Scanner;

public class Exercitiu3 {
    static void suma( int n){
        //Nu am inteles  daca trebuia multipli de 3 si de 5 separat sau multipli lor comuni
        int sum = 0;
        for(int i=0; i<=n; i++){
            if(i%3 == 0 || i%5 == 0){
                sum += i;
            }
        }
        System.out.println("Suma este: " + sum);
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("n = ");
        String read = myInput.nextLine();
        int n = Integer.parseInt(read);

        suma(n);
    }
}
