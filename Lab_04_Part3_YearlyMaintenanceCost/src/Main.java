import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double costSpring;
        double costSummer;
        double costFall;
        double costWinter;
        double totalCost;



        System.out.println("Please enter maintenance for Spring: ");
        costSpring = scan.nextDouble();
        System.out.println("Please enter maintenance for Summer: ");
        costSummer = scan.nextDouble();
        System.out.println("Please enter maintenance for Fall: ");
        costFall = scan.nextDouble();
        System.out.println("Please enter maintenance for Winter: ");
        costWinter = scan.nextDouble();
        totalCost = costSpring + costSummer + costFall + costWinter;
        System.out.println("Your total cost for the year is: $" + totalCost + ".");

    }
}