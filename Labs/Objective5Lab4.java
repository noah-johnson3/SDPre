import java.util.Scanner;

public class Objective5Lab4{

  public static void main(String[] args) {

    Scanner numGenerator = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int number = numGenerator.nextInt();

    if (number % 2 == 0){
      System.out.println("The number is even");
    } else if (number % 2 == 1){
      System.out.println("The number is odd");
    }
  }
}
