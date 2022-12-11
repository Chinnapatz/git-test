import java.util.Scanner;

public class Buycom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();
        if (budget > 15000) {
            System.out.print("You can buy it");
        }
        sc.close();
    }
 
}
