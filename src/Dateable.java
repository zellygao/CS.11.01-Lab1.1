import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        int minage = 7 + (age/2);
        System.out.println(age + "-year olds should date someone who is at least " + minage +  " years old");
    }
}
