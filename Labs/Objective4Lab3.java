import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {

    int birthYear, age, currentYear;
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");
    age = input.nextInt();
    birthYear = (currentYear = 2022) - (age);
    System.out.println("You were born in " + birthYear);
    input.close();
  }
}
