import java.sql.SQLOutput;
import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        System.out.println(age + "-year olds should read at least " + (100 - age) + "pages before giving up on a book");
    }
}
