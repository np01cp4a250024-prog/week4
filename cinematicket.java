import java.util.Scanner;

/**
 * Write a description of class cinematicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class cinematicket
{ 
    public static void main(String[] args){
    
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter movie language (Nepali/Hindi/English): ");
        String language = sc.nextLine();

        System.out.print("Do you have a student ID? (yes/no): ");
        String student = sc.nextLine();

        System.out.print("Is it a festival day? (yes/no): ");
        String festival = sc.nextLine();

        double price;

        if (age <= 12) {
            price = 150;
        } else if (age <= 59) {
            price = 250;
        } else {
            price = 200;
        }

        if (language.equals("hindi")) {
            price += 50;
        } else if (language.equals("english")) {
            price += 100;
        } else if (!language.equals("nepali")) {
            System.out.println("Invalid language!");
            return;
        }
        
        if (student.equals("yes")) {
            price = price - (price * 0.20);
        }

        if (festival.equals("yes")) {
            price = price - (price * 0.15);
        }

        System.out.println("Ticket Price" + price);
    }
}