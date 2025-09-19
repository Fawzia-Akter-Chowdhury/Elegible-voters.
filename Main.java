//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter number of people (N)  : ");
    int N = sc. nextInt();
    int [] A = new int[N] ;
        System.out.println ( "Enter the ages of people :  ");
    for (int i =0 ; i < N ; i++)
    {
        A[i] = sc.nextInt();
    }
        System.out.println ( "Enter minimum age required to vote (X): ");
    int X = sc.nextInt();
    int count = 0 ;

    for (int age : A)
    {
        if (age >= X )
        {
            count++;
        }
    }
        System.out.println ( "Number of elegible voters : " + count);
    sc.close();
    }
}