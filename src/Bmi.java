import java.util.Scanner;

public class Bmi {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nickname: ");
        String name = sc.next();
        Scanner ac = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        int weight = ac.nextInt();
        Scanner xc = new Scanner(System.in);
        System.out.print("Enter your height: ");
        float height = xc.nextFloat();
        float bmi = weight/(height*height);
        System.out.println("Your name is "+ name );
        System.out.println("Your BMI is "+ bmi );
        sc.close();
        ac.close();
        xc.close();
    }
}
