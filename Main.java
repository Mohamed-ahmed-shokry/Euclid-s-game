import java.util.Scanner;

public class Main {

    // calc the greatest commen division 
    static int Gcd(int a, int b){
        if (a == 0)
            return b;
        return Gcd(b % a, a);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        int gcb;
        int totalNum;

        // take the input form user
        System.out.println("please, enter the first number: ");
        num1 = input.nextInt();
        System.out.println("please, enter the second number: ");
        num2 = input.nextInt();

        gcb = Gcd(num1, num2);

        // calc the number of numbers
        if (num1 > num2)
            totalNum = num1 / gcb;
        else
            totalNum = num2 / gcb;

        // determine the winner
        if (totalNum % 2 == 0)
            System.out.println("\nSecond person is win\n");
        else
            System.out.println("\nFisrt person is win\n");

        // close the scannner 
        input.close();
    }
}
