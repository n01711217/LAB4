package LAB4;
import java.util.Scanner;

public class factorialcalculator {
    public static void main(String[] args) {
        int number = 20;
        long factorial = 1;
        for(int i = 1; i <= number; ++i)
        {
            factorial *= i;
        }
        System.out.printf("bbb factorial number of  %d = %d", number, factorial);
        Scanner reader = new Scanner(System.in);
System.out.println( " factorial answer : ");
int n = reader.nextInt();
reader.close();
    }
}