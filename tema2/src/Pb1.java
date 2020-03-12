import java.util.Scanner;

public class Pb1 {
    public static void main(String[] args)
    {
        int[] grades = new int[20];
        Scanner scanner = new Scanner(System.in);
        int sum = 0, i;
        for(i = 0; i <  grades.length; i++)
        {
            System.out.print("Enter grade: ");
            int value = scanner.nextInt();
            if(value == -1)
            {
                break;
            }
            else
            {
                grades[i] = value;
                sum += value;
            }
        }
        System.out.println("The grades average is:" + sum / i);
    }
}