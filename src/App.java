import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = ac.nextInt();
        Scanner xc = new Scanner(System.in);
        System.out.print("Enter your grade: ");
        float grade = xc.nextFloat();
        System.out.println("Your name is "+ name );
        System.out.println("Your age is "+ age +" year old");
        System.out.println("Your mmr is "+ grade +" MMR");
        sc.close();
        ac.close();
        xc.close();
    }
}
