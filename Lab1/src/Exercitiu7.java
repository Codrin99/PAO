import java.util.Scanner;

public class Exercitiu7 {
    static boolean prim( int n){
        for(int i=2; i*i<=n; i++){
            if( n%i == 0 ){
                return false;
            }
        }
        return true;
    }
    static int factorPrim( int n){
        for( int i = n/2; i >= 2; i--){
            if( prim(i) == true && n%i == 0){
                return i;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.print("n = ");
        String read = myInput.nextLine();
        int n = Integer.parseInt(read);

        System.out.println("Cel mai mare factor prim a lui " + n + " este: " + factorPrim(n));
    }
}
