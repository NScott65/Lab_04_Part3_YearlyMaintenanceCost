import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variable
        int initBal = 5000;
        double apr;
        double RATE = .17;
        double month1;
        double month2;
        double month1Two;
        double month2Two;
        double apr2;

        apr = RATE / 12;
        month1 = apr * initBal;
        month1Two = initBal + month1;
        System.out.println("Your balance after one month is: $" + month1Two + ".");
        apr2 = RATE / 11;
        month2 = month1Two * apr2;
        month2Two = month2 + month1Two;
        System.out.println("Your balance after two months is: $" + month2Two + ".");

    }
}